package com.cristobalbernal.Tema082022.Cola;

/**
 * Class Cola
 * Implementación estática de una cola mediante un Array
 */
public class Cola {
    /* Capacidad por defecto de la cola */
    private static final int INITIAL_SIZE = 10;
    /* Array donde se almacenan los elementos de la cola */
    private double[] datos;
    /* Índice que controla cual es el primer elemento de la cola */
    private int primero;
    /* Índice que controla cuál es el último elemento de la cola */
    private int ultimo;

    public Cola() {
        this(INITIAL_SIZE);
    }

    public Cola(int size) {
        datos = new double[size];
        primero = -1;
        ultimo = -1;
    }

    /**
     * Determina si la cola está llena
     * @return True si la cola está llena, False en caso contrario
     */
    public boolean isFull() {
        return ultimo == datos.length-1;
    }

    /**
     * Determina si la cola está vacía
     * @return True si la cola está vacía, False en caso contrario
     */
    public boolean isEmpty() {
        return primero == -1 && ultimo == -1;
    }

    /**
     * Añade un elemento al final de la Cola
     * @param e Elemento a añadir
     */
    public void add(double e) {
        if(isEmpty()) {
            primero = 0;
        } else if(isFull()) {
            //Ampliamos el tamaño
            expand(2);
        }
        datos[++ultimo] = e;
    }

    /**
     * Amplía el tamaño de la cola en un factor de multiplicación
     * y copia todos los elementos al principio del nuevo array
     * actualizando los índices primero y último
     * @param factor Factor de multiplicación
     */
    private void expand(int factor) {
        double[] aux = new double[datos.length * factor];
        int j = 0;
        for(int i = primero; i <= ultimo; i++) {
            aux[j] = datos[i];
            j++;
        }
        primero = 0;
        ultimo = j - 1;
        datos = aux;
    }

    /**
     * Extrae el siguiente elemento de la Cola (el primero)
     * @return Elemento que ocupa la primera posición
     */
    public double remove() {
        double e = Double.MIN_VALUE;
        if(!isEmpty()) {
            e = datos[primero];
            // Comprobar si es el último elemento
            if(primero == ultimo) {
                primero = -1;
                ultimo = -1;
            } else {
                primero++;
            }
        }
        return e;
    }

    /**
     * Representación del contenido de la Cola mediante un String
     * @return String con la representación de la Cola
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for(int i = 0; i <= ultimo; i++) {
            sb.append(datos[i]).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Obtiene el tamaño de la cola
     * @return
     */
    public int size() {
        if(isEmpty())
            return 0;
        return ultimo - primero + 1;
    }

    /**
     * Consulta (sin eliminarlo) el primer elemento de la cola
     * @return Primer elemento de la cola
     */
    public double peek() {
        return datos[primero];
    }

    /**
     * Muestra por pantalla los elementos de la Cola
     */
    public void print() {
        System.out.println(toString());
    }

    /**
     * Método útil para ver como van evolucionando los índices
     */
    public void showDebug() {
        System.out.println("primero = " + primero);
        System.out.println("ultimo = " + ultimo);
        print();
    }
}

