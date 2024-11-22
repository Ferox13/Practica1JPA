package com.fer.practica1jpa.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.fer.practica1jpa.model.dto.ClienteDTO;
import com.fer.practica1jpa.model.dto.RegistroDTO;
import com.fer.practica1jpa.model.entities.Cliente;
import com.fer.practica1jpa.model.entities.Registro;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    @Mapping(target = "registros")
    ClienteDTO clienteToClienteDTO(Cliente cliente);

    @Mapping(target = "registros")
    Cliente clienteDTOToCliente(ClienteDTO clienteDTO);

   
}
