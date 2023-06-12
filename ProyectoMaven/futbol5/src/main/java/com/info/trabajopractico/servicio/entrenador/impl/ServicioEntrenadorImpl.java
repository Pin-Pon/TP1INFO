package com.info.trabajopractico.servicio.entrenador.impl;

import com.info.trabajopractico.domain.Entrenador;
import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.servicio.entrada.impl.InputService;

public class ServicioEntrenadorImpl {
    public Entrenador crearEntrenador(Equipo equipo){
        System.out.println("Esta asignando un entrenador para el Equipo: " + equipo);
        Entrenador entrenador = new Entrenador();
        System.out.println("Ingrese el nombre del entrenador: ");
        entrenador.setNombre(InputService.scanner.next());
        System.out.println("Ingrese el apellido del entrenador: ");
        entrenador.setApellido(InputService.scanner.next());
        System.out.println("Ingrese la edad del entrenador: ");
        entrenador.setEdad(InputService.scanner.nextInt());


        return entrenador;
    }
}
