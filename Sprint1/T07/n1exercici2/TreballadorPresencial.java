package n1exercici2;

public class TreballadorPresencial extends Treballador {

    private static double benzina = 50;


    public TreballadorPresencial(String nom, String cognom, double preuHora, double horesTreballades) {
        super(nom, cognom, preuHora, horesTreballades);
    }

    @Override
    public double calcularSou(double horesTreballades) {
        return (horesTreballades * getPreuHora()) + benzina;
    }

    @Deprecated
    public double calcularSouDeprecated(double horesTreballades) {
        return (horesTreballades * getPreuHora()) + benzina;
    }
}
