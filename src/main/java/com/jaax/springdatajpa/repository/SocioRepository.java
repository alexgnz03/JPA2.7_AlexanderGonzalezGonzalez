package com.jaax.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.jaax.springdatajpa.entity.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Long> {

}