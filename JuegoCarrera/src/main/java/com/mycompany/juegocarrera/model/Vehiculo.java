
package com.mycompany.juegocarrera.model;

/**
 *
 * @author Zeus 
 */
public class Vehiculo {
    
    private int precio;
    private Parte[] partes;
    private String descriptor;

    public Vehiculo(Parte[] parte, int precio) {
        this.partes = parte;
        this.precio = precio;
    }

    public Vehiculo(int precio, Parte[] partes, String descriptor) {
        this.precio = precio;
        this.partes = partes;
        this.descriptor = descriptor;
    }
   
    public Vehiculo(){
        
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    public Parte[] getPartes() {
        return partes;
    }

    public void setPartes(Parte[] partes) {
        this.partes = partes;
    }

    
    
    public int avanzar(){
         int avanzar = 0;
         for(Parte parte : partes){
             
           if(parte instanceof Motor){
               avanzar = ((Motor) parte).getVelocidad();             
               return avanzar;
           }
       }
         return avanzar;
        
    }
    
     public void frenar(){
        System.out.println("Frenando ...");
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    
    @Override
    public String toString() {
        return this.descriptor != null? this.descriptor:"Sin Nombre";
    }
     
}
