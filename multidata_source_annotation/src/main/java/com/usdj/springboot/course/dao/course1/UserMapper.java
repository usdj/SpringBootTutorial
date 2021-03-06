package com.usdj.springboot.course.dao.course1;

import com.usdj.springboot.course.model.course1.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: multidata_source_annotation
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-07 17:43
 **/
@Mapper
@Component
public interface UserMapper {

	@Select("SELECT * FROM user")
	List<User> queryAll();
}
