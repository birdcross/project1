package com.project1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Project1Controller {
	// http://localhost/
 	@RequestMapping("/")
	public  String   home() {
		return "home";      // home.jsp
	}
}
