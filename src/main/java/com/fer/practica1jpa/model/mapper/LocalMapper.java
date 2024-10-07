package com.fer.practica1jpa.model.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fer.practica1jpa.model.dto.LocalDTO;
import com.fer.practica1jpa.model.entities.Local;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LocalMapper {

    @Autowired
    private ModelMapper modelMapper;

    public LocalDTO toDto(Local local) {
        return modelMapper.map(local, LocalDTO.class);
    }

    public List<LocalDTO> toDtoList(List<Local> locals) {
        return locals.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Local fromDto(LocalDTO localDTO) {
        return modelMapper.map(localDTO, Local.class);
    }
}
