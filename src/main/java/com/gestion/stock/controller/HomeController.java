package com.gestion.stock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("home")
	public String Home() {
		return "home";
	}
	
	@RequestMapping("blank")
	public String Blank() {
		return "blank";
	}
	

}
