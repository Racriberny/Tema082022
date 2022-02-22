package com.cristobalbernal.Tema082022.Ejercicio7;

import com.cristobalbernal.Tema082022.Lib.Lib;
import com.github.javafaker.Faker;

import java.util.GregorianCalendar;
import java.util.Locale;

public class Centro {
    private static final int NUM_PACIENTES = 10;

    public void generarPaciente(Paciente[] pacientes,int nPacientes){
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
            pacientes[nPacientes] = new Paciente(sip,nombre,apellido,edad,sexo);
            nPacientes++;
        }

        for (Paciente pa:pacientes) {
            System.out.println(pa);
        }
    }

    public void generarHistoria(AtencionMedica[] atencionMedicas,int numHistorial){
        Faker faker = new Faker(Locale.forLanguageTag("es"));
        String sintomolagia;
        Paciente paciente;
        GregorianCalendar fechaEntrada;
        GregorianCalendar fechaSalida;
        int horaDeEntrada;
        float[] preV = new float[4];
        for (int i = 0; i <numHistorial ; i++) {
            sintomolagia = faker.name().prefix();
            paciente = new Paciente(faker.idNumber().valid(),faker.name().name(),faker.name().firstName(),Lib.numeroAleatorio(1,90),Lib.numeroAleatorio(0,1) == 0 ? Paciente.Sexo.FEMENINO : Paciente.Sexo.MASCULO);
            fechaEntrada = new GregorianCalendar();
            fechaEntrada.setTime(faker.date().birthday(18,80));
            fechaSalida = new GregorianCalendar();
            fechaSalida.setTime(faker.date().birthday(18,80));
            horaDeEntrada = Lib.numeroAleatorio(0,24);
            preV[0] = Lib.numeroAleatorio(34,42);
            preV[1] = Lib.numeroAleatorio(66,120);
            preV[2] = Lib.numeroAleatorio(80,120);
            preV[3] = Lib.numeroAleatorio(80,84);
            atencionMedicas[i] = new AtencionMedica(sintomolagia,paciente,fechaEntrada,fechaSalida,horaDeEntrada,preV);
        }
        for (AtencionMedica ate: atencionMedicas) {
            System.out.println(ate);
        }
    }
}
