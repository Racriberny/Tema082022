package com.cristobalbernal.Tema082022.Ejercicio7;

import com.cristobalbernal.Tema082022.Lib.Lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {
    private static final int MAX_PACIENTES = 500;
    private static final int MAX_REGISTROS_HISTORICO = 2000;
    private Centro centro;
    public void execute(){
        int opcion;
        centro = new Centro(MAX_PACIENTES,MAX_REGISTROS_HISTORICO);
        //centro.generarPaciente(MAX_PACIENTES);
        //centro.generarHistoria(MAX_REGISTROS_HISTORICO);

        do {
            opcion = menuCentro();
            switch (opcion){
                case 1:
                    nuevoPaciente();
                    break;
                case 2:
                    break;
                case 3:
                    consultas();
                    break;
                case 4:
                    break;
                case 5:
                    centro.mostrarPacientes();
                break;

            }

        }while (opcion !=0);
    }

    private void nuevoPaciente() {
        int pos;
        boolean validado = false;
        String sip;
        System.out.println("Nuevo paciente: ");
        do {
            System.out.println("Escribe el sip:");
            sip = Lib.leerLinea();
            validado = sip.length() != 0;
        }while (!validado);
        pos = centro.buscarPacientePorSip(sip);

        if (pos < 0){
            String repuesta = "";
            System.out.println("No se ha encontrado ninguno paciente con este sip, dea registrarlo???");
            repuesta = Lib.leerLinea();

            if("si".equals(repuesta)){
                String nombre;
                String apellido;
                int edad;
                Paciente.Sexo sexos = null;
                String sexo;
                do {
                    System.out.println("Escribe el nombre del paciente:");
                    nombre = Lib.leerLinea();
                    validado = nombre.length() != 0;
                }while (!validado);
                do {
                    System.out.println("Escribe el apellido del paciente: ");
                    apellido = Lib.leerLinea();
                    validado = apellido.length() != 0;
                }while (!validado);
                do {
                    System.out.println("Escribe la edad del paciente: ");
                    edad = Lib.leerInt();
                    validado = edad >= 0 && edad <= 100;
                }while (!validado);
                do {
                    System.out.println("Sexo ([F-M]: ");
                    sexo = Lib.leerLinea();
                    if(sexo.equalsIgnoreCase("m") ) {
                        sexos = Paciente.Sexo.MASCULINO;
                        validado = true;
                    } else if (sexo.equalsIgnoreCase("f")) {
                        sexos = Paciente.Sexo.FEMENINO;
                        validado = true;
                    } else {
                        validado = false;
                        System.out.println("Debe indicar 'F' ó 'M'");
                    }
                } while (!validado);
                String sintomas;
                String fecha_entrada;
                GregorianCalendar fechaFecha = null;
                do {
                    System.out.println("Escribe los sintomas del paciente: ");
                    sintomas = Lib.leerLinea();
                    validado = sintomas.length() !=0;
                }while (!validado);

                do {
                    System.out.println("Escribe la fecha dd/mm/yyyy");
                    fecha_entrada = Lib.leerLinea();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    try{
                        Date date = sdf.parse(fecha_entrada);
                        fechaFecha = new GregorianCalendar();
                        fechaFecha.setTime(date);
                        validado = true;
                    }catch (ParseException pe){
                        validado = false;
                        System.out.println("La fecha es incorrecta");

                    }
                }while (!validado);
                System.out.println(centro.nuevoPaciente(sip,nombre,apellido,sexos,edad,sintomas,fechaFecha));
                System.out.println("Paciente registrado correctamente!!!");
                System.out.println("Ves a la sala de espera!!");
            }else if ("no".equals(repuesta)){
                System.out.println("Has elegido no registrar el paciente!!!");
            }else {
                System.out.println("has introducido una respuesto incorrecta");
            }
        }
    }

    private void consultas() {
        int opcion;
        String sip;
        boolean validado = false;
       do {
            opcion = menuConsultas();
            switch (opcion){
                case 1:
                    do {
                        System.out.println("Escribe el sip:");
                        sip = Lib.leerLinea();
                        validado = sip.length() != 0;
                    }while (!validado);
                    centro.buscarPacientePorSip(sip);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while (opcion !=0);
    }

    private int menuConsultas() {
        int opcion;
        System.out.println("*************");
        System.out.println("**CONSULTAS**");
        System.out.println("*************");
        System.out.println("1- Por Sip...");
        System.out.println("2- Por fecha...");
        System.out.println("3- Estadisticas...");
        System.out.println("4- Mostrar historica mensual");
        System.out.println("0- Volver al menu principal");
        System.out.println("Elige una opcion: ");
        opcion = Lib.leerInt();
        return opcion;
    }

    private int menuCentro() {
        int opcion;
        System.out.println("*******************");
        System.out.println("*****URGENCIAS*****");
        System.out.println("*******************");
        System.out.println("1- Nuevo paciente");
        System.out.println("2- Atender paciente");
        System.out.println("3- Consultas");
        System.out.println("4- Alta medica");
        System.out.println("Elige una opcion:");
        opcion = Lib.leerInt();
        return opcion;
    }


}
