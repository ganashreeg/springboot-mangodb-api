package com.ogmatech.springbootmangodbapi.zexperiment;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JavacoreController {

    @GetMapping("/exp/get-name")
    public String getName(){
        return "hello";
    }

    @GetMapping("/exp/display/{name}")
    public String getNameFromUrl(@PathVariable("name") String nameFromUrl){
        return nameFromUrl;
    }

    @GetMapping("/exp/get-javacore-model")
    public JavacoreModel getJavacoreModel(){
        JavacoreModel javacoreModel = new JavacoreModel();
        return javacoreModel;
    }

    @GetMapping("/exp/get-javacore-model-override")
    public JavacoreModel getJavacoreModelOverride(){
        JavacoreModel javacoreModel = new JavacoreModel();

        javacoreModel._id = "123";
        javacoreModel.name = "rajath";
        javacoreModel.age = 31;

        return javacoreModel;
    }

    @GetMapping("/exp/get-all-javacore-model")
    public List<JavacoreModel> getJavacoreModelList(){

        List<JavacoreModel> javacoreModelList = new ArrayList<>();

        JavacoreModel javacoreModel = new JavacoreModel();
        JavacoreModel javacoreModel1 = new JavacoreModel();
        JavacoreModel javacoreModel2 = new JavacoreModel();

        javacoreModel._id = "1";
        javacoreModel.name = "name";
        javacoreModel.age = 10;

        javacoreModel1._id = "2";
        javacoreModel1.name = "name1";
        javacoreModel1.age = 11;

        javacoreModel2._id = "3";
        javacoreModel2.name = "name2";
        javacoreModel2.age = 12;

        javacoreModelList.add(javacoreModel);
        javacoreModelList.add(javacoreModel1);
        javacoreModelList.add(javacoreModel2);

        return javacoreModelList;
    }

    @PostMapping("/exp/save-javacore-model")
    public JavacoreModel saveJavacoreModel(@RequestBody JavacoreModel javacoreModel){
        javacoreModel.age = javacoreModel.age+50;
        return javacoreModel;
    }

    @PostMapping("/exp/save-javacore-model-list")
    public List<JavacoreModel> saveJavacoreModelList(@RequestBody List<JavacoreModel> javacoreModelList){
        return javacoreModelList;
    }

}
