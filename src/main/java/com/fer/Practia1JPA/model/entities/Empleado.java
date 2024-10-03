package com.fer.Practia1JPA.model.entities;

import java.time.LocalDate;

import org.hibernate.annotations.Collate;

import com.fer.Practia1JPA.model.enumerated.Cargo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "apellido1", length = 55, nullable = false)
    private String apellido1;
    @Column(name = "apellido2", length = 55, nullable=true)
    private String apellido2;
    @Column(name = "fechaNacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate fechaNacimiento;
    @Column(name = "telefono",nullable = false)
    private Long telefono;
    @Enumerated
    @Column(name = "cargo", nullable = false, columnDefinition = "Enum('CAMARERO','SEGURIDAD','ENCARGADO')")
    private Cargo cargo;
    @ManyToOne(targetEntity = Local.class,fetch = FetchType.EAGER)
    private Local local;
   



}
