package com.cauchy.jdbcTemplate;

import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateDemo2 {
	@Test
	public void query1() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlForQuery = "select count(*) from user";
		int count = jdbcTemplate.queryForObject(sqlForQuery, Integer.class);
		System.out.println(count);
	}
	@Test
	public void query2() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlForQuery2 = "select * from user where username = ?";
		Juser juser = jdbcTemplate.queryForObject(sqlForQuery2, new MyRowMapper(),"Cauchy");
		System.out.println(juser.getPassword());
	}
	@Test
	public void query3() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlForQuery3 = "select * from user";
		List<Juser> list = jdbcTemplate.query(sqlForQuery3, new MyRowMapper());
		System.out.println(list);
	}
}
