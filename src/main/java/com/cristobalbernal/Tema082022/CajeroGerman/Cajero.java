package com.cristobalbernal.Tema082022.CajeroGerman;

import com.cristobalbernal.Tema082022.Lib.Lib;

public class Cajero {
    private static final int MIN_NUMERO = 1000;
    private static final int MAX_NUMERO = 9999;
    private static final int CANTIDAD_CUENTAS = 10;
    
    public Cajero() {
        int opcion;
        crearDatosPrueba();
        do {
            opcion = mostrarMenuInicial();
            String tarjeta;
            if (opcion == 1) {
                System.out.println("Escribe la tarjeta a usar: ");
                tarjeta = Lib.leerLinea();

            }

        } while (opcion != 0);
    }

    private void menuCajero() {

    }

    private int mostrarMenuInicial() {
        int opcion;
        boolean validado = false;
        do {
            System.out.println("***********************");
            System.out.println("** CAJERO AUTOMATICO **");
            System.out.println("***********************");
            System.out.println("1. Insertar tarjeta");
            System.out.println("-------------------");
            System.out.println("0. Salir");
            System.out.println();
            System.out.println("Elija una opción: ");
            opcion = Lib.leerInt();
            validado = opcion >= 0 && opcion <= 1;
        } while(!validado);
        return opcion;
    }

    private void crearDatosPrueba() {
        Cuenta[] cuentas = new Cuenta[CANTIDAD_CUENTAS];
        for(int i = 0; i < cuentas.length; i++) {
            cuentas[i] = new Cuenta(
                    String.valueOf(Lib.numeroAleatorio(MIN_NUMERO,MAX_NUMERO)),
                    "Propietario " + (i+1));
            cuentas[i].crearTarjeta();
        }

        for(Cuenta cuenta: cuentas) {
            System.out.println(cuenta.toString());
        }
    }

}
