package com.ogmatech.springbootmangodbapi.repository;

import com.ogmatech.springbootmangodbapi.model.Organization;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends MongoRepository<Organization,String> {
}
