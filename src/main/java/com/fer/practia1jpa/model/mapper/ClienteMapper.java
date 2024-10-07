package com.fer.practia1jpa.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fer.practia1jpa.model.dto.ClienteDTO;
import com.fer.practia1jpa.model.entities.Cliente;

@Component
public class ClienteMapper {

    @Autowired
    private ModelMapper modelMapper;

    public ClienteDTO toDto(Cliente cliente) {
        return modelMapper.map(cliente, ClienteDTO.class);
    }

    public List<ClienteDTO> toDtoList(List<Cliente> Clientes) {
        return Clientes.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }


    public Cliente fromDto(ClienteDTO ClienteDTO) {
        return modelMapper.map(ClienteDTO, Cliente.class);
    }

}
