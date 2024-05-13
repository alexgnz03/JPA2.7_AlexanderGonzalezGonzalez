package com.jaax.springdatajpa.services;

import com.jaax.springdatajpa.entity.Salida;
import com.jaax.springdatajpa.repository.SalidaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SalidaService {

    @Autowired
    private SalidaRepository salidaRepository;

    public Salida saveOrUpdateSalida(Salida salida) {
        return salidaRepository.save(salida);
    }

    public void deleteSalida(Long id) {
        salidaRepository.deleteById(id);
    }

    public Salida getSalidaById(Long id) {
        return salidaRepository.findById(id).orElse(null);
    }

    public List<Salida> getAllSalidas() {
        return salidaRepository.findAll();
    }

}