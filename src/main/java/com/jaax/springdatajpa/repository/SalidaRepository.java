package com.jaax.springdatajpa.repository;

import com.jaax.springdatajpa.entity.Salida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalidaRepository extends JpaRepository<Salida, Long> {

}