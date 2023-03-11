/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.juegocarrera.model;

/**
 *
 * @author Zeus 
 */
public class Jugador {
    private String nombre;
    private double dinero;
    private Vehiculo[] vehiculos;
    private int posicion;

    //constructores         --- ejemplo de sobre carga de constructores---
     public Jugador(String nombre, double dinero, Vehiculo[] vehiculo) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.vehiculos = vehiculo;
        this.posicion = 0;
        
    }
    public Jugador(String nombre, double dinero, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.posicion = 0;
        
        this.vehiculos = new Vehiculo[3];
        this.vehiculos[0] = vehiculo;
        
        
    }
    public Jugador(String nombre, double dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
        this.vehiculos = new Vehiculo[3];
    }
    
    public Jugador(){
        this.vehiculos = new Vehiculo[3];
        this.dinero = 600;
    }
    ///////////////Fin de constructores///////////////
    
    public int getPosicion() {
        
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
     
    

    public String getNombre() {
        
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    public void comprarParte(Parte parte){
        System.out.println("Comprando");
        
        //si tenemos el dinero suficiente
        
        if(this.dinero >= parte.getPrecio()){
            
            for(int i = 0 ; i < 3 ; i++){
                
                if(this.vehiculos[i] == null){
                    this.dinero -= parte.getPrecio();
                    this.vehiculos[0].getPartes()[0] = parte;
                    System.out.println("Parte Comprada...");
                    return;
                }
            }
            
        }
        System.out.println("No se puede comprar el vehiculo, El dinero no es suficiente o ya cuenta con 3 vehiculos");
    }
    public void comprarVehiculo(Vehiculo vehiculo){
        System.out.println("Comprando");
        
        //si tenemos el dinero suficiente
        
        if(this.dinero >= vehiculo.getPrecio()){
            
            for(int i = 0 ; i < 3 ; i++){
                
                if(this.vehiculos[i] == null){
                    this.dinero -= vehiculo.getPrecio();
                    this.vehiculos[i] = vehiculo;
                    System.out.println("Vehiculo Comprado...");
                    return;
                }
            }
            
        }
        System.out.println("No se puede comprar el vehiculo, El dinero no es suficiente o ya cuenta con 3 vehiculos");
    }

    @Override
    public String toString() {
        return "[+] nombre=" + nombre +
                "\n[+] dinero=" +
                dinero +
                "\n[+] Vehiculo Seleccionado= " +
                ((this.vehiculos[0] != null)? this.vehiculos[0].toString():"Sin Vehiculos");
    }
    
 }
