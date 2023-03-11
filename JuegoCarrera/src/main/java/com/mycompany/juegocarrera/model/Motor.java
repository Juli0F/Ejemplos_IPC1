
package com.mycompany.juegocarrera.model;

/**
 *
 * @author Zeus
 */
public class Motor extends Parte{
    private int velocidad;

    public Motor(double precio, int velocidad ) {
        super(precio);
        super.setNombre("Motor");
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
