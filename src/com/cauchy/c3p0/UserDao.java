package com.cauchy.c3p0;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void add() {
		String sqlForAdd = "insert into user values(?,?)";
		jdbcTemplate.update(sqlForAdd,"Wu","test");
	}
}
