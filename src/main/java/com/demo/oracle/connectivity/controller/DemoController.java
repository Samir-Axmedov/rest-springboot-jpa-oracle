package com.demo.oracle.connectivity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.oracle.connectivity.entity.Demo;
import com.demo.oracle.connectivity.service.DemoService;

@RestController
@RequestMapping(value = "/details")
public class DemoController {

	@Autowired
	private DemoService demoService;

	@GetMapping(value = "/userId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Demo> getDetailsById(@PathVariable("id") int id) {
		return demoService.getUserDetailsById(id);
	}
	
	@GetMapping(value = "/userName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Demo> getDetailsbyName(@PathVariable("name") String name) {
		return demoService.getUserDetailsByName(name);
	}
	
	@GetMapping(value = "/allUserDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Demo> getAllDetails(Demo demo){
		return demoService.getAllDetailsForUsers(demo);
	}

}
