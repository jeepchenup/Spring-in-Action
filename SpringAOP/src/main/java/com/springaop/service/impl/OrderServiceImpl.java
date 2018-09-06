package com.springaop.service.impl;

import com.springaop.model.Order;
import com.springaop.service.OrderService;

public class OrderServiceImpl implements OrderService {

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
