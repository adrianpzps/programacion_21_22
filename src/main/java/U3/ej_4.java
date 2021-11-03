package U3;

import java.util.Scanner;

public class ej_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un primero número: ");
    int n1 = teclado.nextInt();
    System.out.println("Introduzca un segundo número: ");
    int n2 = teclado.nextInt();

    mayor(n1, n2);
  }

  static int mayor(int n1, int n2) {

    if (n1 > n2) {
      return n1;
    } else {
      return n2;
    }
  }
}
