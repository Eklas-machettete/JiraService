package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Description;
import com.example.demo.entities.Issue;
import com.example.demo.entities.Project;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
public class IssueController {
	/*
	 * @Autowired
	Issue issue;
	
	
	@GetMapping("/api")
	public Issue getIssue() {
		return issue;
		
	}
	
	@RequestMapping("/api1")
	public Issue createIssue(@RequestBody Issue issue) {
	    //ObjectMapper objectMapper=new ObjectMapper();
	    //Optional<Issue> optional=Optional.of(issue);
	  //  Issue is=issue;
	   System.out.println(issue.getFields());
	    return issue;
		
	}
	
	@Autowired
	  Project dc;
	
	@PostMapping("/api2")
	public Project createIssue1(@RequestBody Project issue) {
	  //ObjectMapper objectMapper=new ObjectMapper();
	  //Optional<Issue> optional=Optional.of(issue);
	  //  Issue is=issue;
		dc=issue;
	   System.out.println(dc.getKey());
	    return dc;
		
	}

	@GetMapping("/api3")

	public Project createIssue2() {
	    //ObjectMapper objectMapper=new ObjectMapper();
	    //Optional<Issue> optional=Optional.of(issue);
	  //  Issue is=issue;
	   System.out.println(dc.getKey());
	    return dc;
		
	}
	
	*/
	

	
	

}
