package com.cristobalbernal.Tema082022.Ejercicio6;

import com.cristobalbernal.Tema082022.Lib.Lib;
import com.github.javafaker.Faker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Tienda {
    private int numeroBicicletas = 0;


    public void crearDatos(Bicicleta[] bicicleta){
        Faker faker = new Faker(Locale.forLanguageTag("es"));
        String referencia;
        String marca;
        String modelo;
        double peso;
        int pulgadasRueda;
        boolean motor;
        GregorianCalendar fechaFabricacion;
        double precio;
        int numeroExistencias;

        for (int i = 0; i <bicicleta.length ; i++) {
            referencia = faker.idNumber().valid();
            marca = faker.company().name();
            peso = Lib.numeroAleatorio(ConfigBicicletas.MIN_PESO,ConfigBicicletas.MAX_PESO);
            modelo = faker.company().industry();
            pulgadasRueda = Lib.numeroAleatorio(ConfigBicicletas.MIN_RUEDA,ConfigBicicletas.MAX_RUEDA);
            motor = Lib.booleanAlea();
            fechaFabricacion = new GregorianCalendar();
            fechaFabricacion.setTime(faker.date().birthday(18,80));
            precio = Lib.numeroAleatorio(ConfigBicicletas.MIN_PRECIO,ConfigBicicletas.MAX_PRECIO);
            numeroExistencias = Lib.numeroAleatorio(ConfigBicicletas.MIN_EXISTENCIAS,ConfigBicicletas.MAX_EXISTENCIAS);
            bicicleta[i] = new Bicicleta(referencia,marca,modelo,peso,pulgadasRueda,motor,fechaFabricacion,precio,numeroExistencias);
            numeroBicicletas++;
        }
        for (Bicicleta bicicle:bicicleta) {
            System.out.println(bicicle);
        }
    }

    /*
    public void mostrarStock(Bicicleta[] bicicletas){
        for (Bicicleta bicicleta : bicicletas) {
            System.out.println("Numero referecia " + bicicleta.getReferencia() + " tiene un stock de " + bicicleta.getNumeroExistencias());
        }
    }

     */

    public void anadirBicicleta(Bicicleta[]bicicletas){
        String referecia;
        int cantidad = 0;

        System.out.println("Escribe la referecia de la bicicleta: ");
        referecia = Lib.leerLinea();
        for (int i = 0; i <numeroBicicletas ; i++) {
            if (bicicletas[i].getReferencia().equals(referecia)){
                int numeroBicis = bicicletas[i].getNumeroExistencias();
                System.out.println("Escribe la cantidad que quieres añadir: ");
                cantidad = Lib.leerInt();
                bicicletas[i].setNumeroExistencias(numeroBicis + cantidad);
            }
        }
        if (cantidad == 0){
            anadirNuevaBicicleta(bicicletas);
        }
    }
    public void anadirNuevaBicicleta(Bicicleta[]bicicletas){
        String nuevoNumeroDeReferencia;
        String marca;
        double peso;
        String modelo;
        int pulgadas;
        String motorString;
        boolean motor = false;
        GregorianCalendar fechaFabricacion = null;
        double precio;
        int numeroExistencias;
        boolean validado;

        do {
            System.out.println("Escribe el numero de referencia");
            nuevoNumeroDeReferencia = Lib.leerLinea();
            validado = nuevoNumeroDeReferencia.length() > 0;
        }while (!validado);

        do {
            System.out.println("Escribe la marca de la bicicleta");
            marca = Lib.leerLinea();
            validado = marca.length() != 0;
        }while (!validado);

        do {
            System.out.println("Escribe el modelo de la bicicleta");
            modelo = Lib.leerLinea();
            validado = modelo.length() != 0;
        }while (!validado);

        do {
            System.out.println("Escribe el peso de la biciclta");
            peso = Lib.leerDouble();
            validado = !(peso < 0) && !(peso > 10);
        }while (!validado);

        do {
            System.out.println("Escribe las pulgadas de la bicicleta: ");
            pulgadas = Lib.leerInt();
            validado = pulgadas >= 26 && pulgadas <= 29;
        }while (!validado);

        System.out.println("Escribe si tiene motor: Si/No");
        motorString = Lib.leerLinea();

        if ("si".equalsIgnoreCase(motorString)) {
            motor = true;
        } else if ("no".equalsIgnoreCase(motorString)) {
            motor = false;
        } else {
            System.out.println("No has introducido una opcion valida");
        }

        do {
            System.out.println("Escribe la fecha dd/mm/yyyy");
            String fecha = Lib.leerLinea();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try{
                Date date = sdf.parse(fecha);
                fechaFabricacion = new GregorianCalendar();
                fechaFabricacion.setTime(date);
                validado = true;
            }catch (ParseException pe){
                validado = false;
                System.out.println("La fecha es incorrecta");
            }
        }while (!validado);

        do {
            System.out.println("Escribe el precio de la biciclta");
            precio = Lib.leerDouble();
            validado = !(precio < 0) && !(precio > 10000);
        }while (!validado);

        do {
            System.out.println("Escribe el numero de existencias de la biciclta");
            numeroExistencias = Lib.leerInt();
            validado = !(numeroExistencias < 0) && !(numeroExistencias > 10000);
        }while (!validado);

        Bicicleta a = new Bicicleta(nuevoNumeroDeReferencia,marca,modelo,peso,pulgadas,motor,fechaFabricacion,precio,numeroExistencias);

        if(numeroBicicletas==bicicletas.length){
            Bicicleta[] bici= new Bicicleta[bicicletas.length + 2];
            for (int i = 0; i < bicicletas.length; i++) {
                bici[i]=bicicletas[i];
            }
            bicicletas = bici;
        }
        bicicletas[numeroBicicletas] = a;
        numeroBicicletas++;
    }


    //Esta mal
    public void venderBicicleta(Bicicleta[] bicicletas, String referecia){
        int posicion;
        posicion = busquedaBici(referecia,bicicletas);
        int cantidad;
        System.out.println("Escribe la cantidad que bici quieres quitar del numero de referencia " + referecia);
        cantidad = Lib.leerInt();
        if (posicion >=0){
            bicicletas[posicion] = null;
            int bici = bicicletas[posicion].getNumeroExistencias();
            System.out.println("La bicicleta se ha quitado de stock!!!");
            numeroBicicletas--;
            bicicletas[numeroBicicletas].setNumeroExistencias(bici - cantidad);
        }else {
            System.out.println("No existe ninguna bicicleta con esta referencia!!");
        }
    }


    private int busquedaBici(String referencia, Bicicleta[] bicicletas) {
        for (int i = 0; i < bicicletas.length ; i++) {
            if (bicicletas[i].getReferencia().equals(referencia)){
                return i;
            }
        }
        return -1;
    }

    public void consultaReferencia(Bicicleta[] bicicletas, String referencia){
        int contador = 0;
        for (Bicicleta value : bicicletas) {
            if (value.getReferencia().equals(referencia)) {
                contador++;
            }
        }
        if (contador == 1){
            for (Bicicleta bicicleta : bicicletas) {
                System.out.println(bicicleta);
            }
        }else {
            System.out.println("No existe ninguna bicicleta con este numero de referencia");
        }
    }
    public void consultarPorMarca(Bicicleta[] bicicletas, String marca){
        int contador = 0;
        for (Bicicleta value : bicicletas) {
            if (value.getMarca().equals(marca)) {
                contador++;
            }
        }
        if (contador == 1){
            for (Bicicleta bicicleta : bicicletas) {
                System.out.println(bicicleta);
            }
        }else {
            System.out.println("No existe ninguna bici de esta marca");
        }
    }
    public void consultarModelo(Bicicleta[] bicicletas, String modelo){
        int contador = 0;
        for (Bicicleta value : bicicletas) {
            if (value.getModelo().equals(modelo)) {
                contador++;
            }
        }
        if (contador == 1){
            for (Bicicleta bicicleta : bicicletas) {
                System.out.println(bicicleta);
            }
        }
    }
}
