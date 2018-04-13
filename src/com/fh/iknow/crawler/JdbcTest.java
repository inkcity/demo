package com.fh.iknow.crawler;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcTest {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcTest(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public int count() {
		Integer count = jdbcTemplate.queryForObject("select count(*) from user", Integer.class);
		return count;
	}
}
