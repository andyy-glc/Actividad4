package agencia;

public class Camioneta extends Vehiculo {
    private String tipoTraccion;
    private double capacidadCarga;
    private int numeroFilas;

    public Camioneta(String placa, String marca, String modelo, int año, double costoPorDia,
                     String tipoTraccion, double capacidadCarga, int numeroFilas) {

        super(placa, marca, modelo, año, costoPorDia);

        this.tipoTraccion = tipoTraccion;
        this.capacidadCarga = capacidadCarga;
        this.numeroFilas = numeroFilas;
    }

    public String getTipoTraccion() { return tipoTraccion; }
    public double getCapacidadCarga() { return capacidadCarga; }
    public int getNumeroFilas() { return numeroFilas; }

    @Override
    public double calcularCosto(int dias) {
        double total = super.calcularCosto(dias);

        if (tipoTraccion.equals("4x4")) {
            total *= 1.15;
        }

        return total;
    }

    @Override
    public String toString() {
        return super.toString() + " - Camioneta";
    }
}