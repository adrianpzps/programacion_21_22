package U7.T1;

import java.util.ArrayList;
import java.util.Collections;

public class ej1 {
  public static void main(String[] args) {

    // Creamos collection / arraylist

    ArrayList<Integer> lista = new ArrayList<>();

    // Introducimos aleatorios

    for (int i = 0; i < 20; i++) {
        lista.add((int) (1 + (Math.random() * 99)));
    }

    // Imprimimos

    for (Integer n: lista) {
      System.out.print(n + ", ");
    }

    // Ordenamos

    Collections.sort(lista);
    System.out.println();

    // Imprimimos

    for (Integer n: lista) {
      System.out.print(n + ", ");
    }

  }
}
