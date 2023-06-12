package com.info.trabajopractico.servicio.menu;
import com.info.trabajopractico.domain.Equipo;
import com.info.trabajopractico.bootstrap.BootstrapData;
import com.info.trabajopractico.servicio.entrada.impl.InputService;
import com.info.trabajopractico.servicio.equipo.ServicioEquipoInterface;
import com.info.trabajopractico.servicio.equipo.impl.ServicioEquipoImpl;
import com.info.trabajopractico.servicio.jugador.ServicioJugador;
import com.info.trabajopractico.servicio.jugador.impl.ServicioJugadorImpl;


public class Menu {
    public static final ServicioEquipoInterface servicioParaEquipo = new ServicioEquipoImpl();
    public static final ServicioJugador servicioParaIntegrante ;

    static {
        servicioParaIntegrante = new ServicioJugadorImpl();
    }


    public static void menuPrincipal(){



        Boolean seguir =true;

        InputService.createScanner();

        while (seguir){
            BootstrapData.menuPrincipal.menuPrincipal();




            int opcion = InputService.scanner.nextInt();

            switch (opcion){
                case 0:
                    seguir = false;
                    break;
                case 1:
                    menuEquipos();
                    break;
            }
        }
    }
    private static void menuEquipos(){



        Boolean seguirEquipos =true;
        while (seguirEquipos){
            BootstrapData.menuPrincipal.menuPrincipal();
            int opcionEquipos = InputService.scanner.nextInt();

            switch (opcionEquipos){
                case 0:
                    seguirEquipos = false;
                    break;
                case 1:

                    BootstrapData.equipos.add(servicioParaEquipo.crearEquipo());
                    break;
                case 2:
                    servicioParaEquipo.eliminarEquipo();
                    break;
                case 3:
                    servicioParaEquipo.buscarPorEquipo();
                    break;
                case 4:
                    servicioParaEquipo.listadoEquipos(BootstrapData.equipos);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcionEquipos);
            }
        }

    }



}
