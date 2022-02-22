package com.cristobalbernal.Tema082022.Ejercicio7;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.GregorianCalendar;

public class AtencionMedica {
    private String sintomalogia;
    private Paciente paciente;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;
    private float[] preRev;


    public AtencionMedica(String sintomalogia, Paciente paciente, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida, float[] preRev) {
        this.sintomalogia = sintomalogia;
        this.paciente = paciente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.preRev = preRev;
    }

    public AtencionMedica(Paciente paciente,String sintomalogia, GregorianCalendar fechaEntrada) {
        this.sintomalogia = sintomalogia;
        this.fechaEntrada = fechaEntrada;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "AtencionMedica{" +
                "sintomalogia='" + sintomalogia + '\'' +
                ", paciente=" + paciente +
                ", fechaEntrada=" + simpleDateFormat.format(fechaEntrada.getTime()) +
                ", fechaSalida=" + simpleDateFormat.format(fechaSalida.getTime()) +
                ", preRev=" + Arrays.toString(preRev) +
                '}';
    }
}
