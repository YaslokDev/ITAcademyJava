package n1exercici5;

public class Main {

    @FunctionalInterface
    interface Pi {
        double getPiValue();
    }
    public static void main(String[] args) {

        Pi pi = () -> 3.1415;

        System.out.println("Valor de Pi: " + pi.getPiValue());

    }
}
