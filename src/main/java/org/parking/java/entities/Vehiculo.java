package org.parking.java.entities;

public class Vehiculo {
    public String placa;
    public TipoVehiculo tipoVehiculo;

    //Constructor
    //Sin parametros: Constructor con defecto
    public Vehiculo() {
    }

    //Constructor parametrizado

    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }


}
