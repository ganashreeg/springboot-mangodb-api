package com.ogmatech.springbootmangodbapi.zexperiment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavacoreCommonController {

    @GetMapping("/exp/getter-setter/test")
    public JavacoreOneModel testOne(){
        JavacoreOneModel javacoreOneModel = new JavacoreOneModel();
        javacoreOneModel.set_id("123");
        javacoreOneModel.setName("name1");
        javacoreOneModel.setAge(23);
        return javacoreOneModel;
    }

    @GetMapping("/exp/constructor/test")
    public JavacoreTwoModel testTwo(){
        JavacoreTwoModel javacoreTwoModel = new JavacoreTwoModel("1234", "name two", 31);
        return javacoreTwoModel;
    }

    @GetMapping("/exp/lombok/test")
    public JavacoreThreeModel testThree(){
        JavacoreThreeModel javacoreThreeModel = new JavacoreThreeModel("1234", "name two", 31);
        return javacoreThreeModel;
    }
}


