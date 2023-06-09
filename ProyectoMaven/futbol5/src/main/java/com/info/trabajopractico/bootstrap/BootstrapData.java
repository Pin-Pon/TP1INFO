package com.info.trabajopractico.bootstrap;

import com.info.trabajopractico.bootstrap.constantes.DescripcionPosiciones;
import com.info.trabajopractico.domain.Entrenador;
import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.domain.Posicion;
import com.info.trabajopractico.servicio.menu.menuprincipal.MenuEquipos;
import com.info.trabajopractico.servicio.menu.menuprincipal.MenuJugador;
import com.info.trabajopractico.servicio.menu.menuprincipal.MenuPrincipal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.info.trabajopractico.bootstrap.constantes.DescripcionPosiciones.DELANTERO;

public class BootstrapData {
    public static final MenuPrincipal menuPrincipal = new MenuPrincipal();
    public static List<Equipo> equipos;
    public static final MenuEquipos menuEquipo = new MenuEquipos();
    public static final MenuJugador menuJugador = new MenuJugador();
    public static Map<String, Posicion> posicionMap = new HashMap<>();
    public static Map<Equipo,Jugador> jugadorList = new HashMap<>();
    //private List<Jugador> listaJugadores = new ArrayList<>();


    public static Map<String,Equipo> equipoMAP = new HashMap<>();


    public static void initData(){
        equipos = new ArrayList<Equipo>();

        //posicionMap = new HashMap();


        cargarEquipos(equipoMAP);
        //System.out.println(equipoMAP);
        cargarJugadores(jugadorList);
        //System.out.println(jugadorList);
        cargarPosiciones(posicionMap);
        //System.out.println(posicionMap);
    }

    public static void cargarJugadores(Map<Equipo,Jugador>jugadorList){

        Map<String,Posicion> posicionMap = new HashMap<>();


        cargarPosiciones(posicionMap);
/**
        equipoList = List.of();
                //
                new Equipo("Fontana",LocalDate.of(4,3,2023));
                new Equipo("Tirol",LocalDate.of(5,5,2023));
                new Equipo("Rosa",LocalDate.of(6,5,2023));
 **/

                jugadorList.put(equipoMAP.get("River"),new Jugador("TOMAS","Marta",1.2,6,10,true,10,equipoMAP.get("River"),posicionMap.get("Delantero")));
                jugadorList.put(equipoMAP.get("River"),new Jugador("Maria","Barbosa",2.2,6,10,false,9,equipoMAP.get("River"),posicionMap.get("Delantero")));
                jugadorList.put(equipoMAP.get("River"),new Jugador("Rosa","HIDALGO",1.8,3,10,true,10,equipoMAP.get("Boca"),posicionMap.get("Delantero")));
                jugadorList.put(equipoMAP.get("Boca"),new Jugador("Sola","Torees",1.2,6,10,false,1,equipoMAP.get("Boca"),posicionMap.get("Arquero")));
                jugadorList.put(equipoMAP.get("Boca"),new Jugador("Solita","TORETO",1.3,60,10,false,11,equipoMAP.get("Boca"),posicionMap.get("Delantero")));
                jugadorList.put(equipoMAP.get("Boca"),new Jugador("Solo","TERRAZA",1.28,0,10,false,16,equipoMAP.get("Boca"),posicionMap.get("Defensor")));
                jugadorList.put(equipoMAP.get("Estudiante"),new Jugador("Soledad","Torees",1.89,4,10,false,15,equipoMAP.get("Boca"),posicionMap.get("Defensor")));
                jugadorList.put(equipoMAP.get("Estudiante"),new Jugador("Sol","TOLEDO",1.80,6,10,false,12,equipoMAP.get("Boca"),posicionMap.get("Arquero")));
                jugadorList.put(equipoMAP.get("Estudiante"),new Jugador("Luna","Manzana",1.98,9,10,false,10,equipoMAP.get("Boca"),posicionMap.get("Delantero")));
                jugadorList.put(equipoMAP.get("Fontana"),new Jugador("CESAR","DUARTE",2.2,5,10,false,4,equipoMAP.get("Estudiante"),posicionMap.get("Defensor")));
                jugadorList.put(equipoMAP.get("Fontana"),new Jugador("CARLOS","SOLO",2.4,5,10,false,2,equipoMAP.get("Estudiante"),posicionMap.get("Defensor")));
                jugadorList.put(equipoMAP.get("Fontana"),new Jugador("CHITO","FLORES",2.24,0,10,false,3,equipoMAP.get("Estudiante"),posicionMap.get("Defensor")));
                jugadorList.put(equipoMAP.get("Tirol"),new Jugador("CESAR MARIA","DUA",1.29,6,10,false,11,equipoMAP.get("Estudiante"),posicionMap.get("Delantero")));
                jugadorList.put(equipoMAP.get("Tirol"),new Jugador("CESAR OSCAR","DUARTE",1.90,56,10,true,10,equipoMAP.get("Estudiante"),posicionMap.get("Delantero")));
                jugadorList.put(equipoMAP.get("Tirol"),new Jugador("ADRIAN","AGUIRRE",2.6,5,10,false,1,equipoMAP.get("Estudiante"),posicionMap.get("Arquero")));
                jugadorList.put(equipoMAP.get("Sarmiento"),new Jugador("ROBERTO","CHUKY",2.2,4,10,false,1,equipoMAP.get("Sarmiento"),posicionMap.get("Arquero")));
                jugadorList.put(equipoMAP.get("Sarmiento"),new Jugador("MIA","HIGADO",1.89,6,10,false,19,equipoMAP.get("Sarmiento"),posicionMap.get("Medio Campo")));
                jugadorList.put(equipoMAP.get("Sarmiento"),new Jugador("TUYA","MONZA",2.22,7,10,false,11,equipoMAP.get("Boca"),posicionMap.get("Delantero")));
                jugadorList.put(equipoMAP.get("Estudiante"),new Jugador("DEEL","ZORRA",2.23,8,10,false,9,equipoMAP.get("River"),posicionMap.get("Defensor")));


    }
    private static void cargarEquipos(Map<String,Equipo>equipoMAP){
        equipoMAP.put("River", new Equipo("River", LocalDate.of(2023,6,20),new Entrenador("Roberto","Duarte",38)));
        equipoMAP.put("Boca", new Equipo("Boca",LocalDate.of(1989,4,02),new Entrenador("Marcelo","Gallardo",44)));
        equipoMAP.put("Estudiante", new Equipo("Estudiante",LocalDate.of(1993,8,18),new Entrenador("Raul", "Ramirez",56)));
        equipoMAP.put("Fontana", new Equipo("Fontana",LocalDate.of(1993,4,20),new Entrenador("Ricardo", "Gareca",65)));
        equipoMAP.put("Tirol", new Equipo("Tirol",LocalDate.of(2023,3,19),new Entrenador("Lizandro","Gonzalez",67)));
        equipoMAP.put("Sarmiento", new Equipo("Sarmiento",LocalDate.of(1986,10,1),new Entrenador("Marta","Pichinato",34)));
    }

    private static void cargarPosiciones(Map<String,Posicion> posicionMap){
        posicionMap.put("Delantero", new Posicion("Delantero", DELANTERO));
        posicionMap.put("Defensor", new Posicion("Defensor", DescripcionPosiciones.DEFENSOR));
        posicionMap.put("Arquero", new Posicion("Arquero", DescripcionPosiciones.ARQUERO));
        posicionMap.put("Medio Campista", new Posicion("Medio Campo", DescripcionPosiciones.MEDIOCAMPISTA));

    }



}


