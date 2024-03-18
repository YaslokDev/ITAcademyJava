package n2exercici2;

public class GenericMethods {
    public static <T> void imprimirArgumentos(T... args) {
        System.out.println("Argumentos: ");
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}
