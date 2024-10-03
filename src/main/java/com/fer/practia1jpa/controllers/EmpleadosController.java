package com.fer.practia1jpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fer.practia1jpa.model.services.EmpleadosService;

@Controller
public class EmpleadosController {
    @Autowired
    EmpleadosService empleadosService;
}
