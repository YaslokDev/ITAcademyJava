package Sprint1.T02.n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner scanner = new Scanner(System.in);

    public static byte llegirByte(String missatge) {
        byte resultat = 0;
        boolean entradaCorrecta = false;
        do {
            try {
                System.out.print(missatge);
                resultat = scanner.nextByte();
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                scanner.nextLine();
            }
        } while (!entradaCorrecta);
        return resultat;
    }

    public static int llegirInt(String missatge) {
        int resultat = 0;
        boolean entradaCorrecta = false;
        do {
            try {
                System.out.print(missatge);
                resultat = scanner.nextInt();
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                scanner.nextLine();
            }
        } while (!entradaCorrecta);
        return resultat;
    }

    public static float llegirFloat(String missatge) {
        float resultat = 0f;
        boolean entradaCorrecta = false;
        do {
            try {
                System.out.print(missatge);
                resultat = scanner.nextFloat();
                entradaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                scanner.nextLine();
            }
        } while (!entradaCorrecta);
        return resultat;
    }

    public static double llegirDouble(String missatge) {
        double resultat = 0;
        boolean entradaCorrecta = false;
        do {
            try {
                System.out.print(missatge);
                resultat = scanner.nextDouble();
                entradaCorrecta = true;
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error de format");
                scanner.nextLine();
            }
        } while (!entradaCorrecta);
        return resultat;
    }

    public static char llegirChar(String missatge) {
        char resultat = '\n';
        boolean entradaCorrecta = false;
        do {
            try {
                System.out.print(missatge);
                String input = scanner.nextLine();
                if (input.length() == 1) {
                    resultat = input.charAt(0);
                    entradaCorrecta = true;
                } else {
                    System.out.println("Error de format");
                }
            } catch (Exception e) {
                System.out.println("Error de format");
                scanner.nextLine();
            }
        } while (!entradaCorrecta);
        return resultat;
    }

    public static String llegirString(String missatge) {
        String resultat = "";
        boolean entradaCorrecta = false;
        do {
            try {
                System.out.print(missatge);
                resultat = scanner.nextLine();
                entradaCorrecta = true;
            } catch (Exception e) {
                System.out.println("Error de format");
                scanner.nextLine();
            }
        } while (!entradaCorrecta);
        return resultat;
    }

    public static boolean llegirSiNo(String missatge) {
        boolean resultat = false;
        boolean entradaCorrecta = false;
        do {
            try {
                System.out.print(missatge);
                String input = scanner.nextLine();
                if (input.length() == 1) {
                    char c = input.toLowerCase().charAt(0);
                    if (c == 's') {
                        resultat = true;
                        entradaCorrecta = true;
                        return true;
                    }
                    if (c == 'n') {
                        entradaCorrecta = true;
                        return false;
                    }
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Error de format");
            }
        } while (!entradaCorrecta);
        return resultat;
    }

}