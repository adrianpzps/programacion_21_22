package U7LAMBDA;

import java.util.ArrayList;
import java.util.List;

public class ej2 {
  public static void main(String[] args) {

      List<Integer> lista = new ArrayList<>();

      Integer tamano = 100;

      for (int i = 0; i < tamano; i++) {
          Integer aleatorio = (int) (1 + (Math.random() * 99));
          lista.add(aleatorio);
      }

      lista.stream().filter(x -> x % 7 == 0).forEach(System.out::println);
  }
}
