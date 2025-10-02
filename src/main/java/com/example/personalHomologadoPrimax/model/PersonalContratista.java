package com.example.personalHomologadoPrimax.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "personalcontratista")
public class PersonalContratista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    private String contratista;
    private String nombre;
    private String apellido;

    private String id;  // DNI, mantiene el mismo nombre que en la BD
    private String puesto_de_trabajo;
    private LocalDate caducidad_camo;
    private String status;

    // Getters y setters

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public String getContratista() {
        return contratista;
    }

    public void setContratista(String contratista) {
        this.contratista = contratista;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPuesto_de_trabajo() {
        return puesto_de_trabajo;
    }

    public void setPuesto_de_trabajo(String puesto_de_trabajo) {
        this.puesto_de_trabajo = puesto_de_trabajo;
    }

    public LocalDate getCaducidad_camo() {
        return caducidad_camo;
    }

    public void setCaducidad_camo(LocalDate caducidad_camo) {
        this.caducidad_camo = caducidad_camo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
