package com.sid.tutorials.spring.module01.beans;

import org.springframework.stereotype.Component;

@Component
class Battery {
	void supplyPower() {
		System.out.println("Supplying power");
	}
}
