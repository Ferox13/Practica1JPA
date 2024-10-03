package com.fer.practia1jpa.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fer.practia1jpa.model.entities.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientesRepository extends JpaRepository<Cliente, Long> {
    
}