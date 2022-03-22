package U7.T1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ej5 {
  public static void main(String[] args) {


      Comparator<Integer> comparador = Collections.reverseOrder();
      Set<Integer> lista = new TreeSet<>(comparador);

      while (lista.size() < 20) {
          lista.add((int) (1 + (Math.random() * 99)));
      }

    System.out.println(lista);
  }
}
