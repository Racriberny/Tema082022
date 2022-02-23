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

    public void mostrarPacientes(){
        for (int i = 0; i <nPacientes ; i++) {
            System.out.println(pacientes[i]);
        }
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
            sexo = Lib.numeroAleatorio(0,1) == 0 ? Paciente.Sexo.FEMENINO : Paciente.Sexo.MASCULINO;
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
        int temperatura;
        int pulsaciones;
        int teSis;
        int teDias;
        float[] preV = new float[4];
        for (int i = 0; i <numHistorial ; i++) {
            sintomolagia = faker.medical().symptoms();
            paciente = new Paciente(faker.idNumber().valid(),faker.name().name(),faker.name().firstName(),Lib.numeroAleatorio(1,90),Lib.numeroAleatorio(0,1) == 0 ? Paciente.Sexo.FEMENINO : Paciente.Sexo.MASCULINO);
            GregorianCalendar fechaEntrada = new GregorianCalendar(anyo, mes, dia, hora, minutos);
            temperatura = Lib.numeroAleatorio(35,42);
            pulsaciones = Lib.numeroAleatorio(60,120);
            teSis = Lib.numeroAleatorio(80,84);
            teDias = Lib.numeroAleatorio(50,54);
            preV[0] = temperatura;
            preV[1] = pulsaciones;
            preV[2] = teSis;
            preV[3] = teDias;
            GregorianCalendar fechaSalida = new GregorianCalendar(anyo, mes + 1,dia,hora,minutos);
            historial[i] = new AtencionMedica(sintomolagia,paciente,fechaEntrada,fechaSalida,preV);
        }
        for (AtencionMedica ate: historial) {
            System.out.println(ate.toString());
        }
    }

    public AtencionMedica[] buscarHistoricoPorSip(int sip) {
        return null;
    }

    public Paciente buscarPacientePorSip(String sip){
        for (int i = 0; i <nPacientes ; i++) {
            if (pacientes[i].getSip().equals(sip)){
                return pacientes[i];
            }
        }
        return null;
    }
    public int busquedaPacientePorSip(String sip){
        for (int i = 0; i <nPacientes ; i++) {
            if (pacientes[i].getSip().equals(sip)){
                return i;
            }
        }
        return -1;
    }

    public AtencionMedica[] buscarHistoricoPorFechas(GregorianCalendar fechaInicio, GregorianCalendar fechaFin) {
        return null;
    }
    public AtencionMedica nuevoPaciente(String sip, String nombre, String apellido1, Paciente.Sexo sexo, int edad,String sintomas,GregorianCalendar fechaEntrada) {
        Paciente paciente = new Paciente(sip,nombre,apellido1,edad,sexo);
        pacientes[nPacientes] = paciente;
        nPacientes++;

        AtencionMedica atencionMedica = new AtencionMedica(paciente,sintomas,fechaEntrada);
        historial[nHistorial] = atencionMedica;
        nHistorial++;
        return atencionMedica;


    }
}
