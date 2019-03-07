package com.usdj.springboot.course.dao.course2;

import com.usdj.springboot.course.model.course2.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: multidata_source_annotation
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-07 17:48
 **/
@Mapper
@Component
public interface BlogMapper {

	@Select("SELECT * FROM blog")
	List<Blog> queryAll();
}
