package com.fer.practia1jpa.model.services;

import org.springframework.stereotype.Service;
import com.fer.practia1jpa.model.repositories.IClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ClientesService {
    @Autowired
    IClientesRepository clientesRepository;

}
