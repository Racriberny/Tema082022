package com.cristobalbernal.Tema082022.CajeroAutomatico;

public class Tarjeta {
    private long nuemroTarjeta;
    private int pin;
    private int cvc;

    public Tarjeta(long nuemroTarjeta, int pin, int cvc) {
        this.nuemroTarjeta = nuemroTarjeta;
        this.pin = pin;
        this.cvc = cvc;
    }

    public long getNuemroTarjeta() {
        return nuemroTarjeta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getCvc() {
        return cvc;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "nuemroTarjeta=" + nuemroTarjeta +
                ", pin=" + pin +
                ", cvc=" + cvc +
                '}';
    }
}
