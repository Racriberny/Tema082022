package com.cristobalbernal.Tema082022.Prueba;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private Genero genero;

    /*
    public Persona(){
        dni = "no tiene sentido";
        nombre = "John";
        apellidos = "Doe";
        edad = 99;
        genero = Genero.FEMENINO;
    }

     */

    public Persona(String dni, String nombre, String apellidos, int edad, Genero genero) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Personas{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                '}';
    }
}
