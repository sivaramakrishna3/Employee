package com.siva.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EmployeeController {
	private static Logger _LOGGER = Logger.getLogger(EmployeeController.class);
	
	@RequestMapping(name="/login")
	public ModelAndView login(){
		_LOGGER.info("Enter the Login Controller");
		return null;
	}
	@RequestMapping(name="/registe")
	public ModelAndView register(){
		_LOGGER.info("Enter the register class");
		return null;
	}
	
}
