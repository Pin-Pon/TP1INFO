package com.info.trabajopractico.servicio.salida.impl;

import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.servicio.salida.OutPutFileService;
import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

//import static jdk.internal.org.jline.utils.AttributedStringBuilder.append;

public class Exportador implements OutPutFileService {

        public static void exportarListaJugadores(Map<Equipo ,List<Jugador>> listaJugadores, String rutaArchivo) {
            File archivo = new File(rutaArchivo);

            try {
                StringBuilder contenido = new StringBuilder();

                for (List<Jugador> jugadores: listaJugadores.values())
                    contenido.append(jugadores.toString()).append(System.lineSeparator());

                FileUtils.writeStringToFile(archivo, contenido.toString(), "UTF-8");
                System.out.println("Archivo exportado exitosamente.");
            } catch (IOException e) {
                System.out.println("Error al exportar el archivo: " + e.getMessage());
            }
        }
        public static void exportJugadores(List<Jugador> jugadoresOutPut, String rutaDeDestino) throws IOException{
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaDeDestino))){

                for (Jugador jugador: jugadoresOutPut) {

                    //Preparamos la linea del archivo
                    String linea = jugador.getNombre() + ";" +
                            jugador.getApellido() + ";" +
                            jugador.getApellido() + ";" +
                            jugador.getAltura() + ";" +
                            jugador.getGoles() + ";" +
                            jugador.getPartidos() + ";" +
                            jugador.getEsCapitan() + ";" +
                            jugador.getNumeroCamiseta() + ";" +
                            ((jugador.getEquipo() != null)?jugador.getEquipo().getNombre():"")+ ";" +
                            ((jugador.getPosicion() != null)?jugador.getPosicion().getDescripcion():"");



                    writer.write(linea); //Escribimos en archivo
                    writer.newLine(); //Salto de linea
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }


}
