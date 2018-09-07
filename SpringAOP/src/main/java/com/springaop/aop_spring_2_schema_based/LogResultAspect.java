package com.springaop.aop_spring_2_schema_based;

public class LogResultAspect {
    public void logResult(Object result) {
        System.out.println("[schema-based]返回值：" + result);
    }
}
