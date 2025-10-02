package com.example.personalHomologadoPrimax.repository;


import com.example.personalHomologadoPrimax.model.PersonalContratista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonalContratistaRepository extends JpaRepository<PersonalContratista, Long> {
    // Buscar por DNI
    Optional<PersonalContratista> findById(String id);

    // Buscar por contratista y DNI
    Optional<PersonalContratista> findByContratistaAndId(String contratista, String id);

    // Buscar todos los registros de un mismo DNI (varios contratistas)
    List<PersonalContratista> findAllById(String id);
}
