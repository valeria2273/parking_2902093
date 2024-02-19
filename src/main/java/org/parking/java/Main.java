package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;

public class Main {
    public static void main(String[] args) {
       //Sistema de gestion de E/S
       //de un vehiculo
       
       Vehiculo carrito1 = new Vehiculo("ASD 789", TipoVehiculo.PARTICULAR);

       Vehiculo carrito2 = new Vehiculo("ASD 143", TipoVehiculo.TAXI);


       //crear(instanciar) un cliente 

       Cliente cliente1 = new Cliente("Cristian", "Buitrago", 122443L);


       //Invocar  el metodo addCar
        cliente1.addCar(carrito1);
        cliente1.addCar(carrito2);
        cliente1.addCar("WWW ERT", TipoVehiculo.MOTO);

        //Recoger la lista de  vehiculos del cliente
        for(Vehiculo v :cliente1.misVehiculos){
            System.out.println(v.placa);
            System.out.println(v.tipoVehiculo);
            System.out.println("---------");
        }
       
        System.out.println(cliente1.nombres);
    }
}