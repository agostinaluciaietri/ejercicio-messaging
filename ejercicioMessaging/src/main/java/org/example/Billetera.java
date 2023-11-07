package org.example;

public class Billetera {

    private String username;
    private String dniUsuario;
    private String saldoJavacoin;

    public Billetera(Usuario usuario, String saldoJavacoin) {
        this.username = usuario.getUsername();
        this.dniUsuario = usuario.getNumeroDni();
        this.saldoJavacoin = saldoJavacoin;
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

    public String getSaldoJavacoin() {
        return saldoJavacoin;
    }

    public void setSaldoJavacoin(String saldoJavacoin) {
        this.saldoJavacoin = saldoJavacoin;
    }
}
