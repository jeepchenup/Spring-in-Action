package com.springaop;

import com.springaop.aop_spring_1_2.DebugInterceptor;
import com.springaop.model.User;
import com.springaop.service.OrderService;
import com.springaop.service.UserService;
import com.springaop.service.impl.UserServiceImpl;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
//        testSpring_1_2_Advice();
//        testSpring_1_2_Advisor();
//        testInterceptor();
//        test_1_2_BeanNameAutoProxy();
        test_1_2_DefaultAdvisorAutoProxy();
    }

    public static void testSpring_1_2_Advice() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_Advice.xml");

        // 我们这里要取 AOP 代理：userServiceProxy
        UserService userService = (UserService) context.getBean("userServiceProxy");
        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();

        OrderService orderService = (OrderService) context.getBean("orderServiceProxy");
        orderService.createOrder("Steven", "iPhone");
        orderService.queryOrder("Steven");
    }

    public static void testSpring_1_2_Advisor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_Advisor.xml");

        //获取 AOP 代理
        UserService userService = (UserService) context.getBean("userServiceProxy");
        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();

        //获取 AOP 代理
        OrderService orderService = (OrderService) context.getBean("orderServiceProxy");
        orderService.createOrder("Steven", "iPhone");
        orderService.queryOrder("Steven");
    }

    public static void testInterceptor() {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new UserServiceImpl());
        proxyFactory.addAdvice(new DebugInterceptor());

        Object proxy = proxyFactory.getProxy();

        UserService userService = (UserService)proxy;
        userService.createUser("Tom", "Cruise", 55);
    }

    public static void test_1_2_BeanNameAutoProxy() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_BeanNameAutoProxy.xml");

        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();

        orderService.createOrder("Steven", "iPhone");
        orderService.queryOrder("Steven");
    }

    public static void test_1_2_DefaultAdvisorAutoProxy() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring_1_2_DefaultAdvisorAutoProxy.xml");
        UserService userService = context.getBean(UserService.class);
        OrderService orderService = context.getBean(OrderService.class);

        userService.createUser("Tom", "Cruise", 55);
        userService.queryUser();

        orderService.createOrder("Steven", "iPhone");
        orderService.queryOrder("Steven");
    }
}
