package n2exercici1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();

        Restaurant r1 = new Restaurant("Pizza Roma",5);
        Restaurant r2 = new Restaurant("El Gourmet",7);
        Restaurant r3 = new Restaurant("El Gourmet",5);
        Restaurant r4 = new Restaurant("Pizza Roma",5);

        boolean agregado1 = restaurants.add(r1);
        boolean agregado2 = restaurants.add(r2);
        boolean agregado3 = restaurants.add(r3);
        boolean agregado4 = restaurants.add(r4);

        for (Restaurant restaurant : restaurants) {
            System.out.println(restaurant.getNom() + " Puntuación: " + restaurant.getPuntuacio());
        }
    }
}
