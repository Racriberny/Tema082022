package com.cristobalbernal.Tema082022.Ejercicio3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Alumnos {
    private String nia;
    private String nombre;
    private String apellidos;
    private GregorianCalendar fecha_nacimiento;
    private String grupo;
    private String telefono;

    @Override
    public String toString() {
        return "Alumnos{" +
                "nia='" + nia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", grupo='" + grupo + '\'' +
                ", telefono=" + telefono +
                '}';
    }

    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public GregorianCalendar getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(GregorianCalendar fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Alumnos(String nia, String nombre, String apellidos, GregorianCalendar fecha_nacimiento, String grupo, String telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grupo = grupo;
        this.telefono = telefono;
    }
    public int getEdadDos(){
        int anyoNacimiento = fecha_nacimiento.get(Calendar.YEAR);
        int mesNacimiento = fecha_nacimiento.get(Calendar.MONTH) + 1;
        int diaNacimiento = fecha_nacimiento.get(Calendar.DAY_OF_MONTH);
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(diaNacimiento,mesNacimiento,anyoNacimiento);
        Period periode = Period.between(fechaActual,fechaNacimiento);
        return periode.getYears();
    }
}
