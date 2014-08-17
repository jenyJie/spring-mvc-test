package com.yeepay.g3.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		System.out.println("hello world!");
		String hello = "test springmvn 马洁";
		Map map = new HashMap();
		map.put("map1", "测试1");
		map.put("map2", "测试2");
		map.put("map3", "测试3");
		
//		return new ModelAndView("/jsp/welcome","result",hello);
		return new ModelAndView("/jsp/welcome","mapp",map);
	}

}
