package com.usdj.springboot.course.dao;

import com.usdj.springboot.course.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: mybaits_annotation
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-07 14:34
 **/
@Mapper
@Component
public interface UserMapper {

	User queryById(@Param("id") int id);

	List<User> queryAll();

	int add(User user);

	int delById(int id);

	int updateById(User user);

}
