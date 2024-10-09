package com.fer.practica1jpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fer.practica1jpa.model.dto.EmpleadoDTO;
import com.fer.practica1jpa.model.entities.Empleado;
import com.fer.practica1jpa.model.mapper.EmpleadoMapper;
import com.fer.practica1jpa.model.services.EmpleadosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/empleados")
public class EmpleadosController {

    @Autowired
    private EmpleadosService empleadoService;

    @Autowired
    private EmpleadoMapper empleadoMapper;

    @GetMapping
    public List<EmpleadoDTO> getAllEmpleados() {
        return empleadoService.findAll();
        
    }

    
}
