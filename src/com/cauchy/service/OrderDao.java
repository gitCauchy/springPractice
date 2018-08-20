package com.cauchy.service;

import org.springframework.jdbc.core.JdbcTemplate;

public class OrderDao {
	JdbcTemplate jdbcTemplate = new JdbcTemplate();

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void lessMoney() {
		String sqlForLessMoney = "update account set money = money - ? where username = ?";
		jdbcTemplate.update(sqlForLessMoney,1000,"Cauchy");
	}
	public void moreMoney() {
		String sqlForMoreMoney = "update account set money = money + ? where username = ?";
		jdbcTemplate.update(sqlForMoreMoney,1000,"Lucy");
	}
}
