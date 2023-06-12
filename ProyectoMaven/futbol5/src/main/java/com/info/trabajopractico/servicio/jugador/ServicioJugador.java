package com.info.trabajopractico.servicio.jugador;

import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;

public interface ServicioJugador {

    Jugador crearJugador(Equipo equipo);
    Jugador buscarJugadorPorNombre(Equipo equipo);

    //Jugador asignarEquipo(Equipo equipo);




}
