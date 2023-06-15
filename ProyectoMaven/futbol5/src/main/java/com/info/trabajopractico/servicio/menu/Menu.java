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
    public static final ServicioJugador servicioParaIntegrante;

    static {
        servicioParaIntegrante = new ServicioJugadorImpl();
    }


    public static void menuPrincipal(){



        Boolean seguir =true;

        InputService.crearEscaner();

        while (seguir){
            BootstrapData.menuPrincipal.menuPrincipal();




            String opcion = InputService.scanner.nextLine();

            switch (opcion){
                case "0":
                    seguir = false;
                    break;
                case"1":
                    menuEquipos();
                    break;
            }
        }
    }
    private static void menuEquipos(){



        Boolean seguirEquipos =true;
        while (seguirEquipos){
            BootstrapData.menuPrincipal.menuPrincipal();
            String opcionEquipos = InputService.scanner.nextLine();

            switch (opcionEquipos){
                case "0":
                    seguirEquipos = false;
                    break;
                case "1":

                    BootstrapData.equipos.add(servicioParaEquipo.crearEquipo());
                    break;
                    /**
                System.out.println("=     0 - Volver");
                System.out.println("=     1 - Crear Equipo");
                System.out.println("=     2 - Borrar Equipo");
                System.out.println("=     3 - Buscar Equipo");
                System.out.println("=     4 - Ver Todos los equipos");
                     **/
                case "2":
                    servicioParaEquipo.eliminarEquipo();
                    break;
                case "3":
                    servicioParaEquipo.buscarPorEquipo();
                    break;
                case "4":
                    servicioParaEquipo.listadoEquipos(BootstrapData.equipos);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcionEquipos);
            }
        }

    }



}
