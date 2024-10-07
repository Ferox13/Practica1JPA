package com.fer.practia1jpa.model.dto;

import java.time.LocalDate;

public class RegistroDTO {

    private Long id;
    private ClienteDTO cliente;
    private LocalDTO local;
    private LocalDate fechaRegistro;

    public RegistroDTO() {
    }

  

    public RegistroDTO(Long id, ClienteDTO cliente, LocalDTO local, LocalDate fechaRegistro) {
        this.id = id;
        this.cliente = cliente;
        this.local = local;
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



    public LocalDTO getLocal() {
        return local;
    }



    public void setLocal(LocalDTO local) {
        this.local = local;
    }



    public ClienteDTO getCliente() {
        return cliente;
    }



    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

}
