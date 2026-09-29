// Comision de (5 + N)% donde N es la cantidad de letras del primer nombre
public class ComisionPersonalizada implements EstrategiaComision {

    private int porcentaje;

    public ComisionPersonalizada(String primerNombre) {
        int n = primerNombre.length();
        this.porcentaje = 5 + n;
    }

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * porcentaje / 100;
    }

    public int getPorcentaje() {
        return porcentaje;
    }
}
