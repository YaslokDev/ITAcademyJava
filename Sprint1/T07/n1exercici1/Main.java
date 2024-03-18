package n1exercici1;

public class Main {
    public static void main(String[] args) {

        Treballador treballador = new Treballador("Pepe","García",12,160);
        System.out.println("Sueldo trabajador: " + treballador.calcularSou(treballador.getHoresTreballades()) + " €" );

        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("María", "Ramírez",12,160);
        System.out.println("Sueldo trabajador presencial: " + treballadorPresencial.calcularSou(treballadorPresencial.getHoresTreballades()) + " €");

        TreballadorOnline treballadorOnline = new TreballadorOnline("Aitor", "Val",12,160);
        System.out.println("Sueldo trabajador online: " + treballadorOnline.calcularSou(treballadorOnline.getHoresTreballades()) + " €");

    }
}
