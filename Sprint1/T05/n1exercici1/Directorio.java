package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class Directorio {
    public static void main(String[] args) {

        mostrarDirectorio("src/main/java/");
    }

    public static void mostrarDirectorio(String path) {
        File directorio = new File(path);
        String[] lista = directorio.list();
        Arrays.sort(lista);
        for (String s : lista) {
            System.out.println(s);
        }
    }
}
