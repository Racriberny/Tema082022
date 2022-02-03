package com.cristobalbernal.Tema082022.CajeroGerman;

import com.cristobalbernal.Tema082022.Lib.Lib;

public class Cajero {
    private static final int MIN = 1000;
    private static final int MAX = 9999;
    private static final int CANTIDAD_CUENTAS = 10;

    public void execute(){
        Cuenta[] cuentas = new Cuenta[CANTIDAD_CUENTAS];
        for (int i = 0; i <cuentas.length ; i++) {
            cuentas[i] = new Cuenta(
                    String.valueOf(Lib.numeroAleatorio(MIN,MAX)),"Propietario " + (i+1));
            cuentas[i].crearTarjeta();
        }
        for (Cuenta cuenta : cuentas){
            System.out.println(cuenta.toString());
        }
    }
}
