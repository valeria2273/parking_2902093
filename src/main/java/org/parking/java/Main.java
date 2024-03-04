package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.Cupo;
import org.parking.java.entities.Empleado;
import org.parking.java.entities.Pago;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
       //Sistema de gestion de E/S
       //de un vehiculo
       
       Vehiculo carrito1 = new Vehiculo("ASD 789", TipoVehiculo.PARTICULAR);

       Vehiculo carrito2 = new Vehiculo("ASD 143", TipoVehiculo.TAXI);

       Vehiculo motico = new Vehiculo();
       motico.setPlaca("XS 439");


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

        //Instanciar cupos:

        Cupo cupito1 = new Cupo('A');
        Cupo cupito2 = new Cupo('B');

        //Instanciar empleado:

        Empleado empleado1 = new Empleado("Gustavito", "Fernandez", "12345");

        //Crear fechas

        LocalDateTime fechaHoraInicio = LocalDateTime.of(2024, Month.FEBRUARY, 1, 15, 30, 0);

        LocalDateTime fechaHoraFin = LocalDateTime.of(2024, Month.FEBRUARY, 10, 6, 15, 5);


        //Hacer registros (pagos)

        Pago pago1 = new Pago(fechaHoraInicio , 
                              fechaHoraFin , 
                              5000.0 , cliente1.misVehiculos.get(0) , 
                              cupito1,empleado1 );

        Pago pago2 = new Pago(fechaHoraInicio , 
                              fechaHoraFin , 
                              10000.0 , cliente1.misVehiculos.get(0) , 
                              cupito2, empleado1 );    
                              
                              
        //Añadir pagos a una lista de pagos

        List<Pago> misPagos = new ArrayList<Pago>();
        misPagos.add(pago1);
        misPagos.add(pago2);


        //Recorrer los pagos para mostrar informacion

        for( Pago p : misPagos ){
            //Evidencia 
            //Mostrar
            //  - Placa del Vehiculo
            //  - Valor pagado
            //  - Fecha y hora de inicio 
            //  - fecha horfa del fin 
            //  - Cupo (nombre)

            System.out.println("|Pago:|Placa:" + p.getVehiculo().getPlaca() + "|" +
                                "|valor:" + p.getValor() + "|" +"|fecha y hora de entrada:" 
                                + p.getFechaHoraInicio().toString() + "|" + "|fecha y hora de fin:" 
                                + p.getFechaHoraFin().toString() + "|" + "|Cupo:" + p.getCupo().getNombre() + "|" +
                                "|Empleado:" + p.getEmpleado().getCodigo() + "|");






        }



}

    }
    


    