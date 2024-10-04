package com.fer.practia1jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import com.fer.practia1jpa.model.services.ClienteService;
import com.fer.practia1jpa.model.services.EmpleadosService;
import com.fer.practia1jpa.model.services.LocalesService;
import com.fer.practia1jpa.model.dto.ClienteDTO;
import com.fer.practia1jpa.model.dto.EmpleadoDTO;
import com.fer.practia1jpa.model.dto.LocalDTO;
import com.fer.practia1jpa.model.entities.Cliente;
import com.fer.practia1jpa.model.entities.Empleado;
import com.fer.practia1jpa.model.enumerated.Categoria;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Practica1JpaApplication implements CommandLineRunner {
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private LocalesService localesService;

	public static void main(String[] args) {
		SpringApplication.run(Practica1JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ClienteDTO> clienteList= new ArrayList<>();
		List<LocalDTO> localList= new ArrayList<>();
			
		
		//clienteList.forEach(cliente -> System.out.println(cliente));
		System.out.println("----CLIENTES VIP----");
		clienteList = clienteService.findByCategoria(Categoria.VIP);
		clienteList.forEach(cliente -> System.out.println(cliente));
		
		System.out.println("----CLIENTES VIP Y MAYORES DE 20----");
		clienteList = clienteService.findByCategoriaAndEdadGreaterThan(Categoria.VIP,20);
		clienteList.forEach(cliente -> System.out.println(cliente));

		System.out.println("----LOCALES CON AFORO ENTRE 50 Y 100----");
		localList=localesService.findByAforoBetween(50, 100);
		localList.forEach(local->System.out.println(local));


		System.out.println("----CLIENTE CON LOCALES QUE FRECUENTA----");
		ClienteDTO clienteDTO=clienteService.findById(1);
		System.out.println("Cliente: "+clienteDTO);
		System.out.println("Nombre del local: "+clienteDTO.getregistros().get(0).getLocal().getNombre());

	/* 	System.out.println("----TRABAJADORES EN UN LOCAL----");
		LocalDTO localDTO=localesService.findById(1);
		for (EmpleadoDTO empleado : localDTO.getEmpleadosDTO()) {
			System.out.println(empleado.toString());
		} */

	}
}