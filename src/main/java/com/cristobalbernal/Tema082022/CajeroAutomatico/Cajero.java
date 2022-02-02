package com.cristobalbernal.Tema082022.CajeroAutomatico;

import com.cristobalbernal.Tema082022.Lib.Lib;

public class Cajero {
    private static final Tarjeta tarjeta1 = new Tarjeta(24095720,1234,234);
    private static final Tarjeta tarjeta2 = new Tarjeta(48573927,4567,321);
    private static final Tarjeta tarjeta3 = new Tarjeta(24095720,8904,874);
    private static final Cuenta cuenta1 = new Cuenta("Jose Angel Navarro Martinez",350,tarjeta1);
    private static final Cuenta cuenta2 = new Cuenta("Mario Garcia Muñoz",700,tarjeta2);
    private static final Cuenta cuenta3 = new Cuenta("Azul Calabuig Garcia",1500,tarjeta3);
    public void execute(){
        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1://retiradaDinero();
                    break;
                case 2: consultarSaldo();
                    break;
                case 3://ingresarDinero();
                    break;
                case 4://cambiarPin();
                    break;
            }
        }while (opcion !=0);
    }

    private void consultarSaldo() {
        int cuenta = 0;
        //cambiar a tarjetaa
        System.out.println("Seleccion la cuenta que quieras consultar el saldo: ");
        cuenta = Lib.leerInt();

    }

    public static int menuPrincipal(){
        int opcion = 0;
        System.out.println("Cajero Automatico: ");
        System.out.println("1- Retirada Dinero: ");
        System.out.println("2- Consultar Saldo");
        System.out.println("3- Ingresar Dinero");
        System.out.println("4- Cambiar Pin");
        System.out.println("Elige una opcion: ");
        opcion = Lib.leerInt();
        return opcion;
    }
}





