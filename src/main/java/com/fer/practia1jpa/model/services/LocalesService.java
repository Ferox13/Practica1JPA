package com.fer.practia1jpa.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fer.practia1jpa.model.repositories.ILocalesRepository;

@Service
public class LocalesService {
    @Autowired
    ILocalesRepository localRepository;

}
