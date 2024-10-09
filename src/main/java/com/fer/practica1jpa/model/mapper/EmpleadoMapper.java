package com.fer.practica1jpa.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.fer.practica1jpa.model.dto.EmpleadoDTO;
import com.fer.practica1jpa.model.entities.Empleado;

@Mapper(componentModel = "spring", uses = {LocalMapper.class})
public interface EmpleadoMapper {
    EmpleadoMapper INSTANCE = Mappers.getMapper(EmpleadoMapper.class);

    @Mapping(target = "local.empleados", ignore = true)
    EmpleadoDTO empleadoToEmpleadoDTO(Empleado empleado);

    @Mapping(target = "local.empleados", ignore = true)
    Empleado empleadoDTOToEmpleado(EmpleadoDTO empleadoDTO);
}