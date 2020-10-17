package com.ogmatech.springbootmangodbapi.controller;

import com.ogmatech.springbootmangodbapi.model.Order;
import com.ogmatech.springbootmangodbapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/create/order")
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @GetMapping("/order/read/{id}")
    public Order readOrderById(@PathVariable("id")String orderId){
        return orderService.readOrderById(orderId);
    }

    @GetMapping("/order/read/all")
    public List<Order> readAllOrder(){
        return orderService.readAllOrder();
    }

    @PutMapping("/order/update")
    public Order updateOrderById(@RequestBody Order order){
        return orderService.updateOrderById(order);
    }

    @DeleteMapping("/order/delete/{id}")
    public Boolean deleteOrderById(@PathVariable("id")String orderId){
        return orderService.deleteOrderById(orderId);
    }

}
