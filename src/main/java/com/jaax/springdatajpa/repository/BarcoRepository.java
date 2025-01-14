package com.jaax.springdatajpa.repository;

import com.jaax.springdatajpa.entity.Barco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarcoRepository extends JpaRepository<Barco, Long> {

}