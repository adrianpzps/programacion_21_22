package U3.T1.FUNCIONES;

import java.util.Scanner;

public class ej_10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    int n1 = teclado.nextInt();
    System.out.println("Introduzca otro número ");
    int n2 = teclado.nextInt();

    amigos(n1, n2);
  }

  static void amigos(int n1, int n2) {

    if (sumadivisores(n1) == sumadivisores(n2)) {
      System.out.println(n1 + " y " + n2 + " son amigos!");
    } else {
      System.out.println(n1 + " y " + n2 + " no son amigos!");
    }
  }

  static int sumadivisores(int n1) {

    int cocienten1 = n1;
    int suman1 = 0;

    for (int i = 1; i < n1; i++) {
      if (cocienten1 % i == 0) {
        cocienten1 = cocienten1 / i;
        suman1 = suman1 + i;
      }
    }

    return suman1;
  }
}
