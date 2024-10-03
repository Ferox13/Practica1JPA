package com.fer.practia1jpa.model.services;

import org.springframework.stereotype.Service;
import java.util.List;
import com.fer.practia1jpa.model.repositories.IClientesRepository;
import com.fer.practia1jpa.model.dto.ClienteDTO;
import com.fer.practia1jpa.model.entities.Cliente;
import com.fer.practia1jpa.model.mapper.GenericMapper;

@Service
public class ClienteService {
  private  IClientesRepository clientesRepository;

    public ClienteService(IClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }
 public List<ClienteDTO> findAll() {
    return GenericMapper.mapToDtoList(clientesRepository.findAll(), ClienteDTO.class);
}

}
