package com.ogmatech.springbootmangodbapi.repository;

import com.ogmatech.springbootmangodbapi.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client, String> {
}
