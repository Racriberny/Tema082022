package com.cristobalbernal.Tema082022.CajeroAutomatico;

public class Cuenta {
    private String propietario;
    private float saldo;
    Tarjeta tarjeta;

    public float getSaldo() {
        return saldo;
    }
    public float ingreso(float cantidadIngreso){
        return saldo + cantidadIngreso;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float extraccion(int retirada){
        return getSaldo()-retirada;
    }

    public Cuenta(String propietario, float saldo, Tarjeta tarjeta) {
        this.propietario = propietario;
        this.saldo = saldo;
        this.tarjeta = tarjeta;
    }
}
