package com.info.trabajopractico.servicio.entrada;

import java.util.Scanner;

public interface InputServiceInterface {
    void createScanner();
    Scanner getScanner();
    void closeScanner();
}
