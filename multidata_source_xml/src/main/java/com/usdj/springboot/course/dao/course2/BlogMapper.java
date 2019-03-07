package com.usdj.springboot.course.dao.course2;

import com.usdj.springboot.course.model.course2.Blog;

import java.util.List;

/**
 * @program: multidata_source_annotation
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-07 17:48
 **/


public interface BlogMapper {

	List<Blog> queryAll();
}
