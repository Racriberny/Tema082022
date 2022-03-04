package com.cristobalbernal.Tema082022;

import com.cristobalbernal.Tema082022.Lib.Lib;
import com.cristobalbernal.Tema082022.Pila.Pila;

public class Main {
    private final static Pila pila = new Pila(10);

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1:
                    menuPrimero();
                break;
                case 2:
                    menuSegundo();
                break;
                case 0:
                    pila.pop();
            }
        }while (opcion !=0);
    }

    private static int menuSegundo() {
        crearOpcionesMenuprincipal();
        int opcion=0;
        do {
            System.out.println(pila.top());
            System.out.println("Elige una opcion: ");
            opcion = Lib.leerInt();
        }while (opcion >= 0 && opcion <=2);
        return opcion;
    }

    private static int menuPrimero() {
        crearOpcionesMenuprincipal();
        int opcion=0;
        do {
            System.out.println(pila.top());
            System.out.println("Elige una opcion: ");
            opcion = Lib.leerInt();
        }while (opcion >= 0 && opcion <=2);
        return opcion;
    }

    private static int menuPrincipal(){
        int opcion=0;
        do {
            System.out.println(pila.top());
            System.out.println("Elige una opcion: ");
            opcion = Lib.leerInt();
        }while (opcion >= 0 && opcion <=2);
        return opcion;
    }

    private static void crearOpcionesMenuprincipal(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Me");
        stringBuilder.append("Me1");
        stringBuilder.append("Me2");
        stringBuilder.append("Me3");
        pila.push(stringBuilder.toString());
    }
}
