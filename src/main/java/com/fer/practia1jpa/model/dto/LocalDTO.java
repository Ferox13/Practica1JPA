package com.fer.practia1jpa.model.dto;

import java.util.List;



public class LocalDTO {

    private Long id;
    private String nombre;
    private int aforo;
    private double metrosCuadrados;
    private List<EmpleadoDTO> empleadosDTO;
    private List<RegistroDTO> registrosDTO;

    public LocalDTO() {
    }

   
    public LocalDTO(Long id, String nombre, int aforo, double metrosCuadrados, List<EmpleadoDTO> empleadosDTO,
            List<RegistroDTO> registrosDTO) {
        this.id = id;
        this.nombre = nombre;
        this.aforo = aforo;
        this.metrosCuadrados = metrosCuadrados;
        this.empleadosDTO = empleadosDTO;
        this.registrosDTO = registrosDTO;
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


    public List<EmpleadoDTO> getEmpleadosDTO() {
        return empleadosDTO;
    }


    public void setEmpleadosDTO(List<EmpleadoDTO> empleadosDTO) {
        this.empleadosDTO = empleadosDTO;
    }


    public List<RegistroDTO> getRegistrosDTO() {
        return registrosDTO;
    }


    public void setRegistrosDTO(List<RegistroDTO> registrosDTO) {
        this.registrosDTO = registrosDTO;
    }


    @Override
    public String toString() {
        return "LocalDTO [id=" + id + ", nombre=" + nombre + ", aforo=" + aforo + ", metrosCuadrados=" + metrosCuadrados
                + "]";
    }

}
