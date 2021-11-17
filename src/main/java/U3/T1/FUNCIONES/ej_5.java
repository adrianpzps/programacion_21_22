package U3.T1.FUNCIONES;

import java.util.Scanner;

public class ej_5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un primero número: ");
    int n1 = teclado.nextInt();
    System.out.println("Introduzca un segundo número: ");
    int n2 = teclado.nextInt();
    System.out.println("Introduzca un tercer número: ");
    int n3 = teclado.nextInt();

    System.out.println(mayor(mayor(n1, n2), n3));
  }

  static int mayor(int n1, int n2) {

    if (n1 > n2) {
      return n1;
    } else {
      return n2;
    }
  }
}
