package com.ogmatech.springbootmangodbapi.controller;

import com.ogmatech.springbootmangodbapi.model.Client;
import com.ogmatech.springbootmangodbapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("/client/create")
    public Client createClient(@RequestBody Client client){
        return clientService.createClient(client);
    }

    @GetMapping("/client/read/{id}")
    public Client readClientById(@PathVariable("id") String clientId){
        return clientService.readClientById(clientId);

    }

    @GetMapping("/client/read/all")
    public List<Client> readAllClient(){
        return clientService.readAllClient();
    }

    @PutMapping("/client/update")
    public Client updateClientById(@RequestBody Client client){
        return clientService.updateClientById(client);

    }

    @DeleteMapping("/client/delete/{id}")
    public Boolean deleteClient(@PathVariable("id") String clientId){
        return clientService.deleteClientById(clientId);
    }
}
