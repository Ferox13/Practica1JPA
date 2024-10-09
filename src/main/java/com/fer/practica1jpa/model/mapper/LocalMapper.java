package com.fer.practica1jpa.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.fer.practica1jpa.model.dto.LocalDTO;
import com.fer.practica1jpa.model.entities.Local;

@Mapper(componentModel = "spring", uses = {EmpleadoMapper.class})
public interface LocalMapper {
    LocalMapper INSTANCE = Mappers.getMapper(LocalMapper.class);

    @Mapping(target = "empleados.local", ignore = true)
    LocalDTO localToLocalDTO(Local local);

    @Mapping(target = "empleados.local", ignore = true)
    Local localDTOToLocal(LocalDTO localDTO);
}
