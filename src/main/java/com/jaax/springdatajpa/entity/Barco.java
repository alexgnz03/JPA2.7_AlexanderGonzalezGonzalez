package com.jaax.springdatajpa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Barcos")
public class Barco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_barco")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_socio")
    private Socio socio;

    @Column(name = "numero_matricula")
    private String numeroMatricula;

    @Column(name = "nombre_barco")
    private String nombreBarco;

    @Column(name = "numero_amarre")
    private Integer numeroAmarre;

    @Column(name = "cuota")
    private Double cuota;

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    public Integer getNumeroAmarre() {
        return numeroAmarre;
    }

    public void setNumeroAmarre(Integer numeroAmarre) {
        this.numeroAmarre = numeroAmarre;
    }

    public Double getCuota() {
        return cuota;
    }

    public void setCuota(Double cuota) {
        this.cuota = cuota;
    }
}