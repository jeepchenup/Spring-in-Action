package com.springaop.aop_spring_2_aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 定义一个全局的切面，覆盖到每个层级
 */
@Aspect
public class SystemArchitecture {

    // web 层
    @Pointcut("within(com.springaop.web..*)")
    public void inWebLayer() {

    }

    // service 层
    @Pointcut("within(com.springaop.service..*)")
    public void inServiceLayer() {

    }

    // dao 层
    @Pointcut("within(com.springaop.dao..*)")
    public void inDaoLayer() {

    }

    // service 实现，注意这里指的是方法实现，其实通常也可以使用 bean(*ServiceImpl)
    @Pointcut("execution(* com.springaop.service.*.*(..))")
    public void businessService() {
        System.out.println("businessService ---------");
    }

    // dao 实现
    @Pointcut("execution(* com.springaop..dao.*.*(..))")
    public void dataAccessOperation() {

    }
}
