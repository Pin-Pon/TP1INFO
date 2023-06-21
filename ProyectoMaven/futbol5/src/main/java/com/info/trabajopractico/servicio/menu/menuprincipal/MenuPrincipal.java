//package com.tpfinal.services.gui.menuprincipal;
package com.info.trabajopractico.servicio.menu.menuprincipal;


import com.info.trabajopractico.servicio.menu.menuPrincipalInterface;

public class MenuPrincipal implements menuPrincipalInterface {
   // @Override



    @Override
    public void menuPrincipal() {


        System.out.println("=============Bienvenido a la app : Fut5App");
        System.out.println("=");
        System.out.println("=            Menu Principal");
        System.out.println("=");
        System.out.println("=     0 - Terminar App");
        System.out.println("=     1 - Equipos");
        System.out.println("=     2 - Jugadores");
        System.out.println("=     3 - Entrenador");
        System.out.println("");
        System.out.print("Opcion:  ");
    }

}

