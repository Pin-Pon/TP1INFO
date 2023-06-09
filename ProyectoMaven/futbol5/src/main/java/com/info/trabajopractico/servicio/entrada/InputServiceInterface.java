package com.info.trabajopractico.servicio.entrada;

import java.util.Scanner;

public interface InputServiceInterface {
    static void createScanner() {

    }

    Scanner getScanner();
    void closeScanner();
}
