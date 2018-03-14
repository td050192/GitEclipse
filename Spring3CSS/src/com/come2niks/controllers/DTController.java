package com.come2niks.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class DTController {
	

	
	@RequestMapping(value = "/hello")
	public ModelAndView Hello()
	{
		/* This will load the myDatatable.jsp page */
		return new ModelAndView("hello");
		
	}

}
