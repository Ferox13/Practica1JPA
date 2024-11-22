package com.fer.practica1jpa.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fer.practica1jpa.model.repositories.IClientesRepository;
import com.fer.practica1jpa.model.dto.ClienteDTO;
import com.fer.practica1jpa.model.entities.Cliente;
import com.fer.practica1jpa.model.enumerated.Categoria;
import com.fer.practica1jpa.model.mapper.ClienteMapper;

@Service
public class ClienteService {
  @Autowired
  private IClientesRepository clientesRepository;
  @Autowired
  private ClienteMapper clienteMapper;


  public ClienteService(IClientesRepository clientesRepository, ClienteMapper clienteMapper) {
    this.clientesRepository = clientesRepository;
    this.clienteMapper = clienteMapper;
  }

  public List<ClienteDTO> findAll() {
    List<Cliente> clientes = clientesRepository.findAll();
    if (clientes.isEmpty()) {
      throw new RuntimeException("No clients found");
    }
    return clientes.stream()
        .map(clienteMapper::clienteToClienteDTO)
        .collect(Collectors.toList());
    
  }

  public List<ClienteDTO> findByCategoria(Categoria category) {
    List<Cliente> clientes = clientesRepository.findByCategoria(category);
    if (clientes.isEmpty()) {
      throw new RuntimeException("No client found for category: " + category);
    }
    return clientes.stream()
    .map(clienteMapper::clienteToClienteDTO)
    .collect(Collectors.toList());
  }

  public List<ClienteDTO> findByCategoriaAndEdadGreaterThan(Categoria categoria, int edad) {
    List<Cliente> clientes = clientesRepository.findByCategoriaAndCalculatedEdadGreaterThan(categoria, edad);
    if (clientes.isEmpty()) {
      throw new RuntimeException("No clients found");
    }
    return clientes.stream()
    .map(clienteMapper::clienteToClienteDTO)
    .collect(Collectors.toList());
  }

  public ClienteDTO findById(long id) {
    Optional<Cliente> optionalCliente = clientesRepository.findById(id);
    if (!optionalCliente.isPresent()) {
      throw new RuntimeException("No clients found");
    }
    return clienteMapper.clienteToClienteDTO(optionalCliente.get());
  }

  public ClienteDTO saveClient(ClienteDTO clienteDTO) {
    Cliente nuevoCliente = clienteMapper.clienteDTOToCliente(clienteDTO);
    Cliente savedCliente = clientesRepository.save(nuevoCliente);
    if (savedCliente == null || savedCliente.getId() == null) {
      throw new RuntimeException("Failed to save client");
    }
    return clienteMapper.clienteToClienteDTO(savedCliente);
  }

  public void deleteCliente(ClienteDTO clienteDTO) {
    Cliente cliente = clienteMapper.clienteDTOToCliente(clienteDTO);
    clientesRepository.delete(cliente);
    if (clientesRepository.existsById(cliente.getId())) {
      throw new RuntimeException("Failed to delete client");
    }
  }
}
