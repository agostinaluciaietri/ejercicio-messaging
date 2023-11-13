package com.mensajeria.EjercicioMensajeria.model;

public class Billetera {
    private String username;
    private String dniUsuario;
    private double saldoJavacoin;

    public Billetera(Usuario usuario) {
        this.username = usuario.getUsername();
        this.dniUsuario = usuario.getNumeroDni();
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

}
