package com.fer.practia1jpa.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fer.practia1jpa.model.dto.LocalDTO;
import com.fer.practia1jpa.model.entities.Local;
import com.fer.practia1jpa.model.mapper.GenericMapper;
import com.fer.practia1jpa.model.repositories.ILocalesRepository;

@Service
public class LocalesService {
    @Autowired
    private ILocalesRepository localRepository;

    public LocalesService(ILocalesRepository localRepository) {
        this.localRepository = localRepository;
    }

    public List<LocalDTO> findByAforoBetween(int min, int max) {
        List<Local> local = localRepository.findByAforoBetween(min, max);
        if (local.isEmpty()) {
            throw new RuntimeException("No locales found");
        }
        return GenericMapper.mapToDtoList(local, LocalDTO.class);

    }

    public LocalDTO findById(long id) {
        Optional<Local> localOptional = localRepository.findById(id);
        if (!localOptional.isPresent()) {
            throw new RuntimeException("No locales found");
        }
        return GenericMapper.mapToDto(localOptional.get(), LocalDTO.class);

    }

}
