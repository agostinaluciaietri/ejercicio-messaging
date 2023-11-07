package org.example;

public class Banco {

    private String dniUsuario;
    private String cbuUsuario;

    public Banco(Usuario usuario, String cbuUsuario) {
        this.dniUsuario = usuario.getNumeroDni();
        this.cbuUsuario = cbuUsuario;
    }

    public String getDniUsuario() {
        return dniUsuario;
    }

    public void setDniUsuario(String dniUsuario) {
        this.dniUsuario = dniUsuario;
    }

    public String getCbuUsuario() {
        return cbuUsuario;
    }

    public void setCbuUsuario(String cbuUsuario) {
        this.cbuUsuario = cbuUsuario;
    }
}
