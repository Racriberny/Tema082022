package com.cristobalbernal.Tema082022.CajeroGerman;

public class Tarjeta {
    private String nuemro;
    private String pin;
    private String numeroSeguridad;

    public Tarjeta(String nuemro, String pin, String numeroSeguridad) {
        this.nuemro = nuemro;
        this.pin = pin;
        this.numeroSeguridad = numeroSeguridad;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "nuemro='" + nuemro + '\'' +
                ", pin='" + pin + '\'' +
                ", numeroSeguridad='" + numeroSeguridad + '\'' +
                '}';
    }
}
