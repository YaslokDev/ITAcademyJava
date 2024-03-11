package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;

public class Meses {

       private ArrayList<String> meses = new ArrayList<>();

       public Meses() {
           meses = new ArrayList<>(Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio","Julio","Agosto",
                                                "Septiembre","Octubre","Noviembre","Diciembre"));
       }

    public ArrayList<String> getMeses() {
        return meses;
    }
}
