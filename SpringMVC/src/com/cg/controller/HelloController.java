package com.cg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Message;

@RestController
public class HelloController {

	@RequestMapping(value="/")
	public String sayHello() {

		return "Hello Spring Controller";

	}
	
	@RequestMapping(value="/rama")
	public Message sendMessage() {
		Message msg=new Message();
		msg.setText("Sri Rama Rajiyam");
		
		return msg;
	}

}
