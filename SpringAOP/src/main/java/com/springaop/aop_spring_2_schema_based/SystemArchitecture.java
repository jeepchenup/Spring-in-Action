package com.springaop.aop_spring_2_schema_based;

import org.aspectj.lang.annotation.Pointcut;

public class SystemArchitecture {

    @Pointcut("within(com.springaop.web..*)")
    public void inWebLayer() {

    }

    @Pointcut("within(com.springaop.service..*)")
    public void inServiceLayer() {

    }

    @Pointcut("execution(* com.springaop.service.*.*(..))")
    public void businessService(){

    }
}
