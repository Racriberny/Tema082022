package com.cristobalbernal.Tema082022.Prueba;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan","Pepe");
        Persona p2 = new Persona("Miguet","Pepe");



        Persona[] personas = new Persona[10];
        personas[0] = p1;
        personas[1] = p2;

        p1 = null;
        p2 = null;

        System.out.println(personas[0]);
        System.out.println(personas[1]);


    }
}
