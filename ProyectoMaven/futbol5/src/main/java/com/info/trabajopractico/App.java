package com.info.trabajopractico;

import com.info.trabajopractico.bootstrap.BootstrapData;
import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.servicio.entrada.file.ImportarArchivo;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    private static final ImportarArchivo inputFileService = new ImportarArchivo();
    public static void main( String[] args ) {

//No encuentra la ruta
        String rutaArchivo = "C:\\Users\\HP\\Desktop\\TrabajoIntegrador\\TP1INFO\\ProyectoMaven\\futbol5\\src\\main\\java\\com\\info\\trabajopractico\\resources\\equipos.txt";

        List<Jugador>jugadors = inputFileService.loadProductsByFile(rutaArchivo);










    }
}
