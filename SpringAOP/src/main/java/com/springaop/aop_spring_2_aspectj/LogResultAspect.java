package com.springaop.aop_spring_2_aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogResultAspect {
    private boolean trace = false;

    public void setTrace(boolean trace) {
        this.trace = trace;
    }

    @AfterReturning(pointcut = "com.springaop.aop_spring_2_aspectj.SystemArchitecture.businessService()",
                    returning = "result")
    public void logResult(Object result) {
        if(trace) {
            System.out.println("[@AspectJ]返回值：" + result);
        }
    }
}
