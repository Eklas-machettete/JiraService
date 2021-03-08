package com.example.demo.entities;

import java.util.ArrayList;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice.This;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Description {
	  private String type;
	  private float version;
	  ArrayList<String> content = new ArrayList<String>();
      
	 
	}
	