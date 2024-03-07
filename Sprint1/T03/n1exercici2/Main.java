package n1exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();

        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);
        intList.add(50);

        System.out.println("---- Orden Normal ----");
        System.out.println(intList);

        List<Integer> intList2 = new ArrayList<>();

        Collections.reverse(intList);
        intList2.addAll(intList);

        System.out.println("---- Orden Inverso ----");
        System.out.println(intList2);
    }
}
