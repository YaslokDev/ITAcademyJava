package n1exercici2;

public class Treballador {

    private String nom;
    private String cognom;
    private double preuHora;
    private double horesTreballades;

    public Treballador(String nom, String cognom, double preuHora, double horesTreballades) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
        this.horesTreballades = horesTreballades;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public double getPreuHora() {
        return preuHora;
    }

    public void setPreuHora(double preuHora) {
        this.preuHora = preuHora;
    }

    public double getHoresTreballades() {
        return horesTreballades;
    }

    public void setHoresTreballades(double horesTreballades) {
        this.horesTreballades = horesTreballades;
    }

    public double calcularSou(double horesTreballades) {
        return horesTreballades * preuHora;
    }
}
