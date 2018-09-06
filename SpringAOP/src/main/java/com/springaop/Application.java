package com.springaop;

import com.springaop.service.OrderService;
import com.springaop.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
//        testSpring_1_2_Advice();
        testSpring_1_2_Advisor();
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
}
