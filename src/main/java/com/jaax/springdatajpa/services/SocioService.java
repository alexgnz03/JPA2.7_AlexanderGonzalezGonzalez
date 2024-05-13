package com.jaax.springdatajpa.services;

import com.jaax.springdatajpa.entity.Socio;
import com.jaax.springdatajpa.repository.SocioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SocioService {

    @Autowired
    private SocioRepository socioRepository;

    public Socio saveOrUpdateSocio(Socio socio) {
        return socioRepository.save(socio);
    }

    public void deleteSocio(Long id) {
        socioRepository.deleteById(id);
    }

    public Socio getSocioById(Long id) {
        return socioRepository.findById(id).orElse(null);
    }

    public List<Socio> getAllSocios() {
        return socioRepository.findAll();
    }

}
