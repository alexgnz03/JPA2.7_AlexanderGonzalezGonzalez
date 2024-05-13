package com.jaax.springdatajpa.controller;

import com.jaax.springdatajpa.entity.Salida;
import com.jaax.springdatajpa.services.SalidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salidas")
public class SalidaController {

    @Autowired
    private SalidaService salidaService;

    // Endpoint para obtener todas las salidas
    @GetMapping
    public List<Salida> getAllSalidas() {
        return salidaService.getAllSalidas();
    }

    // Endpoint para obtener una salida por su ID
    @GetMapping("/{id}")
    public Salida getSalidaById(@PathVariable Long id) {
        return salidaService.getSalidaById(id);
    }

    // Endpoint para crear una nueva salida
    @PostMapping
    public Salida crearSalida(@RequestBody Salida salida) {
        return salidaService.saveOrUpdateSalida(salida);
    }

    // Endpoint para actualizar una salida existente
    @PutMapping("/{id}")
    public Salida actualizarSalida(@PathVariable Long id, @RequestBody Salida salida) {
        salida.setId(id); // Asegurar que el ID de la salida sea el correcto
        return salidaService.saveOrUpdateSalida(salida);
    }

    // Endpoint para eliminar una salida por su ID
    @DeleteMapping("/{id}")
    public void eliminarSalida(@PathVariable Long id) {
        salidaService.deleteSalida(id);
    }
}