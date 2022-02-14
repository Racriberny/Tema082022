package com.cristobalbernal.Tema082022.Ejercicio3German;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Alumno {
    private final long nia;
    private final String nombre;
    private final String apellidos;
    private final GregorianCalendar fecha;
    private final String curso;
    private final long telefono;

    public Alumno(long nia, String nombre, String apellidos, GregorianCalendar fecha, String curso, long telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;
        this.curso = curso;
        this.telefono = telefono;
    }

    public long getNia() {
        return nia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public String getCurso() {
        return curso;
    }

    public long getTelefono() {
        return telefono;
    }
    public int getEdad(){
        int anyoNacimiento = fecha.get(Calendar.YEAR);
        int mesNacimiento = fecha.get(Calendar.MONTH) + 1;
        int diaNacimiento = fecha.get(Calendar.DAY_OF_MONTH);

        GregorianCalendar fecha = new GregorianCalendar();

        int anyoActual = fecha.get(Calendar.YEAR);
        int mesActual = fecha.get(Calendar.MONTH) + 1;
        int diaActual = fecha.get(Calendar.DAY_OF_MONTH);

        int edad = anyoActual - anyoNacimiento;

        if (mesActual < mesNacimiento){
            edad--;
        }else if(mesActual == mesNacimiento){
            if (diaActual < diaNacimiento){
                edad--;
            }
        }

        return edad;
    }

    public int getEdadDos(){
        int anyoNacimiento = fecha.get(Calendar.YEAR);
        int mesNacimiento = fecha.get(Calendar.MONTH) + 1;
        int diaNacimiento = fecha.get(Calendar.DAY_OF_MONTH);
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(diaNacimiento,mesNacimiento,anyoNacimiento);
        Period periode = Period.between(fechaActual,fechaNacimiento);
        return periode.getYears();
    }
}
