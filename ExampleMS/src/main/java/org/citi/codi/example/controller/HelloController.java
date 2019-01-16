package org.citi.codi.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value=("/hello"),method=RequestMethod.GET)
	public String all() {
		return "hello from 'hello-service'";
	}

}
