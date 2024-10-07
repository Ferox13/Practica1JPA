package com.fer.practia1jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fer.practia1jpa.model.dto.ClienteDTO;
import com.fer.practia1jpa.model.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
    @Autowired
    ClienteService clientesService;

    public ClientesController(ClienteService clientesService) {
        this.clientesService = clientesService;
    }

    @GetMapping("/all")
    List<ClienteDTO> all() {
        try {
            return clientesService.findAll();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Agentes no encontrados", e);
        }
    }

}
