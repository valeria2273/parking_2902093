package org.parking.java.entities;

public class Vehiculo {

    // Los Atributos de una Clase para cumplir con el Encapsulamiento DEBEN SER PRIVADOS!!!!

    private String placa;
    private TipoVehiculo tipoVehiculo;

    //Constructor
    //Sin parametros: Constructor con defecto
    public Vehiculo() {
    }

    //Constructor parametrizado

    public Vehiculo(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }























    

}
