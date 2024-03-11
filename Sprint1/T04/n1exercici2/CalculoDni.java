package n1exercici2;

import java.util.Scanner;

public class CalculoDni {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de DNI:");
        int dni = sc.nextInt();
        char letra = calculoDni(dni);
        System.out.println("La letra del DNI es: " + letra);
    }

    public static char calculoDni(int dni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[dni % 23];
    }
}
