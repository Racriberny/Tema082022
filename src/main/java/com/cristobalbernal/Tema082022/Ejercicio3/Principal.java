package com.cristobalbernal.Tema082022.Ejercicio3;

import com.cristobalbernal.Tema082022.Lib.Lib;
import com.github.javafaker.Faker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Principal {
    private static final int ALUMNOS =  10000;
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
        int edad;
        do {
            opcion = menuConsultas();
            switch (opcion){
                case 1:
                    System.out.println("Escribe un grupo");
                    grupo = Lib.leerLinea();
                    busquedaGrupo(grupo);
                    break;
                case 2:
                    System.out.println("Escribe la edad");
                    edad = Lib.leerInt();
                    busquedaEdad(edad);
                    break;
                case 3:
                    System.out.println("Escribe el nia: ");
                    nia = Lib.leerLinea();
                    consultarNia(nia);
                    break;
                case 4:
                    String apellidos;
                    System.out.println("Escribe el apellido: ");
                    apellidos = Lib.leerLinea();
                    busquedaApellidos(apellidos);
                    break;
            }
        }while (opcion !=0);
    }
    private void busquedaApellidos(String apellido) {
        int contador = 0;
        for (Alumnos alumno : alumnos) {
            if (alumno.getApellidos().equals(apellido)) {
                contador++;
            }
        }
        if (contador == 1){
            for (Alumnos alumno : alumnos) {
                if (alumno.getApellidos().equals(apellido)) {
                    System.out.println(alumno);
                }
            }
        }else {
            System.out.println("No existe ninguno");
        }
    }
    private void consultarNia(String nia) {
        for (Alumnos alumno : alumnos) {
            if (alumno.getNia().equals(nia)) {
                System.out.println(alumno);
            }else {
                System.out.println("No se ha encontrado el " + nia + "introducido");
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

    private void busquedaEdad(int fecha) {
        int contador = 0;
        for (Alumnos alumno : alumnos) {
            if (alumno.getEdad() == fecha) {
                contador++;
            }
        }
        if (contador == 1){
            for (Alumnos alumno : alumnos) {
                if (alumno.getEdad() == fecha) {
                    System.out.println(alumno);
                }
            }
        }else {
            System.out.println("No existe ninguno");
        }
    }

    private void busquedaGrupo(String grupo) {
        int contador = 0;
        for (Alumnos alumno : alumnos) {
            if (alumno.getGrupo().equals(grupo)) {
                contador++;
            }
        }
        if (contador == 1){
            for (Alumnos alumno : alumnos) {
                if (alumno.getGrupo().equals(grupo)) {
                    System.out.println(alumno);
                }
            }
        }else {
            System.out.println("No existe ninguno");
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
        String fecha;
        GregorianCalendar fechaFecha = null;
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
            System.out.println("Escribe la fecha dd/mm/yyyy");
            fecha = Lib.leerLinea();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try{
                Date date = sdf.parse(fecha);
                fechaFecha = new GregorianCalendar();
                fechaFecha.setTime(date);
                validado = true;
            }catch (ParseException pe){
                validado = false;
                System.out.println("La fecha es incorrecta");

            }
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

        Alumnos a = new Alumnos(nia,nombre,apellido,fechaFecha,grupo,telefono);

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

     */
    private void datosDePruebaFaker(){
        Faker faker = new Faker(Locale.forLanguageTag("es"));
        String nia;
        String nombre;
        String apellidos;
        GregorianCalendar fecha_nacimiento;
        String grupo;
        String telefono;

        for (int i = 0; i <alumnos.length ; i++) {
            nia = faker.idNumber().valid();
            nombre = faker.name().firstName();
            apellidos = faker.name().lastName();
            fecha_nacimiento = new GregorianCalendar();
            fecha_nacimiento.setTime(faker.date().birthday(18,80));
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