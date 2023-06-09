package com.info.trabajopractico.servicio.entrada.impl;

import com.info.trabajopractico.servicio.entrada.InputServiceInterface;

import java.util.Scanner;

public class InputService implements InputServiceInterface {
    public static Scanner scanner;
    @Override

    public static void createScanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
    }
    @Override
    public  Scanner getScanner(){
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
    @Override
    public  void closeScanner(){
        if(scanner != null){
            scanner.close();
        }
    }
}
