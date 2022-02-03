package com.cristobalbernal.Tema082022.CajeroAutomatico;

import com.cristobalbernal.Tema082022.Lib.Lib;

public class Cajero {
    private static final Tarjeta tarjeta1 = new Tarjeta(24095720,1234,234);
    private static final Tarjeta tarjeta2 = new Tarjeta(48573927,4567,321);
    private static final Tarjeta tarjeta3 = new Tarjeta(65392748,8904,874);
    private static final Cuenta cuenta1 = new Cuenta("Jose Angel Navarro Martinez",350,tarjeta1);
    private static final Cuenta cuenta2 = new Cuenta("Mario Garcia Muñoz",700,tarjeta2);
    private static final Cuenta cuenta3 = new Cuenta("Azul Calabuig Garcia",1500,tarjeta3);
    public void execute(){
        /*
        Cuenta cuentas = new Cuenta[10];
        for(Cuenta cuanta : cuentas){
            cuenta = new Cuenta(Lib.alea(0,10)
        }
         */







        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1:retiradaDinero();
                    break;
                case 2: consultarSaldo();
                    break;
                case 3:ingresarDinero();
                    break;
                case 4:cambiarPin();
                    break;
            }
        }while (opcion !=0);
    }

    private void retiradaDinero() {
        int tarjeta;
        int pin;
        float retirada;
        boolean valido = false;
        boolean validoTarjeta = false;
        float cuenta1Saldo = cuenta1.getSaldo();
        float cuenta2Saldo = cuenta2.getSaldo();
        float cuenta3Saldo = cuenta3.getSaldo();
        do {
            System.out.println("Introduce la tarjeta: ");
            tarjeta = Lib.leerInt();
            if (tarjeta == tarjeta1.getNuemroTarjeta() || tarjeta == tarjeta2.getNuemroTarjeta() ||
                    tarjeta == tarjeta3.getNuemroTarjeta()){
                valido = true;
            }

        }while (!valido);
        if (tarjeta == tarjeta1.getNuemroTarjeta()){
            do {
                System.out.println("Escribe el pin de la tarjeta");
                pin = Lib.leerInt();
                if (pin == tarjeta1.getPin()){
                    System.out.println("Pin correcto!!!");
                    System.out.println("Escribe la cantidad que quieres retirar: ");
                    retirada = Lib.leerFloat();
                    cuenta1.setSaldo(cuenta1Saldo - retirada);
                    validoTarjeta = true;
                }
            }while (!validoTarjeta);
        }else if (tarjeta == tarjeta2.getNuemroTarjeta()){
            do {
                System.out.println("Escribe el pin de la tarjeta: ");
                pin = Lib.leerInt();
                if (pin == tarjeta2.getPin()){
                    System.out.println("Pin correcto!!!");
                    System.out.println("Escribe la cantidad que quieres ingresar: ");
                    retirada = Lib.leerFloat();
                    cuenta1.setSaldo(cuenta1Saldo - retirada);
                    validoTarjeta = true;
                }
            }while (!validoTarjeta);
        }else if (tarjeta == tarjeta3.getNuemroTarjeta()) {
            do {
                System.out.println(tarjeta3.getPin());
                System.out.println("Escribe el pin de la tarjeta: ");
                pin = Lib.leerInt();
                System.out.println(tarjeta3.getPin());
                if (pin == tarjeta3.getPin()) {
                    System.out.println("Pin correcto!!!");
                    System.out.println("Escribe la cantidad que quieres ingresar: ");
                    retirada = Lib.leerFloat();
                    cuenta1.setSaldo(cuenta1Saldo - retirada);
                    validoTarjeta = true;
                }
            } while (!validoTarjeta);
        }

    }

    private void cambiarPin() {
        int tarjeta;
        int pin;
        int pinCambiado;
        boolean valido = false;
        boolean validoTarjeta = false;

        do {
            System.out.println("Introduce la tarjeta: ");
            tarjeta = Lib.leerInt();

            if (tarjeta == tarjeta1.getNuemroTarjeta() || tarjeta == tarjeta2.getNuemroTarjeta() ||
                    tarjeta == tarjeta3.getNuemroTarjeta()){
                valido = true;
            }
        }while (!valido);

        if (tarjeta == tarjeta1.getNuemroTarjeta()){
            do {
                System.out.println("Escribe el pin de la tarjeta");
                pin = Lib.leerInt();
                if (pin == tarjeta1.getPin()){
                    System.out.println("Pin correcto!!");
                    System.out.println("Escribe la contraseña para cambiarla: ");
                    pinCambiado = Lib.leerInt();
                    tarjeta1.setPin(pinCambiado);
                    System.out.println("Pin cambiado correctamente, Un saludo!!");
                    validoTarjeta = true;
                }
            }while (!validoTarjeta);
        }else if (tarjeta == tarjeta2.getNuemroTarjeta()){
            do {
                System.out.println("Escribe el pin de la tarjeta");
                pin = Lib.leerInt();
                if (pin == tarjeta2.getPin()){
                    System.out.println("Pin correcto!!");
                    System.out.println("Escribe la contraseña para cambiarla: ");
                    pinCambiado = Lib.leerInt();
                    tarjeta2.setPin(pinCambiado);
                    System.out.println("Pin cambiado correctamente, Un saludo!!");
                    validoTarjeta = true;
                }

            }while (!validoTarjeta);
        }else if (tarjeta == tarjeta3.getNuemroTarjeta()) {
            do {
                System.out.println("Escribe el pin de la tarjeta");
                pin = Lib.leerInt();
                if (pin == tarjeta3.getPin()) {
                    System.out.println("Pin correcto!!");
                    System.out.println("Escribe la contraseña para cambiarla: ");
                    pinCambiado = Lib.leerInt();
                    tarjeta3.setPin(pinCambiado);
                    System.out.println("Pin cambiado correctamente, Un saludo!!");
                    validoTarjeta = true;
                }
            } while (!validoTarjeta);
        }
    }

    private void ingresarDinero() {
        boolean validoTarjeta = false;
        float ingreso = 0;
        int tarjeta;
        boolean valido = false;
        int pin;
        float cuenta1Saldo = cuenta1.getSaldo();
        float cuenta2Saldo = cuenta2.getSaldo();
        float cuenta3Saldo = cuenta3.getSaldo();
        do {
            System.out.println("Introduce la tarjeta!!!! ");
            tarjeta = Lib.leerInt();

            if (tarjeta == tarjeta1.getNuemroTarjeta() || tarjeta == tarjeta2.getNuemroTarjeta() ||
                    tarjeta == tarjeta3.getNuemroTarjeta()){
                valido = true;
            }

        }while (!valido);
        if (tarjeta == tarjeta1.getNuemroTarjeta()){
            do {
                System.out.println("Escribe el pin de la tarjeta");
                pin = Lib.leerInt();
                if (pin == tarjeta1.getPin()){
                    System.out.println("Pin correcto!!!");
                    System.out.println("Escribe la cantidad que quieres ingresar: ");
                    ingreso = Lib.leerFloat();
                    cuenta1.setSaldo(cuenta1Saldo + ingreso);
                    validoTarjeta = true;
                }
            }while (!validoTarjeta);
        }else if (tarjeta == tarjeta2.getNuemroTarjeta()){
            do {
                System.out.println("Escribe el pin de la tarjeta: ");
                pin = Lib.leerInt();
                if (pin == tarjeta2.getPin()){
                    System.out.println("Pin correcto!!!");
                    System.out.println("Escribe la cantidad que quieres ingresar: ");
                    ingreso = Lib.leerFloat();
                    cuenta1.setSaldo(cuenta2Saldo + ingreso);
                    validoTarjeta = true;
                }
            }while (!validoTarjeta);
        }else if (tarjeta == tarjeta3.getNuemroTarjeta()) {
            do {
                System.out.println("Escribe el pin de la tarjeta: ");
                pin = Lib.leerInt();
                if (pin == tarjeta3.getPin()) {
                    System.out.println("Pin correcto!!!");
                    System.out.println("Escribe la cantidad que quieres ingresar: ");
                    ingreso = Lib.leerFloat();
                    cuenta1.setSaldo(cuenta3Saldo + ingreso);
                    validoTarjeta = true;
                }
            } while (!validoTarjeta);
        }
    }
    private void consultarSaldo() {
        int tarjeta;
        int intentos = 3;
        boolean validoTarjeta = false;
        boolean valido = false;
        int pin = 0;

        do {
            System.out.println("Introduce la tarjeta!!!! ");
            tarjeta = Lib.leerInt();

            if (tarjeta == tarjeta1.getNuemroTarjeta() || tarjeta == tarjeta2.getNuemroTarjeta() ||
                    tarjeta == tarjeta3.getNuemroTarjeta()){
                valido = true;
            }

        }while (!valido);

        if (tarjeta == tarjeta1.getNuemroTarjeta()){
            do {
                System.out.println("Escribe el pin de la tarjeta");
                pin = Lib.leerInt();
                if (pin == tarjeta1.getPin()){
                    System.out.println("Pin correcto!!!");
                    System.out.println("Saldo de la cuenta: " + cuenta1.getSaldo());
                    validoTarjeta = true;
                }else {
                    intentos--;
                    System.out.println("Pin incorrecto, tiene " + intentos + " intentos!!!");
                }
            }while (!validoTarjeta && intentos !=0);

        }else if (tarjeta == tarjeta2.getNuemroTarjeta()){
            do {
                System.out.println("Escribe el pin de la tarjeta");
                pin = Lib.leerInt();
                if (pin == tarjeta2.getPin()){
                    System.out.println("Pin correcto!!!");
                    System.out.println("Saldo de la cuenta: " + cuenta2.getSaldo());
                    validoTarjeta = true;
                }else {
                    intentos--;
                    System.out.println("Pin incorrecto, tiene " + intentos + " intentos!!!");
                }
            }while (!validoTarjeta || intentos !=0);

        }else if (tarjeta == tarjeta3.getNuemroTarjeta()){
            do {
                System.out.println("Escribe el pin de la tarjeta");
                pin = Lib.leerInt();
                if (pin == tarjeta3.getPin()){
                    System.out.println("Pin correcto!!!");
                    System.out.println("Saldo de la cuenta: " + cuenta3.getSaldo());
                    validoTarjeta = true;
                }else {
                    intentos--;
                    System.out.println("Pin incorrecto, tiene " + intentos + " intentos!!!");
                }
            }while (!validoTarjeta || intentos !=0);
        }
        //Se deberia de bloquear la tarjeta que ha superado los intentos, no se me ocurre ninguna forma...
        intentos = 3;
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





