package com.info.trabajopractico.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Equipo {
    private String nombre;
    private LocalDate fechaCreacion;
    private Entrenador entrenador;
    private List<Jugador> listaJugadores = new ArrayList<>();

    public Equipo(String nombre, LocalDate fechaCreacion) {

        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;


    }
    public Equipo(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", entrenador=" + entrenador +
                ", listaJugadores=" + listaJugadores +
                '}';
    }
}
