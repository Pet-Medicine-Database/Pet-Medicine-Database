package com.petmed.petMedicineDatabaseWebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/examination")
public class ExaminationController {
	
	@RequestMapping("/list")
	public String listAnimals() {
		
		return "list-examination";
	}
	
	@RequestMapping("/showArrangementForm")
	public String showArrangementForm() {
		
		
		return "arrangement-form";
		
	}

}
