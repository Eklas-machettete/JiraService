package com.example.demo.feign1;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;



@FeignClient(url="https://jsonplaceholder.typicode.com",name="ISSUE-CLIENT",configuration = FeignClientConfiguration.class)
public interface IssueClient {

	@GetMapping("/issue")
	public List<Issue> getIssue();
	
}