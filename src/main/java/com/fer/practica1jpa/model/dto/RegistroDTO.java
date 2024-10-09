package com.fer.practica1jpa.model.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class RegistroDTO {

    private Long id;
    private LocalDate fechaRegistro;
    @JsonBackReference
    private ClienteDTO clienteDTO;
    @JsonBackReference
    private LocalDTO localDTO;

    public RegistroDTO() {
    }

    public RegistroDTO(Long id, LocalDate fechaRegistro) {
        this.id = id;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "RegistroDTO [id=" + id + ", fechaRegistro=" + fechaRegistro + "]";
    }

}
