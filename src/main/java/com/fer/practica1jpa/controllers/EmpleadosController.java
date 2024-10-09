package com.fer.practica1jpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fer.practica1jpa.model.dto.ClienteDTO;
import com.fer.practica1jpa.model.dto.EmpleadoDTO;
import com.fer.practica1jpa.model.services.EmpleadosService;

@RestController
@RequestMapping("/empleados")

public class EmpleadosController {
    @Autowired
    EmpleadosService empleadosService;

    @GetMapping("/all")
    List<EmpleadoDTO> all() {
        try {
            return empleadosService.findAll();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Empleados no encontrados", e);
        }
    }

}
