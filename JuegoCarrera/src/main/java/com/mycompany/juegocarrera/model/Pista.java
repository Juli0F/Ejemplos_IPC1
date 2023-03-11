/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.juegocarrera.model;

/**
 *
 * @author Zeus 
 */
public class Pista {
    private int retraso;
    private int longitud;
    private int recompensa;

    public Pista(int retraso, int longitud) {
        this.retraso = retraso;
        this.longitud = longitud;
    }

    public Pista(int retraso, int longitud, int recompensa) {
        this.retraso = retraso;
        this.longitud = longitud;
        this.recompensa = recompensa;
    }
    

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }
    

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getRetraso() {
        return retraso;
    }

    public void setRetraso(int retraso) {
        this.retraso = retraso;
    }
    
    
    
}
