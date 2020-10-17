package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Organization;

import java.util.List;

public interface OrganizationService {

    Organization createOrganization(Organization organization);

    Organization readOrganizationById(String Id);

    List<Organization> readAllOrganization();

    Organization updateOrganizationById(Organization organization);

    Boolean deleteOrganization(String Id);

}
