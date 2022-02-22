package com.cristobalbernal.Tema082022.Ejercicio6;

import com.cristobalbernal.Tema082022.Lib.Lib;

public class Principal {
    private static final int NUM_BICICLETAS = 5;
    Bicicleta [] bicicletas;
    private Tienda tienda = new Tienda();

    public Principal(){
        bicicletas = new Bicicleta[NUM_BICICLETAS];
        tienda.crearDatos(bicicletas);
    }
    public void execute(){
        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1:
                    System.out.println("AÑADIR BICICLETA!!!");
                    tienda.anadirBicicleta(bicicletas);
                break;

                case 2:
                    System.out.println("Bicicletas disponibles: ");
                    tienda.mostrarStock(bicicletas);
                    System.out.println("Escribe el numero de referencia: ");
                    String referecia = Lib.leerLinea();
                    tienda.venderBicicleta(bicicletas,referecia);
                break;
                case 3:
                    consultas();
                break;

                case 4:
                    mostrarBicicletas();
                break;
            }
        }while (opcion !=0);
    }
    private void consultas() {
        int opcion;
        boolean valido;
        String referecia;
        String marca;
        String modelo;
        do {
            opcion = menuConsultas();
            switch (opcion){
                case 1:
                    System.out.println("Escribe el numero de referencia: ");
                    referecia = Lib.leerLinea();
                    tienda.consultaReferencia(bicicletas,referecia);
                break;
                case 2:
                    System.out.println("Escribe la marca de la bicicleta: ");
                    marca = Lib.leerLinea();
                    tienda.consultarPorMarca(bicicletas,marca);
                break;
                case 3:
                    System.out.println("Escribe el modelo de la bicicleta: ");
                    modelo = Lib.leerLinea();
                    tienda.consultarModelo(bicicletas,modelo);
                break;
            }
        }while (opcion !=0);
    }

    private void mostrarBicicletas() {
        for (Bicicleta bicicleta: bicicletas) {
            System.out.println(bicicleta);
        }
    }

    private int menuConsultas() {
        int opcion;
        System.out.println("******************");
        System.out.println("CONSULTA BICICLETAS");
        System.out.println("******************");
        System.out.println("1- Consultar por referencia");
        System.out.println("2- Consultar por marca");
        System.out.println("3- Consultar por modelo");
        System.out.println("0- Volver al menu principal");
        System.out.println("Escribe una opcion: ");
        opcion = Lib.leerInt();
        return opcion;
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
