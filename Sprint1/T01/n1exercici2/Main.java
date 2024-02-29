package Sprint1.T01.n1exercici2;

public class Main {
    public static void main(String[] args) {

        // Invocar método estático

        Cotxe.frenar();

        // Invocar método NO estático

        Cotxe cotxe1 = new Cotxe();
        cotxe1.accelerar();
    }
}
