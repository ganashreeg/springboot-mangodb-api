package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Test;
import com.ogmatech.springbootmangodbapi.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Autowired
    TestRepository testRepository;

    @Override
    public Test createTest(Test test) {
        return testRepository.insert(test);
    }

    @Override
    public Test readTestById(String id) {
        return testRepository.findById(id).get();
    }

    @Override
    public List<Test> readAllTest() {
        return testRepository.findAll();
    }

    @Override
    public Test updateTestById(Test test) {
        return testRepository.save(test);
    }

    @Override
    public Boolean deleteTestById(String id) {
        testRepository.deleteById(id);
        return true;
    }
}
