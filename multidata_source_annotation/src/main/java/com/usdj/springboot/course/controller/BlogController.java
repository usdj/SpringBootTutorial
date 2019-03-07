package com.usdj.springboot.course.controller;

import com.usdj.springboot.course.dao.course2.BlogMapper;
import com.usdj.springboot.course.model.course2.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: multidata_source_annotation
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-07 17:59
 **/
@Controller
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	private BlogMapper blogMapper;

	@RequestMapping("/queryall")
	@ResponseBody
	List<Blog> queryAll() {
		return blogMapper.queryAll();
	}
}
