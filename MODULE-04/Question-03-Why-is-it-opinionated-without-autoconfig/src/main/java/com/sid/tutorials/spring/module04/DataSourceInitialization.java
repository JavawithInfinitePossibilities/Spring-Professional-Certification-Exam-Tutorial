package com.sid.tutorials.spring.module04;

import javax.sql.DataSource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

@Component
public class DataSourceInitialization implements InitializingBean {
	@Autowired
	private DataSource dataSource;

	@Override
	public void afterPropertiesSet() throws Exception {
		new ResourceDatabasePopulator(new ClassPathResource("data.sql")).execute(dataSource);
	}
}
