package com.ogmatech.springbootmangodbapi.controller;

import com.ogmatech.springbootmangodbapi.model.Branch;
import com.ogmatech.springbootmangodbapi.model.Client;
import com.ogmatech.springbootmangodbapi.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BranchController {

    @Autowired
    BranchService branchService;

    @PostMapping("/branch/create")
    public Branch createBranch(@RequestBody Branch branch){
        return branchService.createBranch(branch);
    }

    @GetMapping("/branch/read{id}")
    public Branch readBranchById(@PathVariable("id") String branchId) {
        return branchService.readBranchById(branchId);
    }

    @GetMapping("/branch/read/all")
    public List<Branch> readAllBranch(){
        return  branchService.readAllBranch();
    }

    @PutMapping("/branch/update")
    public Branch updateBranchById(@RequestBody Branch branch){
        return branchService.updateBranchById(branch);
    }

    @DeleteMapping("/branch/delete{id}")
    public Boolean deleteBranch(@PathVariable("id") String branchId){
        return branchService.deleteBranchById(branchId);
    }


}
