package Sprint1.T02.n1exercici1;

import java.util.ArrayList;

public class Venda {
    private static final int MAX_PRODUCTES = 5;
    private ArrayList<Producte> productes;
    private double preuTotal;

    public Venda() {
        this.productes = new ArrayList<>();
        this.preuTotal = 0.0;
    }

     public void afegirProducte(Producte producte){
        if(productes.size() >= MAX_PRODUCTES) {
            throw new ArrayIndexOutOfBoundsException("El máxim de productes es 5");
        }
        productes.add(producte);
     }

     public void calcularTotal() throws VendaBuidaException {
        if (productes.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
        }
        for (Producte producte : productes) {
            preuTotal += producte.getPreu();
        }
     }

    public double getPreuTotal() {
        return preuTotal;
    }
}

