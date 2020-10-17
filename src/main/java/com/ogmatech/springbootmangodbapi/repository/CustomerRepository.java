package com.ogmatech.springbootmangodbapi.repository;

import com.ogmatech.springbootmangodbapi.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
