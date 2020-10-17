package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Client;
import com.ogmatech.springbootmangodbapi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.insert(client);
    }

    @Override
    public Client readClientById(String id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public List<Client> readAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client updateClientById(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Boolean deleteClientById(String id) {
        clientRepository.deleteById(id);
        return true;
    }
}
