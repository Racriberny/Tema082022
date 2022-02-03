package com.cristobalbernal.Tema082022.Ejercicio3;

import com.cristobalbernal.Tema082022.Ejercicio2.Asiganatura;
import com.cristobalbernal.Tema082022.Lib.Lib;

public class Principal {
    private static final int ALUMNOS =  1000;
    private static final int MAXIMO_TELEFONO = 8;
    Alumnos [] alumnos;

    public Principal(){
        alumnos = new Alumnos[ALUMNOS];
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
        System.out.println("has salido");
    }

    private void consultas() {
        int opcion;
        do {
            opcion = menuConsultas();
            switch (opcion){
                case 1: busquedaGrupo();
                    break;
                case 2: busquedaEdad();
                    break;
                case 3: busquedaNia();
                    break;
                case 4: busquedaApellidos();
                break;
            }
        }while (opcion !=0);





    }

    private void busquedaApellidos() {
        String apellidos;
        System.out.println("Escribe el nia: ");
        apellidos = Lib.leerLinea();
        for (int i = 0; i < ALUMNOS ; i++) {
            if (alumnos[i].getApellidos().equals(apellidos)){
                System.out.println(apellidos);
            }else {
                System.out.println("No se ha encontrado ese apellido!!!!");
            }
        }
    }

    private void busquedaNia() {
        int nia;
        System.out.println("Escribe el nia: ");
        nia = Lib.leerInt();
        for (int i = 0; i < ALUMNOS ; i++) {
            if (alumnos[i].getNia() == nia){
                System.out.println(alumnos[i]);
            }
        }
    }

    private void busquedaEdad() {
        int edad;
        System.out.println("Escribe la edad: ");
        edad = Lib.leerInt();
    }

    private void busquedaGrupo() {

    }

    private void bajaAlumno() {

    }

    private void nuevoAlumno() {

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

}
