package com.example.personalHomologadoPrimax.service;
import com.example.personalHomologadoPrimax.model.PersonalContratista;
import com.example.personalHomologadoPrimax.repository.PersonalContratistaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalContratistaService {

    private final PersonalContratistaRepository repository;

    public PersonalContratistaService(PersonalContratistaRepository repository) {
        this.repository = repository;
    }

    // Buscar por DNI
    public List<PersonalContratista> buscarPorDni(String dni) {
        List<PersonalContratista> lista = repository.findAllById(dni);
        if(lista.isEmpty()){
            throw new EntityNotFoundException("El DNI "+dni +" no existe en la base de datos," +
                    " si crees que es un error comunicate con el 9595956");
        }
        return lista;
    }
}
