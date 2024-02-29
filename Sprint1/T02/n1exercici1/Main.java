package Sprint1.T02.n1exercici1;

public class Main {
    public static void main(String[] args) {

        Producte producte1 = new Producte("Ordinador Portàtil", 800.0);
        Producte producte2 = new Producte("Ratolí", 20.0);
        Producte producte3 = new Producte("Bossa Portàtil", 30.0);

        Venda venda = new Venda();

        venda.afegirProducte(producte1);
        venda.afegirProducte(producte2);
        venda.afegirProducte(producte3);

//        Descomentar per l'excepció ArrayIndexOutOfBoundsException
//
//        venda.afegirProducte(producte1);
//        venda.afegirProducte(producte2);
//        venda.afegirProducte(producte3);

        try {
            venda.calcularTotal();
            System.out.println("Preu total de la venda: " + venda.getPreuTotal());
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
