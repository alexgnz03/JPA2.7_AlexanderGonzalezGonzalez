package com.jaax.springdatajpa.controller;


import com.jaax.springdatajpa.entity.Barco;
import com.jaax.springdatajpa.services.BarcoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/barcos")
public class BarcoController {

    @Autowired
    private BarcoService barcoService;

    // Endpoint para obtener todos los barcos
    @GetMapping
    public List<Barco> getAllBarcos() {
        return barcoService.getAllBarcos();
    }

    // Endpoint para obtener un barco por su ID
    @GetMapping("/{id}")
    public Barco getBarcoById(@PathVariable Long id) {
        return barcoService.getBarcoById(id);
    }

    // Endpoint para crear un nuevo barco
    @PostMapping
    public Barco crearBarco(@RequestBody Barco barco) {
        return barcoService.saveOrUpdateBarco(barco);
    }

    // Endpoint para actualizar un barco existente
    @PutMapping("/{id}")
    public Barco actualizarBarco(@PathVariable Long id, @RequestBody Barco barco) {
        barco.setId(id); // Asegurar que el ID del barco sea el correcto
        return barcoService.saveOrUpdateBarco(barco);
    }

    // Endpoint para eliminar un barco por su ID
    @DeleteMapping("/{id}")
    public void eliminarBarco(@PathVariable Long id) {
        barcoService.deleteBarco(id);
    }
}