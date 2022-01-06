package com.sid.tutorials.spring.module05.controller;

import static com.sid.tutorials.spring.module05.utils.SleepUtil.SLEEP_TIME_SECONDS;
import static com.sid.tutorials.spring.module05.utils.SleepUtil.sleep;

import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sid.tutorials.spring.module05.ds.Person;

@Controller
public class Example11Callable {

	private Logger logger = LoggerFactory.getLogger(Example11Callable.class);

	// curl http://localhost:8080/example11A
	@GetMapping("/example11A")
	@ResponseBody
	public Callable<Person> example11A() {
		return () -> {
			logger.info(String.format("Pretending to run long operation for %d seconds in thread %s",
					SLEEP_TIME_SECONDS, Thread.currentThread().getName()));
			sleep();
			logger.info("Pretended long operation finished, returning value...");

			return new Person("John", "Doe");
		};
	}
}
