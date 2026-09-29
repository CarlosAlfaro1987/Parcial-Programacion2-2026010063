public class Main {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("Carlos", 1000);

        v1.cambiarEstrategia(new ComisionPersonalizada("Carlos"));

        v1.mostrarDetalle();
    }
}
