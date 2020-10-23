package com.fiserv.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/api/user")
public class UserController {

	@GetMapping(value = "/get")
	public String login() {
		
		return "Hello world";
	}
	
	@PostMapping(value = "/hello")
	public String post(@RequestBody Model request) {
		
		return request.getName();
	}
	
	// http://localhost:8888/api/user/get
	//http://localhost:8888/api/user/hello

	


}
