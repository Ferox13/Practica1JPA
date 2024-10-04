package com.fer.practia1jpa.model.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fer.practia1jpa.model.entities.Cliente;
import com.fer.practia1jpa.model.enumerated.Categoria;

import org.springframework.stereotype.Repository;

@Repository
public interface IClientesRepository extends JpaRepository<Cliente, Long> {

    public List<Cliente> findByCategoria(Categoria categoria);

    @Query("SELECT c FROM Cliente c WHERE c.categoria = :categoria AND FUNCTION('YEAR', CURRENT_DATE) - FUNCTION('YEAR', c.fechaNacimiento) > :edad")
    List<Cliente> findByCategoriaAndCalculatedEdadGreaterThan(@Param("categoria") Categoria categoria,
            @Param("edad") int edad);
}