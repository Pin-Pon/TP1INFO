//package com.tpfinal.services.gui.menuprincipal;
package com.info.trabajopractico.servicio.menu.menuprincipal;

//import static com.info.trabajopractico.bootstrap.BootstrapData.menuJugador;

import com.info.trabajopractico.servicio.menu.menuJugador;

public class MenuJugador implements menuJugador {

    private void limpiarPantalla() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("========================================================================================");
        System.out.println("");
    }
    @Override
    public void menuIntegrante() {

    }

    @Override
    public void menuCrearIntegrante() {
        limpiarPantalla();
        System.out.println("=============Bienvenido a la app : Fut5App");
        System.out.println("=");
        System.out.println("=            Menu de Integrantes");
        System.out.println("=            -  Crear Nuevo Integrante ");

    }
}