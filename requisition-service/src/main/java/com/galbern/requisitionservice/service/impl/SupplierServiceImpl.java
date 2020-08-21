package com.galbern.requisitionservice.service.impl;

import com.galbern.requisitionservice.domain.Supplier;
import com.galbern.requisitionservice.repository.SupplierRepository;
import com.galbern.requisitionservice.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;
    @Override
    public Supplier create(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier find(Long id) {
        return supplierRepository.findById(id).get();
    }

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public void update(Long id, Supplier supplier) {
        Supplier supplier1 = supplierRepository.findById(id).get();
        supplier1.setName(supplier.getName());
        supplier1.setItems(supplier.getItems());
        supplierRepository.save(supplier1);
    }

    @Override
    public void delete(Long id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public Supplier findById(Long id) {
        return supplierRepository.findById(id).get();
    }
}
