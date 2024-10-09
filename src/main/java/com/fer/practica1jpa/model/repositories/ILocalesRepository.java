package com.fer.practica1jpa.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fer.practica1jpa.model.entities.Local;
import java.util.List;
import java.util.Optional;

public interface ILocalesRepository extends JpaRepository<Local, Long> {
    public List<Local> findByAforoBetween(int min, int max);

    public Optional<Local> findById(Long id);
    
    public Optional<Local> findByNombre(String nombre);

}
