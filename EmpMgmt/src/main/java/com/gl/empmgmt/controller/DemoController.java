package com.gl.empmgmt.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/hello")
	public String sayhello(Model model) {
		model.addAttribute("serverDate",new Date());
		
		return "helloworld";
		
		
	}

}
