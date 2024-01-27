package com.sid.tutorials.spring.module01;

import java.security.MessageDigest;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sid.tutorials.spring.module01.beans.SpringBean1;
import com.sid.tutorials.spring.module01.beans.SpringBean2;
import com.sid.tutorials.spring.module01.beans.SpringBean3;
import com.sid.tutorials.spring.module01.beans.SpringBean3A;
import com.sid.tutorials.spring.module01.beans.SpringBean3B;
import com.sid.tutorials.spring.module01.beans.SpringBean3C;

@Configuration
public class ApplicationConfig {
    @Bean(initMethod = "init")
    @Autowired
    public SpringBean1 springBean1(SpringBean2 springBean2, SpringBean3 springBean3rd) {
        return new SpringBean1(springBean2, springBean3rd);
    }

    @Bean(destroyMethod = "destroy")
    public SpringBean2 springBean2() {
        return new SpringBean2();
    }

    @Bean(name = "springBean3rd")
    @Autowired
    public SpringBean3 springBean3A(MessageDigest messageDigest) {
        return new SpringBean3A(messageDigest);
    }

    @Bean(name = {"springBean4th", "springBeanNo4", "springBeanNoFour"})
    public SpringBean3 springBean3B() {
        return new SpringBean3B();
    }

    @Bean
    public SpringBean3 springBean3C() {
        return new SpringBean3C();
    }

    @Bean
    public MessageDigest messageDigest() {
        return DigestUtils.getSha384Digest();
    }
}
