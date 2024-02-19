package org.parking.java.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    public String nombres;
    public String apellidos;
    public Long numeroIdentificacion;
    public List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();

    
    
    public Cliente() {
    }


    public Cliente(String nombres, String apellidos, Long numeroIdentificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
    }


    //Definir metodo de clase
    // addCar: vincular un carrito al cliente

    public void addCar(Vehiculo vehiculo){
        //añadir el carrito a la lista
        //this:para aceder a atributos 
        // y metodos al  interior del objeto 
        //Nota: Usar al interios de metodos 
        this.misVehiculos.add(vehiculo);

    }

    //otra sobrecarga del metodo

    public void addCar(String placa, TipoVehiculo tv){
        Vehiculo v = new Vehiculo();
        v.placa = placa;
        v.tipoVehiculo = tv;
        this.misVehiculos.add(v);
    }
    

}
