package com.cristobalbernal.Tema082022.Ejercicio3;

import com.cristobalbernal.Tema082022.CajeroGerman.Config;
import com.cristobalbernal.Tema082022.Lib.Lib;
import com.github.javafaker.Faker;

import java.util.Locale;

public class Principal {
    private static final int ALUMNOS =  1000;
    private static final int MAXIMO_TELEFONO = 8;
    private static final String[] GRUPOS = {"1DAM","2DAM","1SMX","2SMX"};
    private static final int MIN = 1000;
    private int numeroAlumnos;
    Alumnos [] alumnos;

    public Principal(){
        alumnos = new Alumnos[ALUMNOS];
        numeroAlumnos = 0;
        //datosPrueba();
        //datosDePruebaFaker();
    }
    public void execute(){

        int opcion;
        do {
            opcion = menuPrincipal();
            switch (opcion){
                case 1: nuevoAlumno();
                break;
                case 2: bajaAlumno();
                break;
                case 3: consultas();
                break;
            }
        }while (opcion !=0);
        System.out.println("Has salido");
    }

    private void consultas() {
        int opcion;
        String nia;
        String grupo;
        do {
            opcion = menuConsultas();
            switch (opcion){
                case 1:
                    System.out.println("Escribe un grupo");
                    grupo = Lib.leerLinea();
                    busquedaGrupo(grupo);
                    break;
                case 2:
                    busquedaEdad();
                    break;
                case 3:
                    System.out.println("Escribe el nia: ");
                    nia = Lib.leerLinea();
                    busquedaNia(nia);
                    break;
                case 4:
                    busquedaApellidos();
                    break;
            }
        }while (opcion !=0);
    }

    private void busquedaApellidos() {
        String apellidos;
        System.out.println("Escribe el apellido: ");
        apellidos = Lib.leerLinea();
        for (int i = 0; i < alumnos.length ; i++) {
            if (alumnos[i].getApellidos().equals(apellidos)){
                System.out.println(apellidos);
            }else {
                System.out.println("No se ha encontrado ese apellido!!!!");
            }
        }
    }

    private int busquedaNia(String nia) {
        for (int i = 0; i < alumnos.length ; i++) {
            if (alumnos[i].getNia().equals(nia)){
                return i;
            }
        }
        return -1;
    }

    private void busquedaEdad() {
    }

    private void busquedaGrupo(String grupo) {
        int encontrado = 0;
        for (int i = 0; i <alumnos.length ; i++) {
            if (alumnos[i].getGrupo().equals(grupo)){
                System.out.println(alumnos[i]);
            }else {
                System.out.println("No se ha encontrado nadie en este grupo!!!");
            }
        }

    }

    private void bajaAlumno() {
        String nia;
        int posicionNia;

        System.out.println("Baja alumno: ");
        System.out.println("Escribe le nia del alumno: ");
        nia = Lib.leerLinea();

        posicionNia = busquedaNia(nia);

        if (posicionNia >=0){
            alumnos[posicionNia] = null;
            System.out.println("El alumno se ha borrado correctamente!!!");
        }else {
            System.out.println("No existe ningun alumno con este nia!!");
        }
    }

    private void nuevoAlumno() {
        String nia;
        String nombre;
        String apellido;
        String fechaNacimiento;
        String grupo;
        String telefono;
        boolean validado = false;
        //Aqui la recomendacion es hacer una validacion que lo que le introduces tiene algun caracter...
        do {
            System.out.println("Escribe el nia de 4 digitos:  ");
            nia = Lib.leerLinea();
            for (int i = 0; i <alumnos.length ; i++) {
                if (alumnos[i].getNia().equals(nia)){
                    System.out.println("Ya existe un alumno con este nia!!!");
                }else {
                    System.out.println("Escribe el nombre del alumno: ");
                    nombre = Lib.leerLinea();

                    System.out.println("Escribe el apellido del alumno: ");
                    apellido = Lib.leerLinea();

                    System.out.println("Escribe la fecha de nacimiento: ");
                    fechaNacimiento = Lib.leerLinea();

                    System.out.println("Escribe al grupo al que pertenece: ");
                    grupo = Lib.leerLinea();

                    System.out.println("Escribe el telefono del alumno: ");
                    telefono = Lib.leerLinea();

                    alumnos[i] = new Alumnos(nia,nombre,apellido,fechaNacimiento,grupo,telefono);

                    validado = true;
                }
            }
        }while (validado);
    }

    public int menuPrincipal(){
        int option = 0;
        System.out.println("**GESTION ALUMNOS**");
        System.out.println("*******************");
        System.out.println("1. Nuevo alumno...");
        System.out.println("2. Baja de alumnos...");
        System.out.println("3. Consultas...");
        System.out.println("--------------------");
        System.out.println("0. Salir");
        System.out.println("Escribe una opcion: ");
        option = Lib.leerInt();
        return option;
    }

    public int menuConsultas(){
        int option = 0;
        System.out.println("**CONSULTAS**");
        System.out.println("*******************");
        System.out.println("1. Por grupo...");
        System.out.println("2. Por edad...");
        System.out.println("3. Por nia...");
        System.out.println("4. Por apellidos...");
        System.out.println("--------------------");
        System.out.println("0. Volver al  menu principal");
        System.out.println("Escribe una opcion: ");
        option = Lib.leerInt();
        return option;
    }
    private void datosPrueba(){
        for (int i = 0; i <alumnos.length ; i++) {
            alumnos[i] = new Alumnos(String.format("%4d",Lib.numeroAleatorio(Config.MIN_NIA,Config.MAX_NIA)),
                    "Alumnos " +(i+1),"Apellido " + (i+1),"Fecha " + (i+1),
                    "Grupo " + (i+1),String.format("%9d",Lib.numeroAleatorio(Config.MIN_TLF,Config.MAX_TLF)));
        }
        for(Alumnos alumno: alumnos) {
            System.out.println(alumno.toString());
        }
    }
    private void datosDePruebaFaker(){
        Faker faker = new Faker(Locale.forLanguageTag("es"));
        String nia;
        String nombre;
        String apellidos;
        String fecha_nacimiento;
        String grupo;
        String telefono;

        for (int i = 0; i <alumnos.length ; i++) {
            nia = faker.idNumber().valid();
            nombre = faker.name().firstName();
            apellidos = faker.name().lastName();
            fecha_nacimiento = faker.date().birthday().toString();
            grupo = String.valueOf(Lib.numeroAleatorio(0,GRUPOS.length));
            telefono = faker.phoneNumber().phoneNumber();
            alumnos[numeroAlumnos] = new Alumnos(nia,nombre,apellidos,fecha_nacimiento,grupo,telefono);
            numeroAlumnos++;
        }
        for(Alumnos alumno: alumnos) {
            System.out.println(alumno.toString());
        }
    }

}
