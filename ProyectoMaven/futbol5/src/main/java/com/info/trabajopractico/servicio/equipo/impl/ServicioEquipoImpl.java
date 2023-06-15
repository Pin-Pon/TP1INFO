package com.info.trabajopractico.servicio.equipo.impl;
import java.time.LocalDate;

import com.info.trabajopractico.bootstrap.BootstrapData;
import com.info.trabajopractico.domain.Entrenador;
import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.servicio.entrada.impl.InputService;
import com.info.trabajopractico.servicio.entrenador.impl.ServicioEntrenadorImpl;
import com.info.trabajopractico.servicio.equipo.ServicioEquipoInterface;
import com.info.trabajopractico.servicio.jugador.impl.ServicioJugadorImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServicioEquipoImpl implements ServicioEquipoInterface {
    public static final ServicioJugadorImpl servicioParaJugador = new ServicioJugadorImpl();
    @Override
    public  Equipo crearEquipo(){
        BootstrapData.menuEquipo.menuCrearEquipos();
        Equipo equipo = new Equipo();

        System.out.println("INGRESE EL NOMBRE DEL EQUIPO: ");
        equipo.setNombre(InputService.scanner.nextLine());
        equipo.setFechaCreacion(LocalDate.now());

        if (equipo != null) {
            System.out.println("=    Equipo agregado correctamente...");
            boolean agregarEntrenador = true;

            do {
                System.out.print("=    Desea Agregar un entrenador al equipo? S/N: ");
                String agregarEntrenadorRespuesta = InputService.scanner.nextLine();

                switch (agregarEntrenadorRespuesta.toLowerCase()) {
                    case "s":
                        Entrenador entrenador = ServicioEntrenadorImpl.crearEntrenador(equipo);
                        equipo.setEntrenador(entrenador);
                        break;

                    default:
                        agregarEntrenador = false;
                        break;
                }
            } while (agregarEntrenador);

            boolean agregarJugador = true;

            do {
                System.out.print("=    Desea Agregar un jugador al equipo? S/N: ");
                String agregarJugadorRespuesta = InputService.scanner.nextLine();

                switch (agregarJugadorRespuesta.toLowerCase()) {
                    case "s":
                        Jugador jugador = servicioParaJugador.crearJugador(equipo);
                        equipo.agregarJugador(jugador);
                        break;

                    default:
                        agregarJugador = false;
                        break;
                }
            } while (agregarJugador);
        } else {
            System.out.println("=     Error en carga");
            System.out.println("=     Presione ENTER para continuar...");
            String opcionEquipos = InputService.scanner.nextLine();
        }

        return equipo;
    }



    @Override
    public  ArrayList<Equipo>listadoEquipos(List<Equipo> equipos) {
        ArrayList<Equipo> equiposEncontrados = new ArrayList<>();
        if (equipos != null) {
            for (Equipo equipo : equipos) {
                if (equipo.getNombre().equals(equipo)){
                    equiposEncontrados.add(equipo);
                }
                System.out.println(equipo.toString());
            }
        }else{
            System.out.println("=     Sin Datos");
        }
        System.out.println("=");
        System.out.println("=     Presione ENTER para continuar...");
        String opcionEquipos = InputService.scanner.nextLine();

        return equiposEncontrados;

    }


    @Override
    public void eliminarEquipo() {
        Equipo equipo1 = new Equipo();
        System.out.println("INGRESE EL EQUIPO QUE QUIERE ELIMINAR: ");
        equipo1.setNombre(InputService.scanner.next());

        if (BootstrapData.equipoMAP.containsValue(equipo1)) {
            String clave = "";
            for (Map.Entry<String,Equipo> entry : BootstrapData.equipoMAP.entrySet()) {
                if (entry.getValue().equals(equipo1)) {
                    clave = entry.getKey(); // Obtener la clave del objeto
                    break;
                }
            }
            BootstrapData.equipoMAP.remove(clave); // Eliminar el objeto del HashMap
            System.out.println("Se eliminó el objeto con clave " + clave + " y valor " + equipo1);
        } else {
            System.out.println("No se encontró ningún objeto con el valor " + equipo1);
        }


    }

    public ArrayList<Jugador>buscarPorNombre(){
        return null;
    }




    @Override
    public  ArrayList<Equipo> buscarPorEquipo(){
        Equipo equipo = new Equipo();
        ArrayList<Equipo> equiposEncontrados = new ArrayList<>();
        System.out.println("Ingrese el equipo a buscar: ");
        equipo.setNombre(InputService.scanner.next());

        if (BootstrapData.equipoMAP.containsValue(equipo)){
            equiposEncontrados.add(equipo);
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
