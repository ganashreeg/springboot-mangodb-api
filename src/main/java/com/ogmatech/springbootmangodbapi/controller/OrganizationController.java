package com.ogmatech.springbootmangodbapi.controller;

import com.ogmatech.springbootmangodbapi.model.Client;
import com.ogmatech.springbootmangodbapi.model.Organization;
import com.ogmatech.springbootmangodbapi.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrganizationController {

    @Autowired
    OrganizationService organizationService;

    @PostMapping("/organization/create")
    public Organization createOrganization(@RequestBody Organization organization){
        return organizationService.createOrganization(organization);
    }

    @GetMapping("/organization/read/{id}")
    public Organization readOrganizationtById(@PathVariable("id") String organizationId){
        return organizationService.readOrganizationById(organizationId);

    }

    @GetMapping("/organization/read/all")
    public List<Organization> readAllOrganization(){
        return organizationService.readAllOrganization();
    }

    @PutMapping("/organization/update")
    public Organization updateOrganizationById(@RequestBody Organization organization){
        return organizationService.updateOrganizationById(organization);

    }

    @DeleteMapping("/organization/delete/{id}")
    public Boolean deleteOrganization(@PathVariable("id") String organizationId){
        return organizationService.deleteOrganization(organizationId);
    }
}
