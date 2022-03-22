package U7.T2;

import java.util.HashSet;
import java.util.Set;

public class ej2 {

    public static void main(String[] args) {

        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        Set<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);

        System.out.println(interseccion(conjunto1,conjunto2));
    }

    public static Set interseccion (Set conjunto1, Set conjunto2) {

        Set<Integer> conjunto3 = new HashSet<>();

        conjunto1.retainAll(conjunto2);
        conjunto3.addAll(conjunto1);

        return conjunto3;
    }
}
