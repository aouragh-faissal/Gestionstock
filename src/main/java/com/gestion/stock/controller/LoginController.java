package com.gestion.stock.controller;


import java.text.DateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	

	  @GetMapping("login")
	    public String index(Locale locale, Model model) {
		  
		  logger.info("Welcome home the client locale is {}.", locale);
		  Date date = new Date();
		  DateFormat  dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		  String formatteddate = dateFormat.format(date);
		  
		  model.addAttribute("servertime",formatteddate);
	        return "login";
	    }
}
