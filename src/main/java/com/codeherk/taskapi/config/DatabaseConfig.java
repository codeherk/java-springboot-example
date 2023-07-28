package com.codeherk.taskapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {
    @Autowired
    private Environment environment;
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername(environment.getProperty("mysql.user"));
        dataSource.setPassword(environment.getProperty("mysql.password"));
        dataSource.setUrl(
                "jdbc:mysql://"+environment.getProperty("mysql.host")+":"+environment.getProperty("mysql.port")+"/"+
                        environment.getProperty("mysql.database")+"?createDatabaseIfNotExist=true"
        );

        return dataSource;
    }
}
