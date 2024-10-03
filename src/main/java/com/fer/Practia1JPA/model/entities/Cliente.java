package com.fer.Practia1JPA.model.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fer.Practia1JPA.model.enumerated.Categoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="nombre", length = 55,nullable = false )
    private String nombre;
    @Column(name = "apellido1", length = 55,nullable = false)
    private String apellido1;
    @Column(name = "apellido2", length = 55, nullable = true)
    private String apellido2;
    @Column(name="FechaNacimiento", nullable = false)
    @Temporal(TemporalType.DATE)
    private LocalDate fechaNacimiento;
    @Enumerated
    @Column(name = "Categoria", columnDefinition = "Enum('VIP','REGULAR','INVITADO','CASUAL')")
    private Categoria categoria;
    @ManyToMany(mappedBy = "clientes")
    private Set<Local> locales=new HashSet<>();
    


}
