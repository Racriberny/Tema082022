package com.cristobalbernal.Tema082022.Ejercicio4;

public class Punto {
    private double x;
    private double y;

    public Punto(){
        x = 2.17;
        y = 6.28;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Punto punto){
        return Math.sqrt((Math.pow((punto.getX()- x),2) + Math.pow((punto.getY()- y),2)));
    }

    public static double calcularDistancia(Punto p1, Punto p2) {
        return Math.sqrt((Math.pow((p1.getX() - p2.getX()),2) + Math.pow((p1.getY()- p2.getY()),2)));
    }

    public String visualizarPunto(){
        return "(" + x + " , " + y + ")";
    }
}
