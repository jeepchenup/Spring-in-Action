package com.springinaction.runtimeInject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    String name;

    String sex;

    public Teacher(@Value("${name}") String name, @Value("${sex}") String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return " name : " + name + " - sex : " + sex;
    }
}
