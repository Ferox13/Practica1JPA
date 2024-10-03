package com.fer.practia1jpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fer.practia1jpa.model.services.ClientesService;

@Controller
public class ClientesController {
    @Autowired
    ClientesService clientesService;

}
