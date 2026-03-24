package agencia;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Renta {
    private LocalDate fechaRenta;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Vehiculo vehiculo;
    private Cliente cliente;

    public Renta(LocalDate fechaRenta, LocalDate fechaInicio, LocalDate fechaFin,
                 Vehiculo vehiculo, Cliente cliente) {

        this.fechaRenta = fechaRenta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    public LocalDate getFechaRenta() {
        return fechaRenta;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public int calcularDias() {
        return (int) ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }

    public double calcularTotal() {
        return vehiculo.calcularCosto(calcularDias());
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente +
                "\nVehiculo: " + vehiculo +
                "\nTotal: $" + calcularTotal();
    }
}