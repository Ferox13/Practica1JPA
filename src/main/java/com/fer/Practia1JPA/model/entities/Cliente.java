package com.fer.practia1jpa.model.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import com.fer.practia1jpa.model.enumerated.Categoria;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

}
