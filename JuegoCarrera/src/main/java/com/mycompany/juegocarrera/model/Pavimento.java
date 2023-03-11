/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.juegocarrera.model;

/**
 *
 * @author Zeus 
 */
public class Pavimento extends Pista {

    public Pavimento(int recompensa) {
        super(3,10, recompensa);
    }

    public Pavimento(int retraso, int longitud) {
        super(retraso, longitud);
    }

    public Pavimento(int retraso, int longitud, int recompensa) {
        super(retraso, longitud, recompensa);
    }
    
    

}
