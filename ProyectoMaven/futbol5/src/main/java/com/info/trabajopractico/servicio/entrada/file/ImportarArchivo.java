package com.info.trabajopractico.servicio.entrada.file;

import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.servicio.entrada.impl.InputService;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportarArchivo {
    //No funciona nada......
}
    /**
    Path archivo = Paths.get("equipos.txt");
    //InputService.scanner.useDelimiter("[;\\n]");
    //Scanner lector = new Scanner(archivo);
    InputService.scanner.(archivo);

    //    lector.useDelimiter("[;\\n]");

    List<Jugador> listadoDeJugadores = new ArrayList<>();


        while (InputService.scanner()) {
        String nom =InputService.scanner.next();
        String ape = InputService.scanner.next();
        double medida = InputService.scanner.nextDouble();
        int goles = InputService.scanner.nextInt();
        int partidosJugados = InputService.scanner.nextInt();
        boolean esCapitan = InputService.scanner.hasNextBoolean();
        int camiseta = InputService.scanner.nextInt();
        String equipo = InputService.scanner.next();

        //String linea = lector.nextLine();  otro metodo!!
        //linea.split(";") split devuelve un vector

        Jugador nuevo = new Jugador(nom,ape,medida,goles,partidosJugados,esCapitan,camiseta,equipo);
        listadoDeJugadores.add(nuevo);

        System.out.println(nuevo);
    }
        InputService.closeScanner();
}
     **/
