package com.fer.practica1jpa.model.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fer.practica1jpa.model.dto.ClienteDTO;
import com.fer.practica1jpa.model.dto.EmpleadoDTO;
import com.fer.practica1jpa.model.entities.Cliente;
import com.fer.practica1jpa.model.entities.Empleado;
import com.fer.practica1jpa.model.mapper.EmpleadoMapper;
import com.fer.practica1jpa.model.repositories.IEmpleadosRepository;

@Service
public class EmpleadosService {

    @Autowired
    private IEmpleadosRepository empleadosRepository;
    @Autowired
    private EmpleadoMapper empleadoMapper;

    public EmpleadosService(IEmpleadosRepository empleadosRepository, EmpleadoMapper empleadoMapper) {
        this.empleadosRepository = empleadosRepository;
        this.empleadoMapper = empleadoMapper;
    }
    /*
     * public EmpleadoDTO findById(long id) {
     * Optional<Empleado> empleadoOptional = empleadosRepository.findById(id);
     * if (!empleadoOptional.isPresent()) {
     * throw new RuntimeException("No locales found");
     * }
     * return empleadoMapper.toDto(empleadoOptional.get());
     * 
     * }
     */

    public List<EmpleadoDTO> findAll() {
        List<Empleado> empleados = empleadosRepository.findAll();
        if (empleados.isEmpty()) {
            throw new RuntimeException("No empleado found");
        }
        return empleados.stream()
                .map(empleadoMapper::empleadoToEmpleadoDTO)
                .collect(Collectors.toList());
    }

}
