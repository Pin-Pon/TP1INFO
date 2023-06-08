package com.info.trabajopractico.bootstrap;

import com.info.trabajopractico.bootstrap.constantes.DescripcionPosiciones;
import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.domain.Posicion;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BootstrapData {
    public static Map<String, Posicion> posicionMap = new HashMap<>();

    public static List<Equipo> equipoList;


    public static void initPosiciones(){

        posicionMap = new HashMap();

        cargarPosiciones(posicionMap);
    }

    public static void cargarJugadores(){

        Map<String,Posicion> posicionMap = new HashMap<>();

        cargarPosiciones(posicionMap);

        equipoList = List.of();
                new Equipo("River",LocalDate.of(3,4,2023));
                new Equipo("Fontana",LocalDate.of(4,3,2023));
                new Equipo("Tirol",LocalDate.of(5,5,2023));
                new Equipo("Rosa",LocalDate.of(6,5,2023));





    }

    private static void cargarPosiciones(Map<String,Posicion> categorias){
        posicionMap.put("Delantero", new Posicion("Delantero", DescripcionPosiciones.DELANTERO));
        posicionMap.put("Defensor", new Posicion("Defensor", DescripcionPosiciones.DEFENSOR));
        posicionMap.put("Arquero", new Posicion("Arquero", DescripcionPosiciones.ARQUERO));
        posicionMap.put("Medio Campista", new Posicion("Medio Campo", DescripcionPosiciones.MEDIOCAMPISTA));

    }



}


