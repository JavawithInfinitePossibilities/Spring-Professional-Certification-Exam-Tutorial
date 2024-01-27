package com.sid.tutorials.spring.module05.controller;

import static com.sid.tutorials.spring.module05.utils.SleepUtil.sleep;

import java.util.Observable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sid.tutorials.spring.module05.ds.Person;

import io.reactivex.subjects.PublishSubject;

@Controller
public class Example15Reactive {

	@Autowired
	private TaskExecutor taskExecutor;

	// curl -D - http://localhost:8080/example15
	@GetMapping("/example15")
	@ResponseBody
	public PublishSubject<Object> example15() {
		PublishSubject<Object> subject = PublishSubject.create();

		taskExecutor.execute(() -> {
			sleep();

			subject.onNext(new Person("John", "Doe"));
			subject.onNext(new Person("William", "Anderson"));

			subject.onComplete();
		});

		return subject;
	}
}
