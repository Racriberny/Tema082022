package com.cristobalbernal.Tema082022.Ejercicio7;

import com.cristobalbernal.Tema082022.Lib.Lib;

import java.util.concurrent.atomic.AtomicInteger;

public class Principal {
    private static final int MAX_PACIENTES = 500;
    private static final int MAX_REGISTROS_HISTORICO = 2000;
    private Centro centro;
    public void execute(){
        int opcion;
        centro = new Centro(MAX_PACIENTES,MAX_REGISTROS_HISTORICO);
        centro.generarPaciente(MAX_PACIENTES);
        centro.generarHistoria(MAX_REGISTROS_HISTORICO);

        do {
            opcion = menuCentro();
            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    consultas();
                    break;
                case 4:
                    break;

            }

        }while (opcion !=0);
    }
    private void consultas() {
        int opcion;
       do {
            opcion = menuConsultas();
            switch (opcion){
                case 1:
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
