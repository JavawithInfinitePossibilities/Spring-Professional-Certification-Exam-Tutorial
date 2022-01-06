package com.sid.tutorials.spring.module01.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AlternativeCurrenciesRepositoryAspect {
    @Before("this(com.sid.tutorials.spring.module01.bls.AlternativeCurrenciesRepository)")
    public void beforeThisCurrenciesRepository() {
        System.out.println("Before - this(AlternativeCurrenciesRepository)");
    }

    @Before("target(com.sid.tutorials.spring.module01.bls.AlternativeCurrenciesRepository)")
    public void beforeTargetCurrenciesRepository() {
        System.out.println("Before - target(AlternativeCurrenciesRepository)");
    }
}
