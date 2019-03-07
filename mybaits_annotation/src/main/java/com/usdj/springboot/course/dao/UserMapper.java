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
	@Select("SELECT * FROM user WHERE id = #{id}")
	User queryById(@Param("id") int id);

	@Select("SELECT * FROM user")
	List<User> queryAll();

	@Insert({"INSERT INTO user(name,age) VALUES(#{name},#{age})"})
	int add(User user);

	@Delete("DELETE FROM user WHERE id = #{id}")
	int delById(int id);

	@Update("UPDATE user SET name=#{name},age=#{age} WHERE id = #{id}")
	int updateById(User user);

}
