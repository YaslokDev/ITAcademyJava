package Sprint1.n2exercici1;

public class Smartphone extends Telefon implements ICamera, IRellotge {
    @Override
    public void fotografiar() {
        System.out.println("S'esta fent una foto");
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant l'alarma");
    }
}
