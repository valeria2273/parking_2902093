package org.parking.java.entities;
import java.time.LocalDateTime;

public class Pago {

    //Atributos Intrinsecos
    private LocalDateTime fechaHoraInicio;
    private LocalDateTime fechaHoraFin;
    private Double valor;

    //Atributo de relación
    private Vehiculo vehiculo;
    private Cupo cupo;
    private Empleado empleado;



    //Constructor por defecto     
    public Pago() {
    }


    //Constructor parametrizado
    public Pago(LocalDateTime fechaHoraInicio, 
                LocalDateTime fechaHoraFin, 
                Double valor, 
                Vehiculo vehiculo, 
                Cupo cupo,
                Empleado empleado) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.valor = valor;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
        this.empleado = empleado; 
    }


    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }


    public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }


    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }


    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }


    public Double getValor() {
        return valor;
    }


    public void setValor(Double valor) {
        this.valor = valor;
    }


    public Vehiculo getVehiculo() {
        return vehiculo;
    }


    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }


    public Cupo getCupo() {
        return cupo;
    }


    public void setCupo(Cupo cupo) {
        this.cupo = cupo;
    }


    public Empleado getEmpleado() {
        return empleado;
    }


    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }


    
    
}


