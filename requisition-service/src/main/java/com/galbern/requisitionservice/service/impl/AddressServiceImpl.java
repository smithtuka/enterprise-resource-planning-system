package com.galbern.requisitionservice.service.impl;

import com.galbern.requisitionservice.domain.Address;
import com.galbern.requisitionservice.repository.AddressRepository;
import com.galbern.requisitionservice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public Address create(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address find(Long id) {
        return addressRepository.findById(id).get();
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public void update(Long id, Address address) {
        Address address1 = addressRepository.findById(id).get();
        address1.setStreet(address.getStreet());
        address1.setCity(address.getCity());
        address1.setState(address.getState());
        address1.setZip(address.getZip());
        addressRepository.save(address1);
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

    @Override
    public Address findById(Long id) {
        return addressRepository.findById(id).get();
    }
}

