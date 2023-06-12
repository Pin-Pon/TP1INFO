package com.info.trabajopractico.domain;

import java.time.LocalDate;
import java.util.*;

public class Equipo {
    private String nombre;
    private LocalDate fechaCreacion;
    private Entrenador entrenador;
    protected Map<String,Jugador> equipoJugadorMap = new HashMap<>();

    public Equipo(String nombre, LocalDate fechaCreacion, Entrenador entrenador, Map<String, Jugador> equipoJugadorMap) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.entrenador = entrenador;
        this.equipoJugadorMap = equipoJugadorMap;
    }
    public void agregarJugador(Jugador jugador){

        equipoJugadorMap.put(jugador.getEquipo().getNombre(),jugador );
    }

    public Equipo(String nombre, LocalDate fechaCreacion, Entrenador entrenador) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.entrenador = entrenador;

    }


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

    public Map<String, Jugador> getEquipoJugadorMap(String nombre) {
        return equipoJugadorMap;
    }

    public void setEquipoJugadorMap(Map<String, Jugador> equipoJugadorMap) {
        this.equipoJugadorMap = equipoJugadorMap;
    }

    @Override
    public String toString() {
        return "Equipo: " +
                "Nombre: " + nombre + '\'' +'\n' +
                "Fecha De Creacion: " + fechaCreacion + '\n' +
                "Entrenador: " + entrenador +'\n' +
                "Equipo Jugador Map: " + equipoJugadorMap ;
    }
}
