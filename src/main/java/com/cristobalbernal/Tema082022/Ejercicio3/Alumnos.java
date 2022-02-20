package com.cristobalbernal.Tema082022.Ejercicio3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Alumnos{" +
                "nia='" + nia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_nacimiento='" + simpleDateFormat.format(fecha_nacimiento.getTime()) + '\'' +
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
    public int getEdad(){
        LocalDate hoy = LocalDate.now();
        int anyo = fecha_nacimiento.get(Calendar.YEAR);
        int mes = fecha_nacimiento.get(Calendar.MONTH) + 1;
        int dia = fecha_nacimiento.get(Calendar.DAY_OF_MONTH);
        LocalDate cumple = LocalDate.of(anyo , mes , dia);
        Period periodo = Period.between(cumple, hoy);
        return periodo.getYears();
    }

}
