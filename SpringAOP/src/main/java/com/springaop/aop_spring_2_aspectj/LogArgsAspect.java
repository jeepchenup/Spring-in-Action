package com.springaop.aop_spring_2_aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class LogArgsAspect {

    private boolean trace = true;

    public void setTrace(boolean trace) {
        this.trace = trace;
    }

    @Before("com.springaop.aop_spring_2_aspectj.SystemArchitecture.businessService()")
    public void logArgs(JoinPoint joinPoint){
        if(trace) {
            System.out.println("[@AspectJ] 方法执行前，打印入参：" + Arrays.toString(joinPoint.getArgs()));
        }
    }
}
