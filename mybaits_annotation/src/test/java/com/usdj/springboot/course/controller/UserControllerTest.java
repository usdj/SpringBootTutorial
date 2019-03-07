package com.usdj.springboot.course.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * @program: mybaits_annotation
 * @description: UserControllerTest
 * @author: JerryDeng
 * @create: 2019-03-07 15:12
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void addUserTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/user/add?name=gerry&age=25").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string(equalTo("success")));
	}

	@Test
	public void updateUserTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/user/updatebyid?name=gerry&age=26&id=1").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string(equalTo("success")));
	}

	@Test
	public void queryUserByIdTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/user/querybyid?id=1").accept(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk());
	}

	@Test
	public void queryAllTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/user/queryall").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}

	@Test
	public void delUserByIdTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/user/delbyid?id=1").accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect(content().string(equalTo("success")));
	}
}
