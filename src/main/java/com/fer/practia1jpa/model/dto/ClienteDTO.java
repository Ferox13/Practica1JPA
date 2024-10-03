package com.fer.practia1jpa.model.dto;

public class ClienteDTO {
    private Long id;
    private String nombre;

    public ClienteDTO() {
    }

    public ClienteDTO(Long id, String nombre) {
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

    @Override
    public String toString() {
        return "ClienteDTO [id=" + id + ", nombre=" + nombre + "]";
    }

}
