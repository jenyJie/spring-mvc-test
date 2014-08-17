package com.yeepay.g3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnnotationController{

	@RequestMapping(value="/user/addUser",method=RequestMethod.POST)
	public ModelAndView addUser(){
		String str1= "addUser小洁";
		return new ModelAndView("/jsp/annotation","result",str1);
	}
	
	@RequestMapping(value="/user/delUser",method=RequestMethod.GET)
	public ModelAndView delUser(){
		String str2 = "delUser";
		return new ModelAndView("/jsp/annotation");
		
	}
	
	@RequestMapping(value="/user/toUser",method=RequestMethod.GET)
	public ModelAndView toUser(){
		return new ModelAndView("/jsp/annotation");
		
	}
}
