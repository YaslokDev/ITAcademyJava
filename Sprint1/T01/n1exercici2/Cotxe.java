package Sprint1.T01.n1exercici2;

public class Cotxe {
    private static final String MARCA = "Tesla";
    private static String model;
    private final double POTENCIA;

    public Cotxe() {
        POTENCIA = 500;
    }

    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

}
