package com.springaop.service;

import com.springaop.model.Order;

public class OrderServiceImpl implements OrderService{

    private static Order order = null;

    @Override
    public Order createOrder(String username, String product) {
        order = new Order();
        order.setUsername(username);
        order.setProduct(product);
        return order;
    }

    @Override
    public Order queryOrder(String username) {
        return order;
    }
}
