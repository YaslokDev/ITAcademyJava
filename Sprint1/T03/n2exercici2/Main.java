package n2exercici2;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();

        Restaurant r1 = new Restaurant("Pizza Roma",5);
        Restaurant r2 = new Restaurant("El Gourmet",7);
        Restaurant r3 = new Restaurant("El Gourmet",5);
        Restaurant r4 = new Restaurant("Pizza Roma",5);
        Restaurant r5 = new Restaurant("Casa Pedro",9);
        Restaurant r6 = new Restaurant("Casa Pedro",2);

        boolean agregado1 = restaurants.add(r1);
        boolean agregado2 = restaurants.add(r2);
        boolean agregado3 = restaurants.add(r3);
        boolean agregado4 = restaurants.add(r4);
        boolean agregado5 = restaurants.add(r5);
        boolean agregado6 = restaurants.add(r6);

        List<Restaurant> listaOrdenada = new ArrayList<>(restaurants);
        Collections.sort(listaOrdenada);

        for (Restaurant restaurant : listaOrdenada) {
            System.out.println(restaurant.getNom() + " /// Puntuación: " + restaurant.getPuntuacio());
        }
    }
}
