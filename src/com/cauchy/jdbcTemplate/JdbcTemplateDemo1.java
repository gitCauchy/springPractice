package com.cauchy.jdbcTemplate;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateDemo1 {
	@Test
	public void add() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		
		// 创建一个JdbcTemplate
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		// 调用方法来实现操作：
		String sqlForInsert = "insert into user values(?,?)";
		// 影响的行数
		int rows = jdbcTemplate.update(sqlForInsert,"Cauchy","password");
		System.out.println(rows);
	}
	@Test
	public void update() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlForUpdate = "update user set password = ? where name = ?";
		jdbcTemplate.update(sqlForUpdate,"password1","Cauchy");
	}
	@Test
	public void delete() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sqlForUpdate = "delete from user where name = ?";
		int rows = jdbcTemplate.update(sqlForUpdate,"Lucy");
		System.out.println(rows);
	}
}
