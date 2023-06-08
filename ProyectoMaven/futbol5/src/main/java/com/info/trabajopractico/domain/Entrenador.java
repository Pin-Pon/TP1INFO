package com.info.trabajopractico.domain;

public class Entrenador {
    private String nombre;
    private String apellido;
    private int edad;

    public Entrenador(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Entrenador(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Entrenador: " +
                "Nombre: '" + nombre + '\n' +
                "Apellido: '" + apellido + '\n' +
                "Edad:" + edad ;
    }
}
