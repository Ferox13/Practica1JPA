package com.fer.practia1jpa.model.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.fer.practia1jpa.model.repositories.IClientesRepository;
import com.fer.practia1jpa.model.dto.ClienteDTO;
import com.fer.practia1jpa.model.entities.Cliente;
import com.fer.practia1jpa.model.enumerated.Categoria;
import com.fer.practia1jpa.model.mapper.GenericMapper;

@Service
public class ClienteService {
  private IClientesRepository clientesRepository;

  public ClienteService(IClientesRepository clientesRepository) {
    this.clientesRepository = clientesRepository;
  }

  public List<ClienteDTO> findAll() {
    List<Cliente> clientes = clientesRepository.findAll();
    if (clientes.isEmpty()) {
      throw new RuntimeException("No clients found");
    }
    return GenericMapper.mapToDtoList(clientes, ClienteDTO.class);
  }

  public List<ClienteDTO> findByCategoria(Categoria category) {
    List<Cliente> clientes = clientesRepository.findByCategoria(category);
    if (clientes.isEmpty()) {
      throw new RuntimeException("No client found for category: " + category);
    }
    return GenericMapper.mapToDtoList(clientes, ClienteDTO.class);
  }

  public List<ClienteDTO> findByCategoriaAndEdadGreaterThan(Categoria categoria, int edad) {
    List<Cliente> clientes = clientesRepository.findByCategoriaAndCalculatedEdadGreaterThan(categoria, edad);
    if (clientes.isEmpty()) {
      throw new RuntimeException("No clients found");
    }
    return GenericMapper.mapToDtoList(clientes, ClienteDTO.class);

  }

  public ClienteDTO findById(long id) {
    Optional<Cliente> optionalCliente = clientesRepository.findById(id);
    if (!optionalCliente.isPresent()) {
      throw new RuntimeException("No clients found");
    }
    return GenericMapper.mapToDto(optionalCliente.get(), ClienteDTO.class);

  }
}
