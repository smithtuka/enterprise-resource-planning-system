package com.galbern.requisitionservice.service;

import com.galbern.requisitionservice.domain.Address;

import java.util.List;

public interface AddressService {
    public Address create(Address address);
    public Address find(Long id);
    public List<Address> findAll();
    public void update(Long id, Address address);
    public void delete(Long id);

    Address findById(Long id);
}
