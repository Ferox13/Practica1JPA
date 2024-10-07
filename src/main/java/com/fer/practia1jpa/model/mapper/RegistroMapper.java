package com.fer.practia1jpa.model.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fer.practia1jpa.model.entities.Registro;

import com.fer.practia1jpa.model.dto.RegistroDTO;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RegistroMapper {

    @Autowired
    private ModelMapper modelMapper;

    public RegistroDTO toDto(Registro registro) {
        return modelMapper.map(registro, RegistroDTO.class);
    }

    public List<RegistroDTO> toDtoList(List<Registro> registros) {
        return registros.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Registro fromDto(RegistroDTO registroDTO) {
        return modelMapper.map(registroDTO, Registro.class);
    }
}
