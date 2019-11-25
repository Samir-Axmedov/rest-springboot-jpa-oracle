package com.demo.oracle.connectivity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.oracle.connectivity.entity.Demo;

@Repository
public interface DemoRepository extends JpaRepository<Demo, Integer> {

	@Query("select d from Demo d where d.id = :id")
	Optional<Demo> findByDemoId(@Param("id") int id);

	@Query("select d from Demo d where d.name = :name")
	Optional<Demo> findByDemoName(String name);
}
