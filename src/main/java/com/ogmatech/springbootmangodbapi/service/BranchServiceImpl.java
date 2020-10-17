package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Branch;
import com.ogmatech.springbootmangodbapi.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService{

    @Autowired
    BranchRepository branchRepository;

    @Override
    public Branch createBranch(Branch branch) {
        return branchRepository.insert(branch);
    }

    @Override
    public Branch readBranchById(String id) {
        return branchRepository.findById(id).get();
    }

    @Override
    public List<Branch> readAllBranch() {
        return branchRepository.findAll();
    }

    @Override
    public Branch updateBranchById(Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public Boolean deleteBranchById(String id) {
        branchRepository.deleteById(id);
        return null;
    }
}
