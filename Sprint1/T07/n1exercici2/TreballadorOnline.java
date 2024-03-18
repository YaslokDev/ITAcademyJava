package n1exercici2;

public class TreballadorOnline extends Treballador {

    public static final double tarifaPlanaInternet = 40;

    public TreballadorOnline(String nom, String cognom, double preuHora, double horesTreballades) {
        super(nom, cognom, preuHora, horesTreballades);
    }

    @Override
    public double calcularSou(double horesTreballades) {
        return horesTreballades * getPreuHora() + tarifaPlanaInternet;
    }

    @Deprecated
    public double calcularSouDeprecated(double horesTreballades) {
        return horesTreballades * getPreuHora() + tarifaPlanaInternet;
    }

}
