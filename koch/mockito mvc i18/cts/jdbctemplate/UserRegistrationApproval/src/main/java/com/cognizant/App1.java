package com.cognizant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cognizant.dao.AdminDaoImpl;
import com.cognizant.dao.UserDaoImpl;

@SpringBootApplication
public class App1 {

	public static void main(String[] args) {
		SpringApplication.run(App1.class,args);
	}

	@Bean
	public UserDaoImpl getLogindao() {
		UserDaoImpl dao = new UserDaoImpl();
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		dao.setJdbcTemplate(jdbcTemplate);
		return dao;
	}
	
	@Bean
	public AdminDaoImpl getAdmindao() {
		AdminDaoImpl dao = new AdminDaoImpl();
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		dao.setJdbcTemplate(jdbcTemplate);
		return dao;
	}
	

	@Bean
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setPassword("mysql");
		ds.setUrl("jdbc:mysql://localhost:3306/db1");
		ds.setUsername("root");
		return ds;
	}
	
}
