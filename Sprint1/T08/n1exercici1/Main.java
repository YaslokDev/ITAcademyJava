package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("criaturas");
        lista.add("terrícolas");
        lista.add("desde");
        lista.add("Marte");

        List<String> palabrasConO = encontrarpalabrasConO(lista);
        System.out.println("Palabras que contienen la letra 'o': " + palabrasConO);
    }

    public static List<String> encontrarpalabrasConO(List<String> lista) {
        return lista.stream()
                .filter(palabra -> palabra.contains("o") || palabra.contains("O"))
                .toList();
    }
}
