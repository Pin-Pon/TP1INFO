package com.info.trabajopractico;

import com.info.trabajopractico.bootstrap.BootstrapData;
import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.servicio.entrada.file.ImportarArchivo;
import com.info.trabajopractico.servicio.menu.Menu;
import com.info.trabajopractico.servicio.menu.menuprincipal.MenuPrincipal;
import com.info.trabajopractico.servicio.salida.impl.Exportador;

import java.io.IOException;
import java.util.List;

import static com.info.trabajopractico.servicio.salida.impl.Exportador.exportJugadores;

/**
 * Hello world!
 *
 */
public class App {
    private static final ImportarArchivo inputFileService = new ImportarArchivo();
    private static final Exportador outPutFileService = new Exportador();
    public static void main( String[] args ) throws IOException {
        BootstrapData.initData();
        Menu.menuPrincipal();

/**
        String rutaArchivo = "C:\\Users\\HP\\Desktop\\TrabajoIntegrador\\TP1INFO\\ProyectoMaven\\futbol5\\src\\main\\java\\com\\info\\trabajopractico\\resources\\equipos.txt";

        List<Jugador>jugadors = inputFileService.loadProductsByFile(rutaArchivo);
        System.out.println(jugadors);
        System.out.println("**************************************");
        System.out.println("**************************************");

        String rutaArchivosalida = "C:\\Users\\HP\\Desktop\\TrabajoIntegrador\\TP1INFO\\ProyectoMaven\\futbol5\\src\\main\\java\\com\\info\\trabajopractico\\resources\\Salida1.txt";
        String rutaArchivosalida2 = "C:\\Users\\HP\\Desktop\\TrabajoIntegrador\\TP1INFO\\ProyectoMaven\\futbol5\\src\\main\\java\\com\\info\\trabajopractico\\resources\\jSalida22.txt";
        Exportador exportador = new Exportador();
        exportador.exportarListaJugadores(BootstrapData.jugadorMap,rutaArchivosalida);

        System.out.println("########################################################");

        Exportador.exportJugadores(BootstrapData.listSoloJugadores,rutaArchivosalida2);


       // outPutFileService.exportarListaJugadores(BootstrapData.jugadorList,rutaArchivosalida);
 **/

    }
}
