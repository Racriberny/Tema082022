package com.cristobalbernal.Tema082022.Pila;

public class Pila<T> {
    private static final int INITIAL_SIZE = 10;
    private static final int GROW_FACTOR = 2;
    private T[] datos;
    private int nElementos;

    public Pila() {
        this(INITIAL_SIZE);
    }

    public Pila(int size) {
        datos = (T[]) new Object[size];
        nElementos = 0;
    }

    public void push(T e) {
        if(nElementos == datos.length) {
            T[] aux = (T[]) new Object[datos.length*2];
            for(int i = 0; i < datos.length; i++) {
                aux[i] = datos[i];
            }
            datos = aux;
        }
        datos[nElementos] = e;
        nElementos++;
    }

    public T pop() {
        T e = (T) new Object();
        if(!isEmpty()) {
            e = datos[nElementos - 1];
            nElementos--;
        }
        return e;
    }
    public T [] reSize(T[]array){
        T[] newArray = (T[]) new Object[array.length + GROW_FACTOR];
        for (int i = 0; i <array.length ; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
    public T top() {
        T e = (T) new Object();
        if(!isEmpty()) {
            e = datos[nElementos - 1];
        }
        return e;
    }

    public boolean isEmpty() {
        return nElementos == 0;
    }

    public int size() {
        return nElementos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for(int i = 0; i < nElementos; i++) {
            sb.append(datos[i]).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    public void print() {
        System.out.println(toString());
    }
}
