package com.cristobalbernal.Tema082022.Ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Coche coche = new Coche("Seat Leon",Color.AZUL,true,"1234RTT", Coche.Tipo.DEPORTIVO,2022,Seguro.TERCEROS);
        Coche coche1 = new Coche();
        System.out.println(coche.toString());
        System.out.println(coche1.toString());
        coche.setModelo("Toyota CHR");
        coche.setMetalizado(false);
        coche.setColor(Color.GRIS);
        coche.setFechaFabricacion(2015);
        coche1.setModelo("Lexus NX300h");
        coche1.setColor(Color.TITANEO);
        System.out.println(coche1.imprimirCotxe());
        System.out.println(coche.toString());
        System.out.println(coche1.toString());

    }
}
