package com.jaax.springdatajpa.controller;

import com.jaax.springdatajpa.entity.Socio;
import com.jaax.springdatajpa.services.SocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/socios")
public class SocioController {

    @Autowired
    private SocioService socioService;

    // Endpoint para obtener todos los socios
    @GetMapping
    public List<Socio> getAllSocios() {
        return socioService.getAllSocios();
    }

    // Endpoint para obtener un socio por su ID
    @GetMapping("/{id}")
    public Socio getSocioById(@PathVariable Long id) {
        return socioService.getSocioById(id);
    }

    // Endpoint para crear un nuevo socio
    @PostMapping
    public Socio crearSocio(@RequestBody Socio socio) {
        return socioService.saveOrUpdateSocio(socio);
    }

    // Endpoint para actualizar un socio existente
    @PutMapping("/{id}")
    public Socio actualizarSocio(@PathVariable Long id, @RequestBody Socio socio) {
        socio.setId(id); // Asegurar que el ID del socio sea el correcto
        return socioService.saveOrUpdateSocio(socio);
    }

    // Endpoint para eliminar un socio por su ID
    @DeleteMapping("/{id}")
    public void eliminarSocio(@PathVariable Long id) {
        socioService.deleteSocio(id);
    }
}