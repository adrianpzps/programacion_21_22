package U7.T2;

import java.util.HashSet;
import java.util.Set;

public class ej4 {

    public static void main(String[] args) {

        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        Set<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(1);
        conjunto2.add(2);
        conjunto2.add(3);

        if (incluido(conjunto1,conjunto2)) {
            System.out.println("Todos pertenecen");
        } else {
            System.out.println("No pertenecen");
        }
    }

    public static boolean incluido (Set conjunto1, Set conjunto2) {

        if (conjunto2.containsAll(conjunto1)) {
            return true;
        } else {
            return false;
        }

    }

}
