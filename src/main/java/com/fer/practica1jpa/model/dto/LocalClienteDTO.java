package com.fer.practica1jpa.model.dto;

import java.util.List;

public class LocalClienteDTO {
 private Long id;
    private String nombre;
    public LocalClienteDTO() {
    }
    public LocalClienteDTO(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
    

}
