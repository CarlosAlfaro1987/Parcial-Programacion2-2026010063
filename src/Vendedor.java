// Vendedor hereda de Empleado
public class Vendedor extends Empleado {

    // Por defecto usa la comision estandar
    public Vendedor(String nombre, double ventasMes) {
        super(nombre, ventasMes, new ComisionEstandar());
    }

    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(ventasMes);
        System.out.println("Vendedor: " + nombre);
        System.out.println("Venta total: $" + ventasMes);
        System.out.println("Comision obtenida: $" + comision);
    }
}
