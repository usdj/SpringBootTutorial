package com.usdj.springboot.course.model;

/**
 * @program: mybaits_annotation
 * @description: User
 * @author: JerryDeng
 * @create: 2019-03-07 14:32
 **/
public class User {

	private int id;

	private String name;

	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
