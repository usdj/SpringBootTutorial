package com.usdj.springboot.course.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @program: multidata_source_annotation
 * @description:
 * @author: JerryDeng
 * @create: 2019-03-07 17:49
 **/
@Configuration
@MapperScan(basePackages = "com.usdj.springboot.course.dao.course1", sqlSessionFactoryRef = "course1SqlSessionFactory")
public class Course1DbConfig {

	@Bean(name = "course1DataSource")
	@ConfigurationProperties(prefix = "course1DataSource")
	@Primary
	public DataSource course1DataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "course1SqlSessionFactory")
	@Primary
	public SqlSessionFactory course1SqlSessionFactory(@Qualifier("course1DataSource") DataSource dataSource) throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:conf/mybatis/mapper/course1/*.xml"));
		return bean.getObject();
	}
}
