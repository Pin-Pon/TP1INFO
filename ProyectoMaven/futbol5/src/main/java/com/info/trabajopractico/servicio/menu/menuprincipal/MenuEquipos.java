package com.info.trabajopractico.servicio.menu.menuprincipal;

import com.info.trabajopractico.servicio.menu.menuEquipos;

public class MenuEquipos implements menuEquipos {


    @Override
    public void menuEquipos() {
        System.out.println("=============Bienvenido a la app : Futbol 5==================");
        System.out.println("=");
        System.out.println("=            Menu de Equipos");
        System.out.println("=");
        System.out.println("=     0 - Volver");
        System.out.println("=     1 - Crear Equipo");
        System.out.println("=     2 - Borrar Equipo");
        System.out.println("=     3 - Buscar Equipo");
        System.out.println("=     4 - Ver Todos los equipos");
        System.out.println("");
        System.out.println("");
        System.out.print("Opcion:  ");
    }

    @Override
    public void menuCrearEquipos() {
        System.out.println("=============Bienvenido a la app : Futbol 5======================");
        System.out.println("=");
        System.out.println("=            Menu de Equipos");
        System.out.println("=            -  Crear Nuevo Equipo ");
    }

    @Override
    public void menuBuscarEquipos() {
        System.out.println("=============Bienvenido a la app : Futbol 5==================");
        System.out.println("=");
        System.out.println("=            Menu de Equipos");
        System.out.println("=            -  Buscar equipos ");
    }


}
