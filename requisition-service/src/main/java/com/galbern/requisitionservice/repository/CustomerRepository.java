package com.galbern.requisitionservice.repository;

import com.galbern.requisitionservice.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long> {
}
