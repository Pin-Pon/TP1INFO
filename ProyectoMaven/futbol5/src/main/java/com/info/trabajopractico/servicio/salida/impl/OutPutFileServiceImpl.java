package com.info.trabajopractico.servicio.salida.impl;

import com.info.trabajopractico.domain.Jugador;
import com.info.trabajopractico.servicio.salida.OutPutFileService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
/**
public class OutPutFileServiceImpl implements OutPutFileService {
    @Override
    public void exportJugadores(List<Jugador> jugadoresOutPut, String rutaDeDestino){

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaDeDestino))){

            for (Jugador jugador: jugadoresOutPut) {
          //      String linea =


                String cadena; //No me toma la variable....
                cadena = String.format("%s;%s;%s;%d;%d;%s;%d;%s;%s;%s", jugador.getNombre(), jugador.getApellido(), jugador.getAltura(), jugador.getGoles(), jugador.getPartidos(), jugador.getEsCapitan(), jugador.getNumeroCamiseta(), (jugador.getEquipo() != null) ? jugador.getEquipo().getNombre() : "", (jugador.getPosicion() != null) ? jugador.getPosicion().getNombre() : "", writer.write(cadena));
                writer.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
**/


