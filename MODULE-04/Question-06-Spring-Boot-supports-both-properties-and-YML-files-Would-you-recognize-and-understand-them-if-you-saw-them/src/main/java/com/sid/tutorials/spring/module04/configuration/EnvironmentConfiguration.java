package com.sid.tutorials.spring.module04.configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EnvironmentConfiguration {
    private String name;
    private String url;
}
