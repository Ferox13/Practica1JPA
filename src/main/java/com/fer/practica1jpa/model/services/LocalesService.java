package com.fer.practica1jpa.model.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fer.practica1jpa.model.dto.LocalDTO;
import com.fer.practica1jpa.model.entities.Local;
import com.fer.practica1jpa.model.mapper.LocalMapper;
import com.fer.practica1jpa.model.repositories.ILocalesRepository;

@Service
public class LocalesService {
    @Autowired
    private ILocalesRepository localRepository;
    @Autowired
    private LocalMapper localMapper;

    public LocalesService(ILocalesRepository localRepository, LocalMapper localMapper) {
        this.localRepository = localRepository;
        this.localMapper = localMapper;
    }

    /*
     * public List<LocalDTO> findByAforoBetween(int min, int max) {
     * List<Local> local = localRepository.findByAforoBetween(min, max);
     * if (local.isEmpty()) {
     * throw new RuntimeException("No locales found");
     * }
     * return localMapper.toDtoList(local);
     * 
     * }
     * 
     * public LocalDTO findById(long id) {
     * Optional<Local> localOptional = localRepository.findById(id);
     * if (!localOptional.isPresent()) {
     * throw new RuntimeException("No locales found");
     * }
     * return localMapper.toDto(localOptional.get());
     * 
     * }
     * 
     * public LocalDTO findByNombre(String nombre) {
     * Optional<Local> localOptional = localRepository.findByNombre(nombre);
     * if (!localOptional.isPresent()) {
     * throw new RuntimeException("No locales found");
     * }
     * return localMapper.toDto(localOptional.get());
     * 
     * }
     */
    public List<LocalDTO> findAll() {
        List<Local> locales = localRepository.findAll();
        if (locales.isEmpty()) {
            throw new RuntimeException("No locales found");
        }
        return locales.stream()
                .map(localMapper::localToLocalDTO)
                .collect(Collectors.toList());
    }
}
