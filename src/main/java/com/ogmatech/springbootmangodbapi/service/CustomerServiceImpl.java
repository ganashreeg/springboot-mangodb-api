package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Customer;
import com.ogmatech.springbootmangodbapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.insert(customer);
    }

    @Override
    public Customer readCustomerById(String id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> readAllCustomer() {return customerRepository.findAll();}

    @Override
    public Customer updateCustomerById(Customer customer) {return customerRepository.save(customer);}

    @Override
    public Boolean deleteCustomerById(String id){
        customerRepository.deleteById(id);
        return true;
    }
}
