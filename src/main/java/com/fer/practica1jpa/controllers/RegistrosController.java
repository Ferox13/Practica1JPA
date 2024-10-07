package com.fer.practica1jpa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fer.practica1jpa.model.services.RegistrosService;

@Controller
public class RegistrosController {
     @Autowired
     RegistrosService RegistrosService;
    
}
