package agencia;

public class Cliente {
    private String nombre;
    private String celular;
    private String identificacion;

    public Cliente(String nombre, String celular, String identificacion) {
        this.nombre = nombre;
        this.celular = celular;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCelular() {
        return celular;
    }
    public String getIdentificacion() {
        return identificacion;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return nombre + " (" + identificacion + ")";
    }
}