/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.juegocarrera.model;

/**
 *
 * @author Zeus 
 */
public class Asfalto  extends Pista{

    public Asfalto(int retraso, int longitud, int recompensa) {
        super(retraso, longitud, recompensa);
    }

    
    public Asfalto(int recompensa) {
        super(4,35, recompensa);
        
        
    }
    public Asfalto() {
        super(4,35);
        
    }
    
    

}
