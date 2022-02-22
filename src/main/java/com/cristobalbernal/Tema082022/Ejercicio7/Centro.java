package com.cristobalbernal.Tema082022.Ejercicio7;

import com.cristobalbernal.Tema082022.Lib.Lib;
import com.github.javafaker.Faker;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Centro {
    private static final int NUM_PACIENTES = 10;
    private Paciente[] pacientes;
    private AtencionMedica[] historial;
    private  int nPacientes;
    private  int nHistorial;


    public Centro(int numPacientes, int numHistorico){
        pacientes = new Paciente[numPacientes];
        historial = new AtencionMedica[numHistorico];

    }



    public void generarPaciente(int nPacientes){
        Faker faker = new Faker(Locale.forLanguageTag("es"));
        String sip;
        String nombre;
        String apellido;
        Paciente.Sexo sexo;
        int edad;
        for (int i = 0; i <nPacientes ; i++) {
            sip = faker.idNumber().valid();
            nombre = faker.name().name();
            apellido = faker.name().firstName();
            sexo = Lib.numeroAleatorio(0,1) == 0 ? Paciente.Sexo.FEMENINO : Paciente.Sexo.MASCULO;
            edad = Lib.numeroAleatorio(1,100);
            pacientes[i] = new Paciente(sip,nombre,apellido,edad,sexo);
            this.nPacientes++;
        }

        for (Paciente pa:pacientes) {
            System.out.println(pa.toString());
        }
    }

    public Paciente[] getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }

    public AtencionMedica[] getHistorial() {
        return historial;
    }

    public void setHistorial(AtencionMedica[] historial) {
        this.historial = historial;
    }

    public int getnPacientes() {
        return nPacientes;
    }

    public void setnPacientes(int nPacientes) {
        this.nPacientes = nPacientes;
    }

    public int getnHistorial() {
        return nHistorial;
    }

    public void setnHistorial(int nHistorial) {
        this.nHistorial = nHistorial;
    }

    public void generarHistoria(int numHistorial){
        Faker faker = new Faker(Locale.forLanguageTag("es"));
        int anyoActual = new GregorianCalendar().get(Calendar.YEAR);
        int mesActual = new GregorianCalendar().get(Calendar.MONTH);
        int diaActual = new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
        String sintomolagia;
        Paciente paciente;
        int anyo = anyoActual;
        int mes = mesActual;
        int dia = Lib.numeroAleatorio(1, diaActual);
        int hora = Lib.numeroAleatorio(0,23);
        int minutos = Lib.numeroAleatorio(0,59);
        float[] preV = new float[4];
        for (int i = 0; i <numHistorial ; i++) {
            sintomolagia = faker.name().prefix();
            paciente = new Paciente(faker.idNumber().valid(),faker.name().name(),faker.name().firstName(),Lib.numeroAleatorio(1,90),Lib.numeroAleatorio(0,1) == 0 ? Paciente.Sexo.FEMENINO : Paciente.Sexo.MASCULO);
            GregorianCalendar fechaEntrada = new GregorianCalendar(anyo, mes, dia, hora, minutos);
            GregorianCalendar fechaSalida = new GregorianCalendar(anyo, mes-1,dia,hora,minutos);
            historial[i] = new AtencionMedica(sintomolagia,paciente,fechaEntrada,fechaSalida,preV);
        }
        for (AtencionMedica ate: historial) {
            System.out.println(ate.toString());
        }
    }

    public AtencionMedica[] buscarHistoricoPorSip(int sip) {
        return null;
    }

    public int buscarPacientePorSip(String sip){
        return 1;
    }

    public AtencionMedica[] buscarHistoricoPorFechas(GregorianCalendar fechaInicio, GregorianCalendar fechaFin) {
        return null;
    }
    public int nuevoPaciente(int sip, String nombre, String apellido1, String apellido2, Paciente.Sexo sexo, int edad) {
        return nPacientes;
    }


}
