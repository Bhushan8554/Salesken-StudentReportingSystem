package com.salesken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.salesken.service.StudentService;

@RestController
public class AppController {

	@Autowired(required = false)
	StudentService s;
	
	public String show() {
		return "hii	;";
	}
}
