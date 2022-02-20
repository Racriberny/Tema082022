package com.cristobalbernal.Tema082022.Ejercicio6;

import com.cristobalbernal.Tema082022.Lib.Lib;
import com.github.javafaker.Faker;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Principal {
    private static final int NUM_BICICLETAS = 5;
    Bicicleta [] bicicletas;
    Tienda tienda = new Tienda();

    public Principal(){
        bicicletas = new Bicicleta[NUM_BICICLETAS];
        //tienda.crearDatos(bicicletas);
    }
    public void execute(){
        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1:
                    tienda.anadirBicicleta(bicicletas);
                break;

                case 2:

                break;
                case 3:
                    menuConsultas();
                break;

                case 4:
                    mostrarBicicletas();
                break;

                case 5:
                tienda.mostrarStock(bicicletas);
                break;
            }
        }while (opcion !=0);



    }

    private void mostrarBicicletas() {
        for (Bicicleta bicicleta: bicicletas) {
            System.out.println(bicicleta);
        }
    }

    private void menuConsultas() {
        System.out.println("******************");
        System.out.println("CONSULTA BICICLETAS");
        System.out.println("******************");
        System.out.println("1- Consultar por referencia");
        System.out.println("2- Consultar por marca");
        System.out.println("3- Consultar por modelo");
        System.out.println("0- Volver al menu principal");
    }

    private int menuPrincipal() {
        int opcion;
        System.out.println("********************");
        System.out.println("GESTION BICICLETAS");
        System.out.println("********************");
        System.out.println("1- Añadir bicicleta");
        System.out.println("2- Vender bicicletas");
        System.out.println("3- Consultar bicicletas");
        System.out.println("4- Mostrar stock");
        System.out.println("Escribe una opcion: ");
        opcion = Lib.leerInt();
        return opcion;
    }
}
