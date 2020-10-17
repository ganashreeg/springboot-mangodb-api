package com.ogmatech.springbootmangodbapi.repository;

import com.ogmatech.springbootmangodbapi.model.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends MongoRepository<Test, String> {
}
