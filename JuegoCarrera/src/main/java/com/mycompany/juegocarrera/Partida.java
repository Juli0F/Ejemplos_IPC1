package com.mycompany.juegocarrera;

import com.mycompany.juegocarrera.model.Asfalto;
import com.mycompany.juegocarrera.model.Calavera;
import com.mycompany.juegocarrera.model.Carrera;
import com.mycompany.juegocarrera.model.Diagonal;
import com.mycompany.juegocarrera.model.Gas;
import com.mycompany.juegocarrera.model.Jugador;
import com.mycompany.juegocarrera.model.Parte;
import com.mycompany.juegocarrera.model.Pavimento;
import com.mycompany.juegocarrera.model.Pista;
import com.mycompany.juegocarrera.model.Terraceria;
import com.mycompany.juegocarrera.model.Vehiculo;

/**
 *
 * @author Zeus
 */
public class Partida {

    private Pista[] pista;
    private Jugador jugador;

    private Vehiculo[] vehiculos;

    public Partida() {
       

    }

    public Partida(Jugador jugador) {
        this.jugador = jugador;
        crearPistas();
    }

    private void crearPistas() {
        this.pista = new Pista[3];

        this.pista[0] = new Asfalto(100);
        this.pista[1] = new Terraceria(100, 25, 300);
        this.pista[2] = new Pavimento(2,40,200);
    }

    public void inicializarDatos(int pista) {

        //para el jugador
        Parte[] partes = new Parte[]{
            new Gas(20, 6, "Basico"),
            new Diagonal(20),
            new Calavera(2)
        };

        Vehiculo v = new Vehiculo(partes, 100);
        Jugador cpu = new Jugador("CPU", 100, v);
        
        
        Carrera carrera = new Carrera( this.pista[pista]);
        carrera.iniciarCarrera(jugador,cpu);
    }

}
