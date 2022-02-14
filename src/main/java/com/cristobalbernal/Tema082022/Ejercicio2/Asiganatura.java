package com.cristobalbernal.Tema082022.Ejercicio2;

public class Asiganatura {
    private String nombre;
    private int codigo;
    private String curso;

    public Asiganatura(String nombre, int codigo, String curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public Asiganatura() {
        nombre = "Programacion";
        codigo = 2;
        curso = "1SMX";
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Asiganatura{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", curso='" + curso + '\'' +
                '}';
    }
}
