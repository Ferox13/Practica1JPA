package com.fer.practica1jpa.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fer.practica1jpa.model.entities.Empleado;

public interface IEmpleadosRepository extends JpaRepository<Empleado,Long>{

}
