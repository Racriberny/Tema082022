package com.cristobalbernal.Tema082022.CajeroGerman;


import com.cristobalbernal.Tema082022.Lib.Lib;

public class Cuenta {
    private static final int MIN_NUMERO_TARJETA = 1000;
    private static final int MAX_NUMERO_TARJETA = 9999;
    private static final int MIN_CODIGO = 100;
    private static final int MAX_CODIGO = 999;

    private String numero;
    private String propietario;
    private double saldo;
    private Tarjeta tarjeta;

    public Cuenta(String numero, String propietario) {
        this.numero = numero;
        this.propietario = propietario;
        // No son necesarias en Java
        saldo = 0;
        tarjeta = null;
    }

    public Tarjeta crearTarjeta() {
        if(tarjeta == null) {
            tarjeta = new Tarjeta(
                    String.valueOf(Lib.numeroAleatorio(MIN_NUMERO_TARJETA,MAX_NUMERO_TARJETA)),
                    String.valueOf(Lib.numeroAleatorio(MIN_NUMERO_TARJETA,MAX_NUMERO_TARJETA)),
                    String.valueOf(Lib.numeroAleatorio(MIN_CODIGO,MAX_CODIGO)));
            return tarjeta;
        }
        return null;
    }


    @Override
    public String toString() {
        return "Cuenta{" +
                "numero='" + numero + '\'' +
                ", propietario='" + propietario + '\'' +
                ", saldo=" + saldo +
                ", tarjeta=" + tarjeta +
                '}';
    }


}
