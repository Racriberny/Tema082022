package com.cristobalbernal.Tema082022.Ejercicio3;

public class Alumnos {
    private String nia;
    private String nombre;
    private String apellidos;
    private String fecha_nacimiento;
    private String grupo;
    private String telefono;

    @Override
    public String toString() {
        return "Alumnos{" +
                "nia='" + nia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", grupo='" + grupo + '\'' +
                ", telefono=" + telefono +
                '}';
    }

    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Alumnos(String nia, String nombre, String apellidos, String fecha_nacimiento, String grupo, String telefono) {
        this.nia = nia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grupo = grupo;
        this.telefono = telefono;
    }
}
