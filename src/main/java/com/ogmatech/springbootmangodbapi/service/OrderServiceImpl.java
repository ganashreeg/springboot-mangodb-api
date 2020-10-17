package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Order;
import com.ogmatech.springbootmangodbapi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order createOrder(Order Order) {
        return orderRepository.insert(Order);
    }

    @Override
    public Order readOrderById(String id) {
        return orderRepository.findById(id).get();
    }

    @Override
    public List<Order> readAllOrder() {
        return orderRepository.findAll();
    }

    @Override
    public Order updateOrderById(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Boolean deleteOrderById(String id) {
        orderRepository.deleteById(id);
        return true;
    }
}
