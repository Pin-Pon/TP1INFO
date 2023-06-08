package com.info.trabajopractico.domain;

import java.util.ArrayList;
import java.util.List;

public class Posicion {
    private String nombre;
    private String descripcion;
    private List<Jugador> listaJugadores = new ArrayList<>();

    public Posicion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public Posicion(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
    public void setListaJugadores(Jugador listaJugadores) {
        this.listaJugadores.add( listaJugadores);
    }

/**
    @Override
    public String toString() {
        return "Posicion{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", listaJugadores=" + listaJugadores +
                '}';
    }
 **/
    @Override
    public String toString() {
        String mostrar="";
        mostrar = "Posicion{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", listaDeProductos=[" ;
        for ( int i=0; i < listaJugadores.size();i++  ) {
            mostrar = mostrar + listaJugadores.get(i).getNombre() + ", ";
        }
        mostrar += "]";
        return mostrar;
    }
}
