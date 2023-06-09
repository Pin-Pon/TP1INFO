package com.info.trabajopractico.servicio.equipo;

import com.info.trabajopractico.domain.Entrenador;
import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface ServicioEquipoInterface {


    Equipo crearEquipo();
    //agregarJugador(Jugador nuevo);
    void eliminarEquipo(Equipo equipo);

    static void listadoEquipos(List<Equipo> equipos) {

    }

    ArrayList<Jugador> buscarPorNombre(String nombre);

    ArrayList<Equipo>buscarPorEquipo(Equipo equipo);


}
