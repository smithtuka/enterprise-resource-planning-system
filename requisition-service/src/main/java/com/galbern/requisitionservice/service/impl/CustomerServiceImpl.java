package com.galbern.requisitionservice.service.impl;

import com.galbern.requisitionservice.domain.Customer;
import com.galbern.requisitionservice.repository.CustomerRepository;
import com.galbern.requisitionservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer find(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void update(Long id, Customer customer) {
        Customer customer1 = customerRepository.findById(id).get();
        customer1.setFirstName(customer.getFirstName());
        customer1.setLastName(customer.getLastName());
        customer1.setEmail(customer.getEmail());
        customer1.setPhoneNumber(customer.getPhoneNumber());
        customer1.setProject(customer.getProject());
        customerRepository.save(customer1);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }
}
