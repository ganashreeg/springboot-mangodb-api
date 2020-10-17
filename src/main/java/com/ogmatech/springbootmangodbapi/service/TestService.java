package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Test;

import java.util.List;

public interface TestService {

    Test createTest(Test test);

    Test readTestById(String id);

    List<Test> readAllTest();

    Test updateTestById(Test test);

    Boolean deleteTestById(String id);

}
