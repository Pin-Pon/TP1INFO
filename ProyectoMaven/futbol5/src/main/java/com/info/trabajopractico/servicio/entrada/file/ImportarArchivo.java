package com.info.trabajopractico.servicio.entrada.file;

import com.info.trabajopractico.bootstrap.BootstrapData;
import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.domain.Posicion;
import com.info.trabajopractico.servicio.entrada.impl.InputService;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportarArchivo {
    public List<Jugador> loadProductsByFile(String rutaArchivo) {
        //Inicializamos lista de productos
        List<Jugador> jugadoresImportados = new ArrayList<>();



        try{
            //Lineas del archivo
            List<String> lineas = FileUtils.readLines(new File(rutaArchivo), StandardCharsets.UTF_8);

            //Cada linea es un producto
            for (String linea: lineas) {
                //Partes de la linea
                String[] partes = linea.split(";");

                String nombre = partes[0];
                String apellido = partes[1];
                double medida = Double.parseDouble(partes[2]);
                int goles = Integer.parseInt(partes[3]);
                int partidosJugados = Integer.parseInt(partes[4]);
                boolean esCapitan = Boolean.parseBoolean(partes[5]);
                int camiseta = Integer.parseInt(partes[6]);




                Jugador jugador2023 = new Jugador(nombre,apellido,medida,goles,partidosJugados,esCapitan,camiseta);
                jugadoresImportados.add(jugador2023);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        }catch (NullPointerException n){
            System.out.println("Hoal soy un error");
            throw new RuntimeException(n);
        }
        return jugadoresImportados;
    }
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
