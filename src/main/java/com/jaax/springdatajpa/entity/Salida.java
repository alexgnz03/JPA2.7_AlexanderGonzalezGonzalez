package com.jaax.springdatajpa.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Salidas")
public class Salida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_salida")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_barco")
    private Barco barco;

    @Column(name = "fecha_salida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;

    private String destino;

    @Column(name = "nombre_patron")
    private String nombrePatron;

    @Column(name = "apellido_patron")
    private String apellidoPatron;

    @Column(name = "telefono_patron")
    private String telefonoPatron;

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNombrePatron() {
        return nombrePatron;
    }

    public void setNombrePatron(String nombrePatron) {
        this.nombrePatron = nombrePatron;
    }

    public String getApellidoPatron() {
        return apellidoPatron;
    }

    public void setApellidoPatron(String apellidoPatron) {
        this.apellidoPatron = apellidoPatron;
    }

    public String getTelefonoPatron() {
        return telefonoPatron;
    }

    public void setTelefonoPatron(String telefonoPatron) {
        this.telefonoPatron = telefonoPatron;
    }
}