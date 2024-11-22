package com.fer.practica1jpa.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fer.practica1jpa.model.dto.RegistroClienteDTO;
import com.fer.practica1jpa.model.entities.Registro;

@Component
@Mapper(componentModel = "spring")
public interface RegistroClienteMapper {
    @Autowired
    RegistroClienteMapper INSTANCE = Mappers.getMapper(RegistroClienteMapper.class);

    @Mapping(target = "cliente.registroCliente", ignore = true)
    RegistroClienteDTO registroClienteToRegistroClienteDTO(Registro registroCliente);

    @Mapping(target = "cliente.registros", ignore = true)
    Registro registroClienteDTOToRegistroCliente(RegistroClienteDTO registroClienteDTO);
}
