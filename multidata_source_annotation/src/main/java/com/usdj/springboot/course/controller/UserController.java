package com.usdj.springboot.course.controller;

import com.usdj.springboot.course.dao.course1.UserMapper;
import com.usdj.springboot.course.model.course1.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: multidata_source_annotation
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-07 18:01
 **/
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/queryall")
	@ResponseBody
	List<User> queryAll() {
		return userMapper.queryAll();
	}
}
