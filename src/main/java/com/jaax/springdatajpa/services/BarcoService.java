package com.jaax.springdatajpa.services;

import com.jaax.springdatajpa.entity.Barco;
import com.jaax.springdatajpa.repository.BarcoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BarcoService {

    @Autowired
    private BarcoRepository barcoRepository;

    public Barco saveOrUpdateBarco(Barco barco) {
        return barcoRepository.save(barco);
    }

    public void deleteBarco(Long id) {
        barcoRepository.deleteById(id);
    }

    public Barco getBarcoById(Long id) {
        return barcoRepository.findById(id).orElse(null);
    }

    public List<Barco> getAllBarcos() {
        return barcoRepository.findAll();
    }

}