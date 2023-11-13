package com.mensajeria.EjercicioMensajeria.model;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Usuario {
    @Id
    private String username;
    private String numeroDni;
    @OneToOne(mappedBy="usuario")
    private CuentaDolar cuentaDolar;

    public Usuario(String username, String numeroDni) {
        this.username = username;
        this.numeroDni = numeroDni;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNumeroDni() {
        return numeroDni;
    }

    public void setNumeroDni(String numeroDni) {
        this.numeroDni = numeroDni;
    }
}
