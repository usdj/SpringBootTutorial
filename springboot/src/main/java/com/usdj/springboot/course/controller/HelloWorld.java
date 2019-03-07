package com.usdj.springboot.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springboot
 * @description: HelloWorldController
 * @author: JerryDeng
 * @create: 2019-03-07 11:07
 **/
@Controller
public class HelloWorld {
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		return "HelloWorld!";
	}
}
