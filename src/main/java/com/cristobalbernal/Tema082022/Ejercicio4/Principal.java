package com.cristobalbernal.Tema082022.Ejercicio4;

public class Principal {
    public void execute(){
        Punto punto = new Punto();
        Punto punto1 = new Punto(3.54,2.34);
        System.out.println(punto.visualizarPunto());
        System.out.println(punto1.calcularDistancia(punto));

    }
}
