package com.example.taller6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnectionTest implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("DatabaseConnectionTest is running...");
        String sql = "SELECT 1 FROM DUAL";
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println("Connection Test Result: " + result);
    }
}
