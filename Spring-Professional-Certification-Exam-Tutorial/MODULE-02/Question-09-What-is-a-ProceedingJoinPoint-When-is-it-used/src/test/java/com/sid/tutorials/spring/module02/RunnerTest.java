package com.sid.tutorials.spring.module02;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sid.tutorials.spring.module02.beans.TransactionHistoryServiceClient;

@SpringBootTest(classes = Runner.class)
class RunnerTest {

	@Autowired
	ApplicationContext context;

	@Test
	void test() {
		TransactionHistoryServiceClient transactionHistoryServiceClient = context
				.getBean(TransactionHistoryServiceClient.class);

		transactionHistoryServiceClient.saveTransactionData("A001", "amount=50", "private-key-5232");
	}

}
