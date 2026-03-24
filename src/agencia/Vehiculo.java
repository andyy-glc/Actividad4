package agencia;

public class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double costoPorDia;

    public Vehiculo(String placa, String marca, String modelo, int año, double costoPorDia) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.costoPorDia = costoPorDia;
    }

    public double calcularCosto(int dias) {
        double total = dias * costoPorDia;

        if (dias > 7) {
            total *= 0.9;
        }

        return total;
    }
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAño() {
        return año;
    }
    public double getCostoPorDia() {
        return costoPorDia;
    }

    public void setCostoPorDia(double costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + placa + ")";
    }
}