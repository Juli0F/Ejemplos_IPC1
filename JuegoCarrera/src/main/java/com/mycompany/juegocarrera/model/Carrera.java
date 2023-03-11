

package com.mycompany.juegocarrera.model;

import java.util.Random;

/**
 *
 * @author Zeus 
 */
public class Carrera {
   
    private Pista pista;
    private Random rand;
    
    public Carrera(  Pista pista) {
  
        this.pista = pista;
        this.rand = new Random();
    }
    
    public void iniciarCarrera(Jugador jugador, Jugador cpu){
       
       jugador.setPosicion(0);
       cpu.setPosicion(0);

        System.out.println("¡Comienza la carrera!");
        mostrarCarrera(jugador.getPosicion(), cpu.getPosicion());
        
        while (jugador.getPosicion() < pista.getLongitud() && cpu.getPosicion() < pista.getLongitud()) {
            
            jugador.setPosicion(jugador.getPosicion() + moverVehiculo(jugador));
            cpu.setPosicion(cpu.getPosicion() + moverVehiculo(cpu));
                        
            mostrarCarrera(jugador.getPosicion(), cpu.getPosicion());
        }
        System.out.println("");
        System.out.println("Resultado de la carrera:");
        if (jugador.getPosicion() >= pista.getLongitud() && cpu.getPosicion() >= pista.getLongitud()) {
            System.out.println("¡Empate!");
        } else if (jugador.getPosicion() >= pista.getLongitud()) {
            System.out.println("¡Ganaste!");
       
        } else {
            System.out.println("¡Perdiste!");
        }        
        
    }
    
    private int moverVehiculo(Jugador jugador) {
        
        int value = jugador.getVehiculos()[0].avanzar();
        
        int avance = rand.nextInt( value ) + 1;
        avance -= pista.getRetraso();
        // aca se verifica que la diferencia entre avanzar y el retroceso
        //que produce la pista sea mayor a 0, esto para que solo avance
        avance = avance > 0 ? avance : 0;
        
        return avance;
    }
    
     private void mostrarCarrera(int jugadorRow, int cpuRow) {
        for (int i = 0; i < pista.getLongitud(); i++) {
            if (i == jugadorRow && i == cpuRow) {
                System.out.print("Inicio");
            } else if (i == jugadorRow) {
                System.out.print("J");
            } else if (i == cpuRow) {
                System.out.print("C");
            } else {
                System.out.print("_");
            }
        }
        System.out.println("");
    }
}
