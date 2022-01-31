package com.cristobalbernal.Tema082022.Ejercicio1;

public class Coche {
    private String modelo;
    private Color color;
    private boolean metalizado;
    private String matricula;
    private Tipo tipo;
    private String fechaFabricacion;
    private Seguro seguro;

    public Coche(){
        modelo = "Seat Ibiza";
        color = Color.AZUL;
        metalizado = true;
        matricula = "4613CRR";
        tipo = Tipo.DEPORTIVO;
        fechaFabricacion = "2021";
        seguro = Seguro.TODORIESGO;
    }

    public Coche(String modelo, Color color, boolean metalizado, String matricula, Tipo tipo, String fechaFabricacion, Seguro seguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.tipo = tipo;
        this.fechaFabricacion = fechaFabricacion;
        this.seguro = seguro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isMetalizado() {
        return metalizado;
    }

    public void setMetalizado(boolean metalizado) {
        this.metalizado = metalizado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public String imprimirCotxe(){
        return "Modelo: " + modelo + "Color: " + color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", color=" + color +
                ", metalizado=" + metalizado +
                ", matricula='" + matricula + '\'' +
                ", tipo=" + tipo +
                ", fechaFabricacion='" + fechaFabricacion + '\'' +
                ", seguro=" + seguro +
                '}';
    }
}
