package com.usdj.springboot.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @program: springboot
 * @description: SpringBootApplication
 * @author: JerryDeng
 * @create: 2019-03-07 11:04
 **/
@SpringBootApplication
@ComponentScan(basePackages = {"com.usdj.springboot.course.controller","com.usdj.springboot.course.dao"})
public class CourseApplication {
	public static void main(String[] args) {
		SpringApplication.run(CourseApplication.class, args);
	}
}
