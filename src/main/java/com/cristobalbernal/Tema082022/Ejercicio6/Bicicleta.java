package com.cristobalbernal.Tema082022.Ejercicio6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Bicicleta {
    private String referencia;
    private String marca;
    private String modelo;
    private double peso;
    private int pulgadasRueda;
    private boolean motor;
    private GregorianCalendar fechaFabricacion;
    private double precio;
    private int numeroExistencias;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Bicicleta(String referencia, String marca, String modelo, double peso, int pulgadasRueda, boolean motor, GregorianCalendar fechaFabricacion, double precio, int numeroExistencias) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
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

    public double getPeso() {
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

    public GregorianCalendar getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(GregorianCalendar fechaFabricacion) {
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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Bicicleta{" +
                "referencia='" + referencia + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo + '\'' +
                ", peso=" + peso +
                ", pulgadasRueda=" + pulgadasRueda +
                ", motor=" + motor +
                ", fechaFabricacion=" + simpleDateFormat.format(fechaFabricacion.getTime()) +
                ", precio=" + precio +
                ", numeroExistencias=" + numeroExistencias +
                '}';
    }
}
