package com.cristobalbernal.Tema082022.CajeroGerman;

import com.cristobalbernal.Tema082022.Lib.Lib;

public class Cuenta {
    private static final int MIN_NUMERO_TARJETA = 1000;
    private static final int MAX_NUMERO_TARJETA = 9999;
    private static final int MIN_SEGURIDAD = 100;
    private static final int MAX_SEGURIDAD = 999;


    private String numero;
    private String propietario;
    private int saldo;
    private Tarjeta tarjeta;

    public Cuenta(String numero, String propietario) {
        this.numero = numero;
        this.propietario = propietario;
        saldo = 0;
    }

    public Tarjeta crearTarjeta(){
        tarjeta = new Tarjeta(String.valueOf(Lib.numeroAleatorio(MIN_NUMERO_TARJETA,MAX_NUMERO_TARJETA)),
                String.valueOf(Lib.numeroAleatorio(MIN_NUMERO_TARJETA,MAX_NUMERO_TARJETA)),
                String.valueOf(Lib.numeroAleatorio(MIN_SEGURIDAD,MAX_SEGURIDAD)));
        return tarjeta;
    }



    @Override
    public String toString() {
        return "Cuenta{" +
                "numero='" + numero + '\'' +
                ", propietario='" + propietario + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
