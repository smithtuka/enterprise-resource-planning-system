package com.galbern.requisitionservice.repository;

import com.galbern.requisitionservice.domain.Requisition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequisitionRepository extends MongoRepository<Requisition, Long> {
}
