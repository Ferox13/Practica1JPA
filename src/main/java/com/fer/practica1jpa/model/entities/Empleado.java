package com.fer.practica1jpa.model.entities;

import java.time.LocalDate;
import com.fer.practica1jpa.model.enumerated.Cargo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="empleados")
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
    @Enumerated(EnumType.STRING)
    @Column(name = "cargo", nullable = false, columnDefinition = "Enum('CAMARERO','SEGURIDAD','ENCARGADO')")
    private Cargo cargo;
    @ManyToOne(targetEntity = Local.class,fetch = FetchType.EAGER)
    private Local local;

    
    public Empleado() {
    }


    public Empleado(Long id, String apellido1, String apellido2, LocalDate fechaNacimiento, Long telefono, Cargo cargo,
            Local local) {
        this.id = id;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.cargo = cargo;
        this.local = local;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getApellido1() {
        return apellido1;
    }


    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }


    public String getApellido2() {
        return apellido2;
    }


    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public Long getTelefono() {
        return telefono;
    }


    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }


    public Cargo getCargo() {
        return cargo;
    }


    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }


    public Local getLocal() {
        return local;
    }


    public void setLocal(Local local) {
        this.local = local;
    }
   
    



}
