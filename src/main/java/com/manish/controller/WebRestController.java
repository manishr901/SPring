package com.manish.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

	@RequestMapping("/api/hi")
	public String hi(){
		return "hello from java";
	}
}
