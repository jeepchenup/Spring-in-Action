package com.springinaction.runtimeInject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MySystem {

    private String name;

    private String time;

    private int count;

    public MySystem(@Value("#{ systemProperties['os.name']}") String name,
                    @Value("#{systemProperties['os.version']}") String time) {
        this.name = name;
        this.time = time;
//        this.count = Integer.parseInt(number);
    }

    @Override
    public String toString() {
        return "class name : " + name + " - time : " + time + " - count : " + count;
    }
}
