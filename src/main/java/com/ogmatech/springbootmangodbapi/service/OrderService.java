package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Order;

import java.util.List;

public interface OrderService {

    Order createOrder(Order Order);

    Order readOrderById(String id);

    List<Order> readAllOrder();

    Order updateOrderById(Order order);

    Boolean deleteOrderById(String id);

}
