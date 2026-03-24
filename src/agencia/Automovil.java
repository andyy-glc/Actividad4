package agencia;

public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private String transmision;
    private int capacidadPasajeros;

    public Automovil(String placa, String marca, String modelo, int año, double costoPorDia,
                     int numeroPuertas, String transmision, int capacidadPasajeros) {

        super(placa, marca, modelo, año, costoPorDia);

        this.numeroPuertas = numeroPuertas;
        this.transmision = transmision;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getNumeroPuertas() { return numeroPuertas; }
    public String getTransmision() { return transmision; }
    public int getCapacidadPasajeros() { return capacidadPasajeros; }

    @Override
    public String toString() {
        return super.toString() + " - Automovil";
    }
}