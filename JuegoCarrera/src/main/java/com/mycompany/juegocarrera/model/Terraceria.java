/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.juegocarrera.model;

/**
 *
 * @author Zeus 
 */
public class Terraceria extends Pista {
    
    public Terraceria(int recompensa) {
        super(5,30, recompensa);
    }

    public Terraceria(int retraso, int longitud) {
        super(retraso, longitud);
    }

    public Terraceria(int retraso, int longitud, int recompensa) {
        super(retraso, longitud, recompensa);
    }
    
}
