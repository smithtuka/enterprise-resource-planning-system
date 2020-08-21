package com.galbern.requisitionservice.repository;

import com.galbern.requisitionservice.domain.Supplier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends MongoRepository<Supplier, Long> {
}
