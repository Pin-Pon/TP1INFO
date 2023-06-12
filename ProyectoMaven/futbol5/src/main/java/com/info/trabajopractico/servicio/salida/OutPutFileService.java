package com.info.trabajopractico.servicio.salida;

import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface OutPutFileService {
    static  void exportJugadores(List<Jugador> jugadoresOutPut, String rutaDeDestino) throws IOException {

    };

    static void exportarListaJugadores(Map<Equipo,List<Jugador>>listaJugadores, String rutaArchivo){

    };

}
