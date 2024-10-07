package com.fer.practia1jpa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fer.practia1jpa.model.dto.ClienteDTO;
import com.fer.practia1jpa.model.dto.EmpleadoDTO;
import com.fer.practia1jpa.model.dto.LocalDTO;
import com.fer.practia1jpa.model.enumerated.Categoria;
import com.fer.practia1jpa.model.services.ClienteService;
import com.fer.practia1jpa.model.services.EmpleadosService;
import com.fer.practia1jpa.model.services.LocalesService;

@SpringBootApplication
public class Practica1JpaApplication implements CommandLineRunner {
	@Autowired
	private ClienteService clienteService;
	@Autowired
	private LocalesService localesService;
	@Autowired
	private EmpleadosService empleadosService;

	public static void main(String[] args) {
		SpringApplication.run(Practica1JpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ClienteDTO> clienteList = new ArrayList<>();
		List<LocalDTO> localList = new ArrayList<>();
		EmpleadoDTO empleadoDTO = new EmpleadoDTO();

		// clienteList.forEach(cliente -> System.out.println(cliente));
		System.out.println("1----CLIENTES VIP----");
		clienteList = clienteService.findByCategoria(Categoria.VIP);
		clienteList.forEach(cliente -> System.out.println(cliente));

		System.out.println("2----CLIENTES VIP Y MAYORES DE 20----");
		clienteList = clienteService.findByCategoriaAndEdadGreaterThan(Categoria.VIP, 20);
		clienteList.forEach(cliente -> System.out.println(cliente));

		System.out.println("3----LOCALES CON AFORO ENTRE 50 Y 100----");
		localList = localesService.findByAforoBetween(50, 100);
		localList.forEach(local -> System.out.println(local));

		System.out.println("4----CLIENTE CON LOCALES QUE FRECUENTA----");
		ClienteDTO clienteDTO = clienteService.findById(1);
		System.out.println("Cliente: " + clienteDTO);
		System.out.println("Nombre del local: " + clienteDTO.getregistros().get(0).getLocal().getNombre());

		System.out.println("5----TRABAJADORES EN UN LOCAL----");
		LocalDTO localDTO = localesService.findByNombre("Local A");
		System.out.println(localDTO.getNombre());
		for (EmpleadoDTO empleado : localDTO.getempleados()) {
			System.out.println(empleado.toString());
		}

		System.out.println("6----INFORMACIÓN TRABAJADOR----");
		empleadoDTO = empleadosService.findById(1);
		System.out.println(empleadoDTO.toString());
		System.out.println(empleadoDTO.getLocal().getNombre());

		System.out.println("7----GUARDAR NUEVO CLIENTE----");
		clienteDTO = new ClienteDTO("Fernando", "Rodriguez", "Rodriguez", LocalDate.parse("1997-03-17"));
		clienteDTO = clienteService.saveClient(clienteDTO);
		System.out.println("CLIENTE GUARDADO CON ID: " + clienteDTO.getId());

		System.out.println("8----GUARDAR NUEVO CLIENTE----");
		clienteDTO = clienteService.findById(4);
		clienteDTO.setApellido2("Actualizado");
		clienteDTO = clienteService.saveClient(clienteDTO);
		System.out.println("CLIENTE ACTUALIZADO CON ID: " + clienteDTO.getId() + " " + clienteDTO.getApellido2());

		System.out.println("9----BUSCAR ESE CLIENTE POR ID----");
		clienteDTO = clienteService.findById(4);
		System.out.println(clienteDTO.toString());

		System.out.println("10----ELIMINAR CLIENTE----");
		clienteDTO = clienteService.findById(4);
		clienteService.deleteCliente(clienteDTO);
		System.out.println("CLIENTE ELIMINADO");

	}
}