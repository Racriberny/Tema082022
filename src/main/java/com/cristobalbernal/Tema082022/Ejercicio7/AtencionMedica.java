package com.cristobalbernal.Tema082022.Ejercicio7;

import java.util.GregorianCalendar;

public class AtencionMedica {
    private String sintomalogia;
    private Paciente paciente;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;
    private int horaEntrada;
    private float[] preRev;

    public AtencionMedica(String sintomalogia, Paciente paciente, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida, int horaEntrada, float[] preRev) {
        this.sintomalogia = sintomalogia;
        this.paciente = paciente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.horaEntrada = horaEntrada;
        this.preRev = new float[4];
    }
}
