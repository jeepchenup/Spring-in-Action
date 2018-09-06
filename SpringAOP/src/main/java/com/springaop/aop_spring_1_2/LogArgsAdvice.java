package com.springaop.aop_spring_1_2;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogArgsAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before the methode : " + method.getName() + ", param list : " + Arrays.toString(objects));
    }
}
