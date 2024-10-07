package com.fer.practica1jpa.model.dto;

import java.util.List;



public class LocalDTO {

    private Long id;
    private String nombre;
    private int aforo;
    private double metrosCuadrados;
    private List<EmpleadoDTO> empleados;
    private List<RegistroDTO> registros;

    public LocalDTO() {
    }

   
    public LocalDTO(Long id, String nombre, int aforo, double metrosCuadrados, List<EmpleadoDTO> empleados,
            List<RegistroDTO> registros) {
        this.id = id;
        this.nombre = nombre;
        this.aforo = aforo;
        this.metrosCuadrados = metrosCuadrados;
        this.empleados = empleados;
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


    public int getAforo() {
        return aforo;
    }


    public void setAforo(int aforo) {
        this.aforo = aforo;
    }


    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }


    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }


    public List<EmpleadoDTO> getempleados() {
        return empleados;
    }


    public void setempleados(List<EmpleadoDTO> empleados) {
        this.empleados = empleados;
    }


    public List<RegistroDTO> getregistros() {
        return registros;
    }


    public void setregistros(List<RegistroDTO> registros) {
        this.registros = registros;
    }


    @Override
    public String toString() {
        return "LocalDTO [id=" + id + ", nombre=" + nombre + ", aforo=" + aforo + ", metrosCuadrados=" + metrosCuadrados
                + "]";
    }

}
