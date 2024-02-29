package Sprint1.T01.n1exercici1;

public abstract class Instruments {

    private String nom;
    private double preu;

    public Instruments(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    static {
        System.out.println("La clase instruments s'ha carregat de forma estática");
    }

    public abstract void tocar();
}
