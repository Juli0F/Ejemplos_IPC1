package com.mycompany.juegocarrera;

import com.mycompany.juegocarrera.menu.JugadorMenu;
import com.mycompany.juegocarrera.model.Jugador;
import com.mycompany.juegocarrera.model.Tienda;
import java.util.Scanner;

/**
 *
 * @author Zeus
 */
public class JuegoCarrera {

    Scanner scanner = new Scanner(System.in);
    Jugador player;
    Tienda tienda;

    public JuegoCarrera() {
        this.player = new Jugador();
        tienda = new Tienda();
    }

    public void menu() {
        int opcion = 0;

        do {

            System.out.println("[1] Perfil"); // inicia
            System.out.println("[2] Jugar");
            System.out.println("[0] Salir");
            
            opcion = scanner.nextInt();
            opciones(opcion);
            linea();
            
        } while (opcion != 0);
    }

    public void opciones(int opcion) {
        
        JugadorMenu jugadorMenu ;
        
        switch (opcion) {
            
            case 1:
                jugadorMenu = new JugadorMenu(player, tienda);
                linea();
                jugadorMenu.menu();

                break;
            case 2:
                System.out.println("");
                System.out.println("Aca se puede agregar un menu para elegir la pista");
                System.out.println("en la que se quiere competir");
                linea();
                
                if(player.getVehiculos()[0] == null ){
                    
                    System.out.println("Se requiere que Compre un vehiculo");
                    linea();
                    jugadorMenu= new JugadorMenu(player, tienda);
                    jugadorMenu.menu();
                    
                }
                linea();  
                Partida partida = new Partida(player);
                partida.inicializarDatos(2);
                linea();
                break;
            case 3:
                System.out.println("Opcion 3, puede ser crear autos personalizados");
                break;
            case 4:
                System.out.println("Opcion 3, puede ser crear partes personalizados");
                break;
            case 0:
                System.out.println("[+] Saliendo ...");
                break;
            default:
                System.out.println("404- No se encontro el recurso");
                ;
        }
    }

    public static void linea() {
        for (int i = 0; i < 10; i++) {

            System.out.print("---");
        }
        System.out.println("");
    }
    
}
