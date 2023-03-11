package com.mycompany.juegocarrera.model;

/**
 *
 * @author Zeus
 */
public class Tienda {

    private Parte[] partes;
    private Vehiculo[] vehiculos;

    public Tienda() {
        this.partes = new Parte[10];
        this.vehiculos = new Vehiculo[3];
        crearVehiculos();
        crearMotores();
        crearNeumaticos();
        crearSticker();
        
                
    }

    public Parte[] getPartes() {
        return partes;
    }

    public void setPartes(Parte[] partes) {
        this.partes = partes;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    private void crearMotores() {

        partes[0] = new Diesel(100, 3, "Ipa");
        partes[1] = new Electrico(100, 3, "Licher");
        partes[2] = new Gas(70, 2, "Güin  ");
        partes[3] = new Diesel(100, 4, "Jack");
        partes[4] = new Electrico(100, 4, "Daniels");
    }

    private void crearNeumaticos() {

        partes[5] = new Simetrico(90);
        partes[6] = new Diagonal(100);
        partes[7] = new Radial(50);

    }

    private void crearSticker() {

        partes[8] = new Calavera(20);
        partes[9] = new Llama(15);
    }

    private void crearVehiculos() {
        Parte[] partes = new Parte[]{
            new Gas(100, 4, "Basico"),
            new Diagonal(20),
            new Calavera(2)
        };

        //para la maquina
        Parte[] partes2 = new Parte[]{
            new Electrico(300, 6, "Intermedio"),
            new Radial(20),
            new Llama(2)
        };

        Parte[] partes3 = new Parte[]{
            new Electrico(600, 10, "Premium"),
            new Radial(20),
            new Llama(2)
        };

        //int precio, Parte[] partes, String descriptor) {
        Vehiculo basico = new Vehiculo(100, partes, "Basico");
        Vehiculo intermedio = new Vehiculo(300, partes2, "Intermedio");
        Vehiculo premium = new Vehiculo(600, partes3, "Premium");

        this.vehiculos[0] = basico;
        this.vehiculos[1] = intermedio;
        this.vehiculos[2] = premium;
    }

}
