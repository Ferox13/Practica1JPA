package com.fer.practia1jpa.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fer.practia1jpa.model.repositories.IEmpleadosRepository;

@Service
public class EmpleadosService {

    @Autowired
    private IEmpleadosRepository empleadosRepository;

    public EmpleadosService(IEmpleadosRepository empleadosRepository){
        this.empleadosRepository=empleadosRepository;
    }

}
