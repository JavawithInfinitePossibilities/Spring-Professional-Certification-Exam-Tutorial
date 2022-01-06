package com.sid.tutorials.spring.module01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module01.stereotypes.controller.TaxInformationController;
import com.sid.tutorials.spring.module01.stereotypes.ds.Article;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Autowired
	private Article article;

	@Test
	void test() {
		TaxInformationController taxInformationController = context.getBean(TaxInformationController.class);
		taxInformationController.printTaxInformation(article);
	}

}
