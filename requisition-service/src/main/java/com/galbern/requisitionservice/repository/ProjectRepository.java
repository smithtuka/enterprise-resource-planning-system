package com.galbern.requisitionservice.repository;

import com.galbern.requisitionservice.domain.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends MongoRepository<Project, Long> {
}
