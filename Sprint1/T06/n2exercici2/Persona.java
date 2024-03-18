package n2exercici2;

public class Persona {
    private String nom;
    private String cognoms;
    private int edat;

    public Persona(String nom, String cognoms, int edat) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
}
