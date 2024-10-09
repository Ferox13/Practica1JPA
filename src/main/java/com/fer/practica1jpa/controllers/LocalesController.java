package com.fer.practica1jpa.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fer.practica1jpa.model.dto.LocalDTO;
import com.fer.practica1jpa.model.entities.Local;
import com.fer.practica1jpa.model.mapper.LocalMapper;
import com.fer.practica1jpa.model.services.LocalesService;

@RestController
@RequestMapping("/locales")
public class LocalesController {
    @Autowired
    private LocalesService localService;

    @Autowired
    private LocalMapper localMapper;

    @GetMapping
    public List<LocalDTO> getAllLocales() {
       return localService.findAll();
    }
      
}
