package com.fer.practia1jpa.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fer.practia1jpa.model.repositories.IRegistroRepository;

@Service
public class RegistrosService {
    @Autowired
    private IRegistroRepository registroRepository;

    public RegistrosService(IRegistroRepository registroRepository) {
        this.registroRepository = registroRepository;
    }
    

}
