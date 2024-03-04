package org.parking.java.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nombres;
    private String apellidos;
    private Long numeroIdentificacion;
    private List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();

    
    
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

        // Utilizando el Setter de Placa
        //Para asignar Valor de Placa
        //AL NUEVO VEHICULO

        v.setPlaca (placa);
        v.setTipoVehiculo(tv);
        this.misVehiculos.add(v);
    }


    public String getNombres() {
        return nombres;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


    public List<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }


    public void setMisVehiculos(List<Vehiculo> misVehiculos) {
        this.misVehiculos = misVehiculos;
    }

    


    

}
