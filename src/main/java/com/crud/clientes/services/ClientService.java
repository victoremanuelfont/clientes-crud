package com.crud.clientes.services;

import com.crud.clientes.dto.ClientDTO;
import com.crud.clientes.entities.Client;
import com.crud.clientes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;


    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        ClientDTO dto = new ClientDTO(client)
        return dto;
    }









}
