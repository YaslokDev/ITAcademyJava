package n1exercici8;

@FunctionalInterface
interface manipularString {
    String reverse(String str);
}

public class Main {
    public static void main(String[] args) {
        manipularString manipularString = (str) -> {
            StringBuilder reves = new StringBuilder(str);
            return reves.reverse().toString();
        };

        String original = "Hola desde ITAcademy";
        String reves = manipularString.reverse(original);

        System.out.println("Original: " + original);
        System.out.println("Al revés: " + reves);
    }
}
