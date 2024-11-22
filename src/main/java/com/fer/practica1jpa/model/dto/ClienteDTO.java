package com.fer.practica1jpa.model.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fer.practica1jpa.model.enumerated.Categoria;

public class ClienteDTO {

    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private Categoria categoria;
    @JsonManagedReference
    private List<RegistroClienteDTO> registros;

    public ClienteDTO() {
    }

    public ClienteDTO(Long id, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento,
            Categoria categoria, List<RegistroClienteDTO> registros) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
        this.registros = registros;
    }

    public ClienteDTO(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
    }

    public ClienteDTO(String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento, Categoria categoria,
            List<RegistroClienteDTO> registros) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
        this.registros = registros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ClienteDTO [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
                + ", fechaNacimiento=" + fechaNacimiento + ", categoria=" + categoria
                + "]";
    }

    public List<RegistroClienteDTO> getregistros() {
        return registros;
    }

    public void setregistros(List<RegistroClienteDTO> registros) {
        this.registros = registros;
    }

}
