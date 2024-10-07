package com.fer.practica1jpa.model.mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fer.practica1jpa.model.entities.Empleado;

import com.fer.practica1jpa.model.dto.EmpleadoDTO;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmpleadoMapper {

    @Autowired
    private ModelMapper modelMapper;

    public EmpleadoDTO toDto(Empleado empleado) {
        return modelMapper.map(empleado, EmpleadoDTO.class);
    }

    public List<EmpleadoDTO> toDtoList(List<Empleado> empleados) {
        return empleados.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Empleado fromDto(EmpleadoDTO empleadoDTO) {
        return modelMapper.map(empleadoDTO, Empleado.class);
    }
}