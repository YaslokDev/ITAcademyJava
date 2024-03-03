package Sprint1.T02.n2exercici1;

public class Main {
    public static void main(String[] args) {

        byte b = Entrada.llegirByte("Introdueix un byte: ");
        System.out.println("Byte introduit: " + b);

        int i = Entrada.llegirInt("Introdueix un int: ");
        System.out.println("Int introduit: " + i);

        float f = Entrada.llegirFloat("Introdueix un float: ");
        System.out.println("Float introduit: " + f);

        double d = Entrada.llegirDouble("Introdueix un double: ");
        System.out.println("Double introduit: " + d);

        char c = Entrada.llegirChar("Introdueix un char: ");
        System.out.println("Char introduit: " + c);

        String s = Entrada.llegirString("Introdueix un string: ");
        System.out.println("String introduit: " + s);

        boolean bool = Entrada.llegirSiNo("Introdueix un boolea: ");
        System.out.println("Boolea introduit: " + bool);
    }
}
