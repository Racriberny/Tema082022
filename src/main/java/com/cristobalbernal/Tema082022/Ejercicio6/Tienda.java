package com.cristobalbernal.Tema082022.Ejercicio6;

import com.cristobalbernal.Tema082022.Lib.Lib;
import com.github.javafaker.Faker;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Tienda {
    int referencia;


    public void crearDatos(Bicicleta[] bicicleta){
        Faker faker = new Faker(Locale.forLanguageTag("es"));
        String referencia;
        String marca;
        int peso;
        int pulgadasRueda;
        boolean motor;
        Date fechaFabricacion;
        double precio;
        int numeroExistencias;

        for (int i = 0; i <bicicleta.length ; i++) {
            referencia = faker.idNumber().valid();
            marca = faker.company().name();
            peso = Lib.numeroAleatorio(ConfigBicicletas.MIN_PESO,ConfigBicicletas.MAX_PESO);
            pulgadasRueda = Lib.numeroAleatorio(ConfigBicicletas.MIN_RUEDA,ConfigBicicletas.MAX_RUEDA);
            motor = Lib.booleanAlea();
            fechaFabricacion = faker.date().birthday(0,50);
            precio = Lib.numeroAleatorio(ConfigBicicletas.MIN_PRECIO,ConfigBicicletas.MAX_PRECIO);
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(fechaFabricacion);
            numeroExistencias = Lib.numeroAleatorio(ConfigBicicletas.MIN_EXISTENCIAS,ConfigBicicletas.MAX_EXISTENCIAS);
            bicicleta[i] = new Bicicleta(referencia,marca,peso,pulgadasRueda,motor,fechaFabricacion,precio,numeroExistencias);
        }
        for (Bicicleta bicicle:bicicleta) {
            System.out.println(bicicle);
        }
    }

    public void mostrarStock(Bicicleta[] bicicletas){
        for (Bicicleta bicicleta : bicicletas) {
            System.out.println("Numero referecia " + bicicleta.getReferencia() + "stock " + bicicleta.getReferencia());
        }
    }
}
