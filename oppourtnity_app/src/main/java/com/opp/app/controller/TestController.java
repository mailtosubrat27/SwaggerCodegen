package com.opp.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api1")
public class TestController {
	
	@GetMapping("/msg")
	public String getMsg() {
		return "Hi..";
		
	}

}
