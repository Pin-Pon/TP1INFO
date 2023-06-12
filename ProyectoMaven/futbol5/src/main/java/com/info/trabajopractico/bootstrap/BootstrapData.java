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
    public static final MenuEquipos menuEquipo = new MenuEquipos();
    public static final MenuJugador menuJugador = new MenuJugador();
    public static List<Equipo> equipos = new ArrayList<>();
    public static List<Jugador> listSoloJugadores = new ArrayList<>();

    public static Map<String, Posicion> posicionMap = new HashMap<>();
    public static Map<Equipo,List<Jugador>> jugadorMap = new HashMap<>();
    //private List<Jugador> listaJugadores = new ArrayList<>();


    public static Map<String,Equipo> equipoMAP = new HashMap<>();


    public static void initData(){


        //posicionMap = new HashMap();


        cargarEquipos(equipoMAP);
        cargarListaSoloJugaores(listSoloJugadores);
        cargarListaEquipos(equipos);
        //System.out.println(equipoMAP);
        cargarJugadores(jugadorMap);
        //System.out.println(jugadorList);
        cargarPosiciones(posicionMap);
        //System.out.println(posicionMap);
    }
    public static void cargarJugadores(Map<Equipo,List<Jugador>> jugadorMap) {
        Map<String,Posicion> posicionMap = new HashMap<>();
        cargarPosiciones(posicionMap);
        cargarEquipos(equipoMAP);



        jugadorMap.put(equipoMAP.get("River"), listSoloJugadores);
        jugadorMap.put(equipoMAP.get("Fontana"), listSoloJugadores);
        jugadorMap.put(equipoMAP.get("Boca"), listSoloJugadores);
        jugadorMap.put(equipoMAP.get("Estudiante"), listSoloJugadores);
        jugadorMap.put(equipoMAP.get("Sarmiento"), listSoloJugadores);
        jugadorMap.put(equipoMAP.get("Estudiante"), listSoloJugadores);


    }
    private static void cargarListaSoloJugaores(List<Jugador>listSoloJugadores){
        listSoloJugadores.add(new Jugador("Tomas","Alegre",1.9,45,12,true,10,equipoMAP.get("River"),posicionMap.get("Delantero")));
        listSoloJugadores.add(new Jugador("Rosa","Alegres",1.9,4,12,false,11,equipoMAP.get("River"),posicionMap.get("Delantero")));
        listSoloJugadores.add(new Jugador("Tomasa","Triste",1.7,12,12,false,12,equipoMAP.get("River"),posicionMap.get("Defensor")));
        listSoloJugadores.add(new Jugador("Daniel","Barbosa",1.9,4,12,false,1,equipoMAP.get("River"),posicionMap.get("Defensor")));
        listSoloJugadores.add(new Jugador("Tamara","Tv",1.97,4,12,false,8,equipoMAP.get("Fontana"),posicionMap.get("Arquero")));
        listSoloJugadores.add(new Jugador("Maria","Cls",1.93,5,12,true,7,equipoMAP.get("Estudiante"),posicionMap.get("Delantero")));
        listSoloJugadores.add(new Jugador("Roberto","Danlila",1.09,10,12,false,6,equipoMAP.get("Sarmiento"),posicionMap.get("Medio Campo")));
        listSoloJugadores.add(new Jugador("Daniela","Alegría",1.5,4,12,false,5,equipoMAP.get("River"),posicionMap.get("Delantero")));
        listSoloJugadores.add(new Jugador("Andrea","Feliz",1.5,45,12,false,4,equipoMAP.get("Sarmiento"),posicionMap.get("Medio Campo")));
        listSoloJugadores.add(new Jugador("Maria","Sanchez",1.9,45,12,false,12,equipoMAP.get("River"),posicionMap.get("Defensor")));
        listSoloJugadores.add(new Jugador("Rosa","HIDALGO",1.8,3,10,true,10,equipoMAP.get("Boca"),posicionMap.get("Delantero")));
        listSoloJugadores.add(new Jugador("Sola","Torees",1.2,6,10,false,1,equipoMAP.get("Boca"),posicionMap.get("Arquero")));
        listSoloJugadores.add(new Jugador("Solita","TORETO",1.3,60,10,false,11,equipoMAP.get("Boca"),posicionMap.get("Delantero")));
        listSoloJugadores.add(new Jugador("Solo","TERRAZA",1.28,0,10,false,16,equipoMAP.get("Boca"),posicionMap.get("Defensor")));
        listSoloJugadores.add(new Jugador("Soledad","Torees",1.89,4,10,false,15,equipoMAP.get("Boca"),posicionMap.get("Defensor")));
        listSoloJugadores.add(new Jugador("Sol","TOLEDO",1.80,6,10,false,12,equipoMAP.get("Boca"),posicionMap.get("Arquero")));
        listSoloJugadores.add(new Jugador("Luna","Manzana",1.98,9,10,false,10,equipoMAP.get("Boca"),posicionMap.get("Delantero")));

    }





    private static void cargarEquipos(Map<String,Equipo>equipoMAP){
        equipoMAP.put("River",new Equipo("River", LocalDate.of(2023,6,20),new Entrenador("Roberto","Duarte",38)));
        equipoMAP.put("Boca", new Equipo("Boca",LocalDate.of(1989,4,02),new Entrenador("Marcelo","Gallardo",44)));
        equipoMAP.put("Estudiante", new Equipo("Estudiante",LocalDate.of(1993,8,18),new Entrenador("Raul", "Ramirez",56)));
        equipoMAP.put("Fontana", new Equipo("Fontana",LocalDate.of(1993,4,20),new Entrenador("Ricardo", "Gareca",65)));
        equipoMAP.put("Tirol", new Equipo("Tirol",LocalDate.of(2023,3,19),new Entrenador("Lizandro","Gonzalez",67)));
        equipoMAP.put("Sarmiento", new Equipo("Sarmiento",LocalDate.of(1986,10,1),new Entrenador("Marta","Pichinato",34)));
    }
    private static void cargarListaEquipos(List<Equipo>equipoList){
        equipoList.add(equipoMAP.get("River"));
        equipoList.add(equipoMAP.get("Boca"));
        equipoList.add(equipoMAP.get("Estudiante"));
        equipoList.add(equipoMAP.get("Fontana"));
        equipoList.add(equipoMAP.get("Tirol"));
        equipoList.add(equipoMAP.get("Sarmiento"));
    }

    private static void cargarPosiciones(Map<String,Posicion> posicionMap){
        posicionMap.put("Delantero", new Posicion("Delantero", DELANTERO));
        posicionMap.put("Defensor", new Posicion("Defensor", DescripcionPosiciones.DEFENSOR));
        posicionMap.put("Arquero", new Posicion("Arquero", DescripcionPosiciones.ARQUERO));
        posicionMap.put("Medio Campista", new Posicion("Medio Campo", DescripcionPosiciones.MEDIOCAMPISTA));

    }

}


