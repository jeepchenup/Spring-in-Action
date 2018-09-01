package com.springinaction.profile;

@org.springframework.context.annotation.Profile("Dev")
public class DevProfile implements Profile{
    public void say() {
        System.out.println("It's Dev.");
    }
}
