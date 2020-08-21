package com.galbern.requisitionservice.repository;

import com.galbern.requisitionservice.domain.Stage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageRepository extends MongoRepository<Stage, Long> {
}
