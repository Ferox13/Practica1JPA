package com.fer.practia1jpa.model.dto;

import java.time.LocalDate;
import java.util.List;

import com.fer.practia1jpa.model.entities.Registro;
import com.fer.practia1jpa.model.enumerated.Categoria;

public class ClienteDTO {

    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private Categoria categoria;
    private List<Registro> registros;

    public ClienteDTO() {
    }

    public ClienteDTO(Long id, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento,
            Categoria categoria, List<Registro> registros) {
        this.id = id;
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

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    @Override
    public String toString() {
        return "ClienteDTO [id=" + id + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
                + ", fechaNacimiento=" + fechaNacimiento + ", categoria=" + categoria
                + "]";
    }

}
