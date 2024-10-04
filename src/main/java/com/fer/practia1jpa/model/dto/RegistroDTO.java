package com.fer.practia1jpa.model.dto;

import java.time.LocalDate;

public class RegistroDTO {

    private Long id;
    private ClienteDTO clienteDTO;
    private LocalDTO localDTO;
    private LocalDate fechaRegistro;

    public RegistroDTO() {
    }

    public RegistroDTO(Long id, ClienteDTO clienteDTO, LocalDTO localDTO, LocalDate fechaRegistro) {
        this.id = id;
        this.clienteDTO = clienteDTO;
        this.localDTO = localDTO;
        this.fechaRegistro = fechaRegistro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public LocalDTO getLocalDTO() {
        return localDTO;
    }

    public void setLocalDTO(LocalDTO localDTO) {
        this.localDTO = localDTO;
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
