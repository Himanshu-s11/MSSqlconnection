package com.mSsqlConnectionTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mSsqlConnectionTest.entity.Girls;

@SpringBootApplication
public class SpringMSsqlConnectionTestApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMSsqlConnectionTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM Girls";
		List<Girls> customers=jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Girls.class));
		customers.forEach(System.out::println);
	}

}
