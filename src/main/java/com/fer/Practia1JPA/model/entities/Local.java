package com.fer.practia1jpa.model.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="locales")
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="nombre", length = 55, nullable = false)
    private String nombre;
    @Column(name="aforo",nullable = false)
    private int aforo;
    @Column(name = "metrosCuadrados", nullable = false)
    private double metrosCuadrados;
    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL, orphanRemoval = true )
    private List<Empleado> empleados;
    @ManyToMany(mappedBy = "locales", fetch = FetchType.EAGER)
    private Set<Cliente> clientes = new HashSet<>();
    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Registro> registros = new HashSet<>();



    

}
