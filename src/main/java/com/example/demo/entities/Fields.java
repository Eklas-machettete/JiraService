package com.example.demo.entities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Fields {
	  
	  Project project=new Project();
	  private String summary;
	  Description description=new Description();
	  Issuetype issuetype=new Issuetype();
	 
	}
	