package com.galbern.requisitionservice.repository;

import com.galbern.requisitionservice.domain.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemRepository extends MongoRepository<Item, Long> {
}
