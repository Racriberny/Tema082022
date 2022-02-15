package com.cristobalbernal.Tema082022.Ejercicio3;

import com.cristobalbernal.Tema082022.Lib.Lib;
import com.github.javafaker.Faker;

import java.util.GregorianCalendar;
import java.util.Locale;

public class Principal {
    private static final int ALUMNOS =  1;
    private static final String[] GRUPOS = {"1DAM","2DAM","1SMX","2SMX"};
    private static final int MIN = 1000;
    private static final int MIN_NOMBRE = 3 ;
    private static final int MIN_APELLIDO = 3 ;
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
                case 4:
                    visualizarAlumnos();
                    break;
            }
        }while (opcion !=0);
        System.out.println("Has salido");
    }

    private void visualizarAlumnos() {
        for (int i = 0; i < alumnos.length ; i++) {
            System.out.println(alumnos[i]);
        }
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
            numeroAlumnos--;
        }else {
            System.out.println("No existe ningun alumno con este nia!!");
        }
    }

    private void nuevoAlumno() {
        int contador=0;
        String nia;
        String nombre;
        String apellido;
        GregorianCalendar fechaNacimiento;
        int dia;
        int mes;
        int anyo;
        String grupo;
        String telefono;
        boolean validado = false;
        //Aqui la recomendacion es hacer una validacion que lo que le introduces tiene algun caracter...
        do {
            System.out.println("Escribe el nia:  ");
            nia = Lib.leerLinea();
            for (int i = 0; i <numeroAlumnos ; i++) {
                if (alumnos[i].getNia().equals(nia)){
                    System.out.println("Ya existe un alumno con ese nia!!");
                    validado = true;
                }else {
                    validado = false;

                }
            }

        }while (validado);

        do {
            System.out.println("Escribe el nombre del alumnos");
            nombre = Lib.leerLinea();
            validado = (nombre.length()>=MIN_NOMBRE);
            if (!validado) {
                System.out.println("El nombre es invalido escribe uno con " + MIN_NOMBRE + "carateres");
            }

        }while (!validado);

        do {
            System.out.println("Escribe el apellido del alumno:");
            apellido = Lib.leerLinea();
            validado = (apellido.length()>=MIN_APELLIDO);
            if (!validado) {
                System.out.println("El apellido es invalido escribe uno con " + MIN_APELLIDO + "carateres");
            }
        }while (!validado);
        
        do {
            System.out.println("Escribe el dia: ");
            dia = Lib.leerInt();
            System.out.println("Escribe el mes");
            mes = Lib.leerInt();
            System.out.println("Escribe el anyo:");
            anyo = Lib.leerInt();
            fechaNacimiento = new GregorianCalendar();
            fechaNacimiento.set(anyo,mes,dia);

            validado = dia != 0 || mes != 0 || anyo != 0;

        }while (!validado);

        do {
            System.out.println("Escribe el grupo del alumno:");
            grupo = Lib.leerLinea();
            if (grupo.length() == 0){
                System.out.println("No has introducido ningun grupo!!");
                validado = false;
            }else {
                validado = true;
            }
        }while (!validado);

        do {
            System.out.println("Escribe el telefono del alumno:");
            telefono = Lib.leerLinea();
            if (telefono.length() == 0){
                System.out.println("No has introducido ningun telefono!!");
                validado = false;
            }else {
                validado = true;
            }
        }while (!validado);

        Alumnos a = new Alumnos(nia,nombre,apellido,fechaNacimiento,grupo,telefono);

        if(numeroAlumnos==alumnos.length){
            Alumnos[] alumnosAux= new Alumnos[alumnos.length + 2];
            for (int i = 0; i < alumnos.length; i++) {
                alumnosAux[i]=alumnos[i];
            }
            alumnos = alumnosAux;
        }
        alumnos[numeroAlumnos] = a;
        numeroAlumnos++;

    }

    public int menuPrincipal(){
        int option;
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
    /*
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

     */

}
