package com.galbern.requisitionservice.service;
import com.galbern.requisitionservice.domain.Supplier;

import java.util.List;

public interface SupplierService {
    public Supplier create(Supplier supplier);
    public Supplier find(Long id);
    public List<Supplier> findAll();
    public void update(Long id, Supplier supplier);
    public void delete(Long id);

    public Supplier findById(Long id);
}
