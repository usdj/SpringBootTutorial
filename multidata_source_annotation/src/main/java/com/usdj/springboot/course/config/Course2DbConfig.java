package com.usdj.springboot.course.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @program: multidata_source_annotation
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-07 17:57
 **/
@Configuration
@MapperScan(basePackages = "com.usdj.springboot.course.dao.course2", sqlSessionFactoryRef = "course2SqlSessionFactory")
public class Course2DbConfig {

	@Bean(name = "course2DataSource")
	@ConfigurationProperties(prefix = "course2DataSource")
	public DataSource course2DataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "course2SqlSessionFactory")
	public SqlSessionFactory course2SqlSessionFactory(@Qualifier("course2DataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		return bean.getObject();
	}

}
