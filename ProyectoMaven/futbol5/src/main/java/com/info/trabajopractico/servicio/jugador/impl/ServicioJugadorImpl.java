package com.info.trabajopractico.servicio.jugador.impl;

import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.servicio.entrada.impl.InputService;
import com.info.trabajopractico.servicio.jugador.ServicioJugador;

import java.util.UUID;

import static com.info.trabajopractico.bootstrap.BootstrapData.jugadorMap;

public class ServicioJugadorImpl implements ServicioJugador {
    @Override
    public static Jugador crearJugador(Equipo equipo){

    Jugador jugador = new Jugador();

        jugador.setId(UUID.randomUUID());
        System.out.println("INGRESE EL NOMBRE DEL JUGADOR: ");
        jugador.setNombre(InputService.scanner.next());
        System.out.println("Ingrese el Apellido del Jugador: ");
    //Entrenador entrenador = new Entrenador();
        jugador.setApellido(InputService.scanner.next());
        System.out.println("Ingrese la altura que tiene: ");
        jugador.setAltura(InputService.scanner.nextDouble());
        System.out.println("Ingrese los goles realizados en la temporada: ");
        jugador.setGoles(InputService.scanner.nextInt());
        System.out.println("Ingrese los PARTIDOS realizados en la temporada: ");
        jugador.setPartidos(InputService.scanner.nextInt());
        System.out.println("El Jugador es capitan: ");
        jugador.setEsCapitan(InputService.scanner.hasNextBoolean());
        System.out.println("El numero de camiseta que va usar? ");
        jugador.setNumeroCamiseta(InputService.scanner.nextInt());


        return jugador;
}

    @Override
    public Jugador buscarJugadorPorNombre(Equipo equipo) {
        Jugador jugador = new Jugador();
        System.out.println("Ingrese el nombre del jugador a buscar en el equipo: ");
        jugador.setNombre(InputService.scanner.next());
        equipo.getEquipoJugadorMap(jugador.getNombre());
        return jugador;
    }

//jugador.setPosicion(posicionMap.get());





}
