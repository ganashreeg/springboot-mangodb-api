package com.ogmatech.springbootmangodbapi.zexperiment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MongoCrudController {

    @Autowired
    MongoCrudRepository mongoCrudRepository;

    @PostMapping("/exp/mongocrud/create")
    public MongoCrudModel createMongoCrud(@RequestBody MongoCrudModel mongoCrudModel){
        MongoCrudModel mongoCrudModelNew = new MongoCrudModel();
        mongoCrudModelNew = mongoCrudRepository.insert(mongoCrudModel);
        return mongoCrudModelNew;
    }

    @GetMapping("/exp/mongocrud/read/{id}")
    public MongoCrudModel readMongoCrud(@PathVariable("id") String mongoCrudId){
        MongoCrudModel mongoCrudModel = new MongoCrudModel();
        mongoCrudModel = mongoCrudRepository.findById(mongoCrudId).get();
        return mongoCrudModel;
    }

    @GetMapping("/exp/mongocrud/read/all")
    public List<MongoCrudModel> readAllMongoCrud(){
        List<MongoCrudModel> mongoCrudModelList = new ArrayList<>();
        mongoCrudModelList = mongoCrudRepository.findAll();
        return mongoCrudModelList;
    }

    @PutMapping("/exp/mongocrud/update")
    public MongoCrudModel updateAgeMongoCrud(@RequestBody MongoCrudModel mongoCrudModel){
        MongoCrudModel mongoCrudModelDatabase = new MongoCrudModel();
        MongoCrudModel mongoCrudModelUpdated = new MongoCrudModel();

        mongoCrudModelDatabase = mongoCrudRepository.findById(mongoCrudModel.get_id()).get();

        mongoCrudModelDatabase.setAge(mongoCrudModel.getAge());

        mongoCrudModelUpdated = mongoCrudRepository.save(mongoCrudModelDatabase);

        return mongoCrudModelUpdated;
    }

    @DeleteMapping("/exp/mongocrud/delete/{id}")
    public Boolean deleteMongoCurd(@PathVariable("id") String mongoCrudId){
        mongoCrudRepository.deleteById(mongoCrudId);
        return true;
    }
}
