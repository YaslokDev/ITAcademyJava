package n2exercici2;

public class Restaurant implements Comparable<Restaurant> {
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    @Override
    public int hashCode() {
        return nom.hashCode() + puntuacio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Restaurant other = (Restaurant) obj;
        return nom.equals(other.nom) && puntuacio == other.puntuacio;
    }


    @Override
    public int compareTo(Restaurant restaurant) {
        int comparacionPorNombre = this.nom.compareTo(restaurant.nom);
        if (comparacionPorNombre == 0) {
            return Integer.compare(this.puntuacio, restaurant.puntuacio);
        } else {
            return comparacionPorNombre;
        }
    }

}
