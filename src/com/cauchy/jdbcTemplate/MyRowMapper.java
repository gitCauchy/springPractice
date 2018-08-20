package com.cauchy.jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MyRowMapper implements RowMapper<Juser>{
	public Juser mapRow(ResultSet rs,int num)throws SQLException {
		String username = rs.getString("username");
		String password = rs.getString("password");
		Juser juser = new Juser();
		juser.setUsername(username);
		juser.setPassword(password);
		return juser;
	}
	
}
