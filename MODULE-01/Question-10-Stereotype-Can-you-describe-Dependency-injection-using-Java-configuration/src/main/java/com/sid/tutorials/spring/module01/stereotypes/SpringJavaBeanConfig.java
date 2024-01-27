/**
 * 
 */
package com.sid.tutorials.spring.module01.stereotypes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sid.tutorials.spring.module01.stereotypes.ds.Article;

/**
 * @author Lenovo
 *
 */
@Configuration
public class SpringJavaBeanConfig {
	@Bean
	public Article article() {
		return new Article(5);
	}
}
