package com.crud.clientes.controller;

import com.crud.clientes.dto.ClientDTO;
import com.crud.clientes.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ClientService service;

    public ResponseEntity<ClientDTO> findById(Long id){
        ClientDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }







}
