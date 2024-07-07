package com.example.trenAlSur.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class UserDto {

    private String usuario;
    private String contraseña;

    public UserDto() {
    }

    public UserDto(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}