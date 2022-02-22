package com.cristobalbernal.Tema082022.Ejercicio7;

public class Paciente {
    public enum Sexo{
        MASCULO,FEMENINO
    }
    private String sip;
    private String nombre;
    private String apellidos;
    private int edad;
    private Sexo sexo;

    public Paciente(String sip, String nombre, String apellidos, int edad, Sexo sexo) {
        this.sip = sip;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "sip='" + sip + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                '}';
    }
}
