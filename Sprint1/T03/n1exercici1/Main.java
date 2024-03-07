package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Month> monthsList = new ArrayList<>(Arrays.asList(new Month("Gener"), new Month("Febrer"), new Month("Març"),
                new Month("Abril"), new Month("Maig"), new Month("Juny"), new Month("Juliol"),
                new Month("Septembre"), new Month("Octubre"), new Month("Novembre"), new Month("Desembre")));

        monthsList.add(7, new Month("Agost"));

        System.out.println("---- ArrayList ----");
        for (Month meses : monthsList) {
            System.out.println(meses.getName());
        }

        HashSet<Month> monthHashSet = new HashSet<>(monthsList);
        System.out.println("---- HashSet con FOR ----");

        //Intentamos añadir el mes de Juny otra vez pero no acepta duplicados
        monthHashSet.add(monthsList.get(5));

        for (Month meses : monthHashSet) {
            System.out.println(meses.getName());
        }

        Iterator<Month> it = monthHashSet.iterator();

        System.out.println("---- HashSet con Iterador ----");
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }
    }
}
