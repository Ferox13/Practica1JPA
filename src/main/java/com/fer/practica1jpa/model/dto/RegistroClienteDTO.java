package com.fer.practica1jpa.model.dto;

import java.time.LocalDate;

public class RegistroClienteDTO {
    private Long id;
    private LocalDate fechaRegistro;
    private LocalClienteDTO local; 
    
    public RegistroClienteDTO() {
    }

    public RegistroClienteDTO(Long id, LocalClienteDTO local, LocalDate fechaRegistro) {
        this.id = id;
        this.local = local;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalClienteDTO getLocal() {
        return local;
    }

    public void setLocal(LocalClienteDTO local) {
        this.local = local;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
}
