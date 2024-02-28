package Sprint1.n1exercici1;

public class Main {
    public static void main(String[] args) {

        Vent vent1 = new Vent("Flauta", 100);

        System.out.println("Nom de l'instrument: " + vent1.getNom());
        System.out.println("Preu de l'instrument: " + vent1.getPreu());
        vent1.tocar();

    }
}