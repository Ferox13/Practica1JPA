package com.fer.practica1jpa.model.dto;

import java.time.LocalDate;

import org.mapstruct.Mapper;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fer.practica1jpa.model.enumerated.Cargo;


public class EmpleadoDTO {
    private Long id;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private Long telefono;
    private Cargo cargo;
    @JsonManagedReference
    private LocalDTO local;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(Long id, String apellido1, String apellido2, LocalDate fechaNacimiento, Long telefono,
            Cargo cargo, LocalDTO local) {
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

    public LocalDTO getLocal() {
        return local;
    }

    public void setLocal(LocalDTO local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "EmpleadoDTO [id=" + id + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", fechaNacimiento="
                + fechaNacimiento + ", telefono=" + telefono + "]";
    }

}
