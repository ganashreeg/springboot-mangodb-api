package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Organization;
import com.ogmatech.springbootmangodbapi.repository.ClientRepository;
import com.ogmatech.springbootmangodbapi.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    OrganizationRepository organizationRepository;

    @Override
    public Organization createOrganization(Organization organization) { return organizationRepository.insert(organization); }

    @Override
    public Organization readOrganizationById(String id) { return organizationRepository.findById(id).get(); }

    @Override
    public List<Organization> readAllOrganization() { return organizationRepository.findAll(); }

    @Override
    public Organization updateOrganizationById(Organization organization) { return organizationRepository.save(organization); }

    @Override
    public Boolean deleteOrganization(String id) {
        organizationRepository.deleteById(id);
        return true;
    }
}
