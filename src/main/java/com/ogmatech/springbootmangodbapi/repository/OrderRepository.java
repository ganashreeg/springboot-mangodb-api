package com.ogmatech.springbootmangodbapi.repository;

import com.ogmatech.springbootmangodbapi.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
