package com.ogmatech.springbootmangodbapi.controller;


import com.ogmatech.springbootmangodbapi.model.Customer;
import com.ogmatech.springbootmangodbapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/customer/create")
    public Customer createCustomer(@RequestBody Customer customer){
        return customerService.createCustomer(customer);
    }

    @GetMapping("/customer/read/{id}")
    public Customer readCustomerById(@PathVariable("id") String customerId){
        return customerService.readCustomerById(customerId);
    }

    @GetMapping("/customer/read/all")
    public List<Customer> readAllCustomer(){
        return customerService.readAllCustomer();
    }

    @PutMapping("/customer/update")
    public Customer updateCustomerById(@RequestBody Customer customer){
        return customerService.updateCustomerById(customer);
    }

    @DeleteMapping("/customer/delete/{id}")
    public Boolean deleteCustomer(@PathVariable("id") String customerId){
        return customerService.deleteCustomerById(customerId);
    }
}
