package com.fer.practia1jpa.model.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fer.practia1jpa.model.dto.EmpleadoDTO;
import com.fer.practia1jpa.model.entities.Empleado;
import com.fer.practia1jpa.model.mapper.EmpleadoMapper;
import com.fer.practia1jpa.model.repositories.IEmpleadosRepository;

@Service
public class EmpleadosService {

    @Autowired
    private IEmpleadosRepository empleadosRepository;
    @Autowired
    private EmpleadoMapper empleadoMapper;

    public EmpleadosService(IEmpleadosRepository empleadosRepository, EmpleadoMapper empleadoMapper) {
        this.empleadosRepository = empleadosRepository;
        this.empleadoMapper = empleadoMapper;
    }

    public EmpleadoDTO findById(long id) {
        Optional<Empleado> empleadoOptional = empleadosRepository.findById(id);
        if (!empleadoOptional.isPresent()) {
            throw new RuntimeException("No locales found");
        }
        return empleadoMapper.toDto(empleadoOptional.get());

    }

}
