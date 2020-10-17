package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Branch;

import java.util.List;

public interface BranchService {

    Branch createBranch(Branch branch);

    Branch readBranchById(String id);

    List<Branch> readAllBranch();

    Branch updateBranchById(Branch branch);

    Boolean deleteBranchById(String id);

}
