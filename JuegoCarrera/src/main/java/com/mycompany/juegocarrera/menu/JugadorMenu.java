package com.mycompany.juegocarrera.menu;

import static com.mycompany.juegocarrera.JuegoCarrera.linea;
import com.mycompany.juegocarrera.intermedio.JugadorDatos;
import com.mycompany.juegocarrera.intermedio.TiendaDatos;
import com.mycompany.juegocarrera.model.Jugador;
import com.mycompany.juegocarrera.model.Tienda;
import com.mycompany.juegocarrera.model.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Zeus
 */
public class JugadorMenu {

    Scanner scanner = new Scanner(System.in);

    private Jugador jugador;

    private JugadorDatos jugadorDatos;
    private TiendaDatos tiendaDatos;

    public JugadorMenu(Jugador jugador, Tienda tienda) {
        this.jugador = jugador;
        this.jugadorDatos = new JugadorDatos(jugador);
        
        this.tiendaDatos = new TiendaDatos(tienda);
    }

    public void mostrarDatos() {
        System.out.println(jugador.toString());
    }

    public void menu() {

        mostrarDatos();
        linea();
        int seleccion = 0;
        do {
            System.out.println("[1] Cambiar Nombre");
            System.out.println("[2] Seleccionar Vehiculo Por Defecto");
            System.out.println("[3] Comprar Vehiculo");
            System.out.println("[4] Comprar Parte");
            System.out.println("[5] Mostrar Datos");
            System.out.println("[0] Regresar");
            linea();
            seleccion = scanner.nextInt();
            opcion(seleccion);
            linea();
        } while (seleccion != 0);
    }

    public void opcion(int opcion) {
        Scanner scanner2 = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese Nombre Nuevo");
                String nombre = scanner2.nextLine();

                this.jugador.setNombre(nombre);
                linea();
                break;
            case 2:
                System.out.println("Listando Vehiculos ... ");
                if (jugadorDatos.listarVehiculos()) {

                    System.out.println("Seleccione Vehiculo Por Defecto");
                    int indice = scanner2.nextInt();
                    this.jugadorDatos.cambiarVehiculo(indice);
                    
                }else
                    System.out.println("No tiene Vehiculos");
                
                break;
            case 3:
                
                System.out.println("Comprar Vehiculos ");
                this.tiendaDatos.listarVehiculos();
                int vehiculoOpcion = scanner2.nextInt();
                
                Vehiculo v = this.tiendaDatos.getVehiculo(vehiculoOpcion);
                System.out.println(v.getDescriptor());
                this.jugador.comprarVehiculo(v);

                break;
            case 4:
                linea();
                System.out.println("Comprar Parte ");
                this.tiendaDatos.listarPartes();
                int parteOpcion = scanner2.nextInt();
                //this.jugador.comprarParte(this.tiendaDatos.getVehiculo(parteOpcion));
                System.out.println("En Construccion");
                linea();
                break;
            case 5:
                
                linea();
                mostrarDatos();
                linea();
                break;
            case 0:
                System.out.println("[+] Regresando ...");
                break;
            default:
                System.out.println("404- No se encontro el recurso");
                ;
        }
    }

}
