package com.fer.practia1jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import com.fer.practia1jpa.model.services.ClienteService;
import com.fer.practia1jpa.model.services.EmpleadosService;
import com.fer.practia1jpa.model.dto.ClienteDTO;
import com.fer.practia1jpa.model.entities.Cliente;

import java.util.List;

@SpringBootApplication
public class Practica1JpaApplication implements CommandLineRunner {
	@Autowired
	private ClienteService clienteService;

	public static void main(String[] args) {
		SpringApplication.run(Practica1JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ClienteDTO> clienteList = clienteService.findAll();
		clienteList.forEach(cliente -> System.out.println(cliente));

	}
}