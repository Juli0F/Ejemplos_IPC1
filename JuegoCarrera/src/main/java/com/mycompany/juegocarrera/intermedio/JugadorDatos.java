package com.mycompany.juegocarrera.intermedio;

import com.mycompany.juegocarrera.model.Jugador;
import com.mycompany.juegocarrera.model.Vehiculo;

/**
 *
 * @author Zeus
 */
public class JugadorDatos {

    private Jugador jugador;

    public JugadorDatos(Jugador jugador) {
        this.jugador = jugador;
    }

    public boolean listarVehiculos() {
        
        if (jugador.getVehiculos() == null) {
             
             return false;
        }
        
        if (jugador.getVehiculos()[0] == null) {
            return false;
        }
        
        Vehiculo[] vehiculos = jugador.getVehiculos();

        if (vehiculos != null) {
            for (int i = 0; i < vehiculos.length; i++) {
                if (vehiculos[i] != null) {

                    System.out.println("[" + i + "]" + vehiculos[i].getDescriptor());
                }
            }

        }
        return true;
    }
   public boolean cambiarVehiculo(int i){
       
       
       if(i == 0) return true;
       
       Vehiculo temporal;
       if (jugador.getVehiculos() != null){
           
           if(jugador.getVehiculos()[i] != null){
               temporal = jugador.getVehiculos()[i];
               jugador.getVehiculos()[i] = jugador.getVehiculos()[0];
               jugador.getVehiculos()[0] = temporal;
               return true;
           }
       }
           
       
       return false;
   }
}

