package com.example.demo.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {
	@RequestMapping(method = RequestMethod.GET,path="/hello-world")
	public String helloWorld() {	
		return "Hello, World";
	}
	
	@RequestMapping(method = RequestMethod.GET,path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {	
		return new HelloWorldBean("Mr. Bean", 10);
	}	
//	@RequestMapping(method = RequestMethod.GET,path="/hello-world-bean/{name}")
//	public HelloWorldBean helloWorldBeanPathVariable( @PathVariable String name) {	
//		return new HelloWorldBean(String.format("Hello, World %s", name));
//	}
}
