package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    Customer readCustomerById(String id);

    List<Customer> readAllCustomer();

    Customer updateCustomerById(Customer customer);

    Boolean deleteCustomerById(String id);

}
