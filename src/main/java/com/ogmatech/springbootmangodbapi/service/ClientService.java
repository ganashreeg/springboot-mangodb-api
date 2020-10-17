package com.ogmatech.springbootmangodbapi.service;

import com.ogmatech.springbootmangodbapi.model.Client;

import java.util.List;

public interface ClientService {

    Client createClient(Client client);

    Client readClientById(String id);

    List<Client> readAllClient();

    Client updateClientById(Client client);

    Boolean deleteClientById(String id);

}
