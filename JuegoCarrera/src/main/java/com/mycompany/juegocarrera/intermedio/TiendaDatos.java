package com.mycompany.juegocarrera.intermedio;

import com.mycompany.juegocarrera.model.Tienda;
import com.mycompany.juegocarrera.model.Vehiculo;

/**
 *
 * @author Zeus
 */
public class TiendaDatos {

    private Tienda tienda;

    public TiendaDatos(Tienda tienda) {
        this.tienda = tienda;
    }
    public void listarVehiculos(){
        
        if(this.tienda.getVehiculos() != null ){
            for (int i = 0; i < this.tienda.getVehiculos().length; i++) {
                System.out.printf("[%d] %s   ---   Precio %d\n",i,
                        this.tienda.getVehiculos()[i].getDescriptor(),
                        this.tienda.getVehiculos()[i].getPrecio()
                        );
            }
        }
    }
    public void listarPartes(){
         if(this.tienda.getPartes()!= null ){
            for (int i = 0; i < this.tienda.getPartes().length; i++) {
                System.out.printf("[%d] %s   ---   Precio %f\n",
                        i,
                        this.tienda.getPartes()[i].getNombre(),
                        this.tienda.getPartes()[i].getPrecio()
                );
            }
        }
    }
    public Vehiculo getVehiculo(int indice){
        return this.tienda.getVehiculos()[indice];
    }
}
