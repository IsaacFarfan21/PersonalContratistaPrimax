package com.example.personalHomologadoPrimax.controller;

import com.example.personalHomologadoPrimax.model.PersonalContratista;
import com.example.personalHomologadoPrimax.service.PersonalContratistaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consulta")
public class PersonalContratistaController {

    private final PersonalContratistaService personalContratistaService;

    public PersonalContratistaController(PersonalContratistaService personalContratistaService) {
        this.personalContratistaService = personalContratistaService;
    }

    @GetMapping("/{dni}")
    public ResponseEntity<List<PersonalContratista>> obtenerPorDni(@PathVariable("dni") String dni) {
        List<PersonalContratista> resultados = personalContratistaService.buscarPorDni(dni);

        if (resultados.isEmpty()) {
            return ResponseEntity.notFound().build(); // 404 si no hay coincidencias
        }

        return ResponseEntity.ok(resultados); // 200 OK con la lista de resultados
    }
}
