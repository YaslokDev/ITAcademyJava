package n1exercici1;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods<Integer> example1 = new NoGenericMethods<>(1, 2, 3);
        NoGenericMethods<Integer> example2 = new NoGenericMethods<>(3, 1, 2);
        NoGenericMethods<Integer> example3 = new NoGenericMethods<>(2, 3, 1);

        System.out.println("Objecte 1 de example1: " + example1.getObjeto1());
        System.out.println("Objecte 2 de example1: " + example1.getObjeto2());
        System.out.println("Objecte 3 de example1: " + example1.getObjeto3());

        System.out.println("Objecte 1 de example2: " + example2.getObjeto1());
        System.out.println("Objecte 2 de example2: " + example2.getObjeto2());
        System.out.println("Objecte 3 de example2: " + example2.getObjeto3());

        System.out.println("Objecte 1 de example3: " + example3.getObjeto1());
        System.out.println("Objecte 2 de example3: " + example3.getObjeto2());
        System.out.println("Objecte 3 de example3: " + example3.getObjeto3());
    }
}
