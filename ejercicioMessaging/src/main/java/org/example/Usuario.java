package org.example;

public class Usuario {
    private String username;
    private String password;
    private String numeroDni;

    public Usuario(String username, String password, String numeroDni) {
        this.username = username;
        this.password = password;
        this.numeroDni = numeroDni;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumeroDni() {
        return numeroDni;
    }

    public void setNumeroDni(String numeroDni) {
        this.numeroDni = numeroDni;
    }
}
