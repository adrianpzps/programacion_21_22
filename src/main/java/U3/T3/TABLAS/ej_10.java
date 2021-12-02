package U3.T3.TABLAS;

import java.util.Arrays;
import java.util.Scanner;

public class ej_10 {
  public static void main(String[] args) {

    int[] array = new int[6];

    rellenaPares(array);
  }

  static void rellenaPares(int[] array) {
    Scanner teclado = new Scanner(System.in);

    int contador = 0;
    int n = 0;
    int nimpares = 0;

    while (contador < array.length) {
      System.out.println("Introduce un número: ");
      n = teclado.nextInt();
      if (n % 2 == 0) {
        array[contador] = n;
        contador++;
      } else {
        nimpares++;
      }
    }

    System.out.println(Arrays.toString(array));
    System.out.println("La cantidad de impares es: " + nimpares);
  }
}
