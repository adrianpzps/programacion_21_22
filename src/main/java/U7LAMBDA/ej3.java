package U7LAMBDA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ej3 {

  public static void main(String[] args) {

    List<Integer> lista = new ArrayList<>();

    Integer tamano = 20;

    for (int i = 0; i < tamano; i++) {
      Integer aleatorio = (int) (1 + (Math.random() * 99));
      lista.add(aleatorio);
    }

    List<Integer> lista2 = new ArrayList<>();

    for (int i = 0; i < tamano; i++) {
      Integer aleatorio = (int) (1 + (Math.random() * 99));
      lista.add(aleatorio);
    }

    Stream.concat(lista.stream(), lista2.stream()).sorted().distinct().forEach(System.out::println);
  }
}
