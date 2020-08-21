package com.galbern.requisitionservice.service;


import com.galbern.requisitionservice.domain.Customer;

import java.util.List;

public interface CustomerService {
    public Customer create(Customer customer);
    public Customer find(Long id);
    public List<Customer> findAll();
    public void update(Long id, Customer customer);
    public void delete(Long id);

    Customer findById(Long id);
}
