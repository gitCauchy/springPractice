package com.cauchy.jdbcTemplate;

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
}
