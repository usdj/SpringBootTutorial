package com.usdj.springboot.course.controller;

import com.usdj.springboot.course.dao.UserMapper;
import com.usdj.springboot.course.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: mybaits_annotation
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-07 14:36
 **/
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/querybyid")
	@ResponseBody
	User queryById(int id) {
		return userMapper.queryById(id);
	}

	@RequestMapping("/queryall")
	@ResponseBody
	List<User> queryAll() {
		return userMapper.queryAll();
	}

	@RequestMapping("/add")
	@ResponseBody
	String add(User user) {
		return userMapper.add(user) == 1 ? "success" : "failed";
	}

	@RequestMapping("/updatebyid")
	@ResponseBody
	String updateById(User user) {
		return userMapper.updateById(user) == 1 ? "success" : "failed";
	}

	@RequestMapping("/delbyid")
	@ResponseBody
	String delById(int id) {
		return userMapper.delById(id) == 1 ? "success" : "failed";
	}
}
