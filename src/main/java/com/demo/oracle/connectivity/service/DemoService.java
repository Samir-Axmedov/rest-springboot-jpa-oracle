package com.demo.oracle.connectivity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.oracle.connectivity.entity.Demo;
import com.demo.oracle.connectivity.repository.DemoRepository;

@Service
public class DemoService {

	@Autowired
	private DemoRepository demoRepository;

	public Optional<Demo> getUserDetailsById(int id) {
		return demoRepository.findByDemoId(id);
	}

	public Optional<Demo> getUserDetailsByName(String name) {
		return demoRepository.findByDemoName(name);
	}

	public List<Demo> getAllDetailsForUsers(Demo demo) {
		return demoRepository.findAll();
	}

}
