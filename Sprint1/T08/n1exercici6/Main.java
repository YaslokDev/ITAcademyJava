package n1exercici6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String[] lista = {"ITAcademy", "Helicóptero", "Hola", "Hipopótamo","As", "Trio"};

        List<String> resultado = Arrays.stream(lista).sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        System.out.println(resultado);


    }
}
