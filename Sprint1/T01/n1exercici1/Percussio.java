package Sprint1.T01.n1exercici1;

public class Percussio extends Instruments{

    public Percussio(String nom, double preu) {
        super(nom, preu);
    }

    @Override
    public void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
