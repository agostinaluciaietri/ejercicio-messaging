package com.mensajeria.EjercicioMensajeria.model;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class CuentaDolar {
    @Id
    private String cbu;
    private double saldoDolar;
    @OneToOne
    private Usuario usuario;

    public CuentaDolar(String cbu, double saldoDolar, Usuario usuario) {
        this.cbu = cbu;
        this.saldoDolar = saldoDolar;
        this.usuario = usuario;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public double getSaldoDolar() {
        return saldoDolar;
    }

    public void setSaldoDolar(double saldoDolar) {
        this.saldoDolar = saldoDolar;
    }
}
