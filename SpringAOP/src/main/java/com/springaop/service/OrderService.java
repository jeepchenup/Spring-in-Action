package com.springaop.service;

import com.springaop.model.Order;

public interface OrderService {

    Order createOrder(String username, String product);

    Order queryOrder(String username);
}
