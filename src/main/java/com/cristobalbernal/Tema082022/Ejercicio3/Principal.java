package com.cristobalbernal.Tema082022.Ejercicio3;

import com.cristobalbernal.Tema082022.Lib.Lib;

public class Principal {
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

    }

    private void busquedaNia() {

    }

    private void busquedaEdad() {

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
