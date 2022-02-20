package com.cristobalbernal.Tema082022.Ejercicio6;

import java.util.Date;
import java.util.GregorianCalendar;

public class Bicicleta {
    private String referencia;
    private String marca;
    private int peso;
    private int pulgadasRueda;
    private boolean motor;
    private Date fechaFabricacion;
    private double precio;
    private int numeroExistencias;


    public Bicicleta(String referencia, String marca, int peso, int pulgadasRueda, boolean motor, Date fechaFabricacion, double precio, int numeroExistencias) {
        this.referencia = referencia;
        this.marca = marca;
        this.peso = peso;
        this.pulgadasRueda = pulgadasRueda;
        this.motor = motor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.numeroExistencias = numeroExistencias;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPulgadasRueda() {
        return pulgadasRueda;
    }

    public void setPulgadasRueda(int pulgadasRueda) {
        this.pulgadasRueda = pulgadasRueda;
    }

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumeroExistencias() {
        return numeroExistencias;
    }

    public void setNumeroExistencias(int numeroExistencias) {
        this.numeroExistencias = numeroExistencias;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "referencia='" + referencia + '\'' +
                ", marca='" + marca + '\'' +
                ", peso=" + peso +
                ", pulgadasRueda=" + pulgadasRueda +
                ", motor=" + motor +
                ", fechaFabricacion=" + fechaFabricacion +
                ", precio=" + precio +
                ", numeroExistencias=" + numeroExistencias +
                '}';
    }
}
