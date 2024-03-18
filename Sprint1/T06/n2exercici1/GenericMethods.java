package n2exercici1;

public class GenericMethods {
    public static <T> void imprimirArgumentos(T arg1, T arg2, Object arg3) {
        System.out.println("Argumentos: ");
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}
