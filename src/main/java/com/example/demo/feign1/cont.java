package com.example.demo.feign1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class cont {
	@Autowired
	IssueClient client;
	@GetMapping("/iss")
	public List<Issue> getIssue() {
		return client.getIssue();
	}

}

