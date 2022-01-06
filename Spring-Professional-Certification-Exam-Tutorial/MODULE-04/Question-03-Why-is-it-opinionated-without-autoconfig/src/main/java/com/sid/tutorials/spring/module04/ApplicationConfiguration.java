package com.sid.tutorials.spring.module04;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
/* @EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class}) */
@EnableTransactionManagement
public class ApplicationConfiguration {
}
