package com.info.trabajopractico.servicio.equipo.impl;
import java.time.LocalDate;

import com.info.trabajopractico.bootstrap.BootstrapData;
import com.info.trabajopractico.domain.Entrenador;
import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.servicio.entrada.impl.InputService;
import com.info.trabajopractico.servicio.equipo.ServicioEquipoInterface;
import java.util.Map.Entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServicioEquipoImpl implements ServicioEquipoInterface {
    @Override
    public  Equipo crearEquipo(){
        Equipo equipo = new Equipo();
        System.out.println("INGRESE EL NOMBRE DEL EQUIPO: ");
        equipo.setNombre(InputService.scanner.next());
        equipo.setFechaCreacion(LocalDate.now());
        System.out.println("Ingrese el nombre del entrenador: ");
        //Entrenador entrenador = new Entrenador();
        equipo.getEntrenador().setNombre(InputService.scanner.next());

        return equipo;
    }

    public static void listadoEquipos(List<Equipo> equipos) {


        if (equipos != null) {
            for (Equipo equipo : equipos) {
                System.out.println(equipo.toString());
                for (Map.Entry<String, Jugador> entry: equipo.getEquipoJugadorMap().entrySet()){
                    System.out.println(entry.getValue().toString());

                }
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

        for (Jugador p : BootstrapData.jugadorList.values()) {
            if (p.getNombre().equals(nombre)) {
                jugadoresEncontrados.add(p);
            }
        }
        return jugadoresEncontrados;
    }
    @Override
    public  ArrayList<Equipo> buscarPorEquipo(Equipo equipo){
        ArrayList<Equipo> equiposEncontrados = new ArrayList<>();
        for (Equipo p : BootstrapData.jugadorList.keySet()){
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
