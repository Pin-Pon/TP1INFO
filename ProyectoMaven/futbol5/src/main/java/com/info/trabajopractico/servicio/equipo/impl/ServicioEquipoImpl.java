package com.info.trabajopractico.servicio.equipo.impl;
import java.time.LocalDate;

import com.info.trabajopractico.bootstrap.BootstrapData;
import com.info.trabajopractico.domain.Entrenador;
import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.servicio.entrada.impl.InputService;
import com.info.trabajopractico.servicio.entrenador.impl.ServicioEntrenadorImpl;
import com.info.trabajopractico.servicio.equipo.ServicioEquipoInterface;
import com.info.trabajopractico.servicio.jugador.ServicioJugador;
import com.info.trabajopractico.servicio.jugador.impl.ServicioJugadorImpl;
import com.info.trabajopractico.servicio.menu.menuprincipal.MenuJugador;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServicioEquipoImpl implements ServicioEquipoInterface {
    private static final MenuJugador menuJugador = new MenuJugador();
    private static final ServicioEntrenadorImpl servicioEntrenador = new ServicioEntrenadorImpl();
    public static final ServicioJugador servicioJugador = new ServicioJugadorImpl();

    @Override
    public  Equipo crearEquipo(){
        BootstrapData.menuEquipo.menuCrearEquipos();
        Equipo equipo = new Equipo();
        Entrenador entrenador = new Entrenador();
        System.out.println("INGRESE EL NOMBRE DEL EQUIPO: ");
        equipo.setNombre(InputService.scanner.next());
        equipo.setFechaCreacion(LocalDate.now());
        if (equipo!=null) {
            //validar equipo

            System.out.println("=    Equipo agregado correctamente...");
            boolean Seguir =true;
            do {

                System.out.print("=    Desea Agregar un entrenador al equipo? S/N: ");


                String agregarEntrenador = InputService.scanner.nextLine();
                switch (agregarEntrenador) {
                    case "S":
                    case "s":
                        Entrenador entrenador1 = servicioEntrenador.crearEntrenador(equipo);
                        break;

                    default:
                        Seguir=false;
                }
            }while (Seguir);
            boolean agregarJugador = true;

            do {
                System.out.print("=    Desea Agregar un jugador al equipo? S/N: ");
                String agregarJugadorRespuesta = InputService.scanner.nextLine();

                switch (agregarJugadorRespuesta) {
                    case "S":
                    case "s":
                        Jugador jugador = servicioJugador.crearJugador(equipo);
                        equipo.getEquipoJugadorMap(jugador.getNombre()).put(jugador.getEquipo().getNombre(),jugador);
                        break;

                    default:
                        agregarJugador = false;
                }
            } while (agregarJugador);
        } else {
            System.out.println("=     Error en carga");
            System.out.println("=     Presione ENTER para continuar...");
            String opcionEquipos = InputService.scanner.nextLine();
        }


        return equipo;
    }

    public static void listadoEquipos(List<Equipo> equipos) {


        if (equipos != null) {
            for (Equipo equipo : equipos) {
                System.out.println(equipo.toString());
            }
        }else{
            System.out.println("=     Sin Datos");
        }
        System.out.println("=");
        System.out.println("=     Presione ENTER para continuar...");
        String opcionEquipos = InputService.scanner.nextLine();

    }

    @Override
    public void eliminarEquipo(Equipo equipo) {


        if (BootstrapData.equipoMAP.containsValue(equipo)) {
            String clave = "";
            for (Map.Entry<String,Equipo> entry : BootstrapData.equipoMAP.entrySet()) {
                if (entry.getValue().equals(equipo)) {
                    clave = entry.getKey(); // Obtener la clave del objeto
                    break;
                }
            }
            BootstrapData.equipoMAP.remove(clave); // Eliminar el objeto del HashMap
            System.out.println("Se eliminó el objeto con clave " + clave + " y valor " + equipo);
        } else {
            System.out.println("No se encontró ningún objeto con el valor " + equipo);
        }


    }


    @Override
    public  ArrayList<Jugador> buscarPorNombre(String nombre) {
        ArrayList<Jugador> jugadoresEncontrados = new ArrayList<>();

        for (Jugador p : BootstrapData.listSoloJugadores) {
            if (p.getNombre().equals(nombre)) {
                jugadoresEncontrados.add(p);
            }
        }
        return jugadoresEncontrados;
    }
    @Override
    public  ArrayList<Equipo> buscarPorEquipo(Equipo equipo){
        ArrayList<Equipo> equiposEncontrados = new ArrayList<>();
        for (Equipo p : BootstrapData.jugadorMap.keySet()){
            if (p.getNombre().equals(equipo)){
                equiposEncontrados.add(p);
            }

        }
        return equiposEncontrados;
    }




    /**
    @Override
    public PrecioActual crearPrecioActual() {

        PrecioActual precioActual = new PrecioActual();
        System.out.println("INGRESE PRECIO DEL PRODUCTO : ");
        precioActual.setValor(InputService.getScanner().nextDouble());
        precioActual.setFechaDeCarga(LocalDateTime.now());


        return precioActual;
    }
    **/
}
