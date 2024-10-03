package com.fer.Practia1JPA.model.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name ="nombre", length = 55, nullable = false)
    private String nombre;
    @Column(name="aforo",nullable = false)
    private int aforo;
    @Column(name = "metrosCuadrados", nullable = false)
    private double metrosCuadrados;
    @OneToMany(mappedBy = "local", cascade = CascadeType.ALL, orphanRemoval = true )
    private List<Empleado> empleados;
    @ManyToMany
    @JoinTable(name ="local_cliente", joinColumns=@JoinColumn(name="cliente_id"), inverseJoinColumns=@JoinColumn(name="local_id"))
    private Set<Cliente> clientes=new HashSet<>();
    

}
