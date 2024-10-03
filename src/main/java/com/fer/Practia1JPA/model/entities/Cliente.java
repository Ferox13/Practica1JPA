package com.fer.practia1jpa.model.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


import com.fer.practia1jpa.model.enumerated.Categoria;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre", length = 55, nullable = false)
    private String nombre;
    @Column(name = "apellido1", length = 55, nullable = false)
    private String apellido1;
    @Column(name = "apellido2", length = 55, nullable = true)
    private String apellido2;
    @Column(name = "fechaNacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate fechaNacimiento;
    @Enumerated(EnumType.STRING)
    @Column(name = "categoria", columnDefinition = "Enum('VIP','REGULAR','INVITADO','CASUAL')")
    private Categoria categoria;
    @ManyToMany
    @JoinTable(name = "registros", joinColumns = @JoinColumn(name = "cliente_id"), inverseJoinColumns = @JoinColumn(name = "local_id"))
    private Set<Local> locales = new HashSet<>();
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Registro> registros = new HashSet<>();
    public Cliente() {
    }
    public Cliente(Long id, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento,
            Categoria categoria, Set<Local> locales, Set<Registro> registros) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.categoria = categoria;
        this.locales = locales;
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
    public Set<Local> getLocales() {
        return locales;
    }
    public void setLocales(Set<Local> locales) {
        this.locales = locales;
    }
    public Set<Registro> getRegistros() {
        return registros;
    }
    public void setRegistros(Set<Registro> registros) {
        this.registros = registros;
    }
    


    
}
