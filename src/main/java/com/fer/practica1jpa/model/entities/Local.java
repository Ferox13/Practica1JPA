package com.fer.practica1jpa.model.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "locales")
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 55, nullable = false)
    private String nombre;
    @Column(name = "aforo", nullable = false)
    private int aforo;
    @Column(name = "metrosCuadrados", nullable = false)
    private double metrosCuadrados;
    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Empleado> empleados;
    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Registro> registros;

    /*
     * @ManyToMany(mappedBy = "locales", fetch = FetchType.EAGER)
     * private Set<Cliente> clientes = new HashSet<>();
     */
    public Local() {
    }

    public Local(Long id, String nombre, int aforo, double metrosCuadrados, List<Empleado> empleados,
            List<Registro> registros) {
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

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

}
