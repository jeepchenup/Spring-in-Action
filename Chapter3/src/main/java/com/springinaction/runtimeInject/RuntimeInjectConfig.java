package com.springinaction.runtimeInject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("/runtimeInject.properties")
public class RuntimeInjectConfig {

    @Autowired
    Environment environment;

    @Bean
    public Student student() {
        return new Student(environment.getProperty("name"), environment.getProperty("phone"), environment.getProperty("number"));
    }
}
