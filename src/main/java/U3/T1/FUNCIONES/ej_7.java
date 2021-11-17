package U3.T1.FUNCIONES;

import java.util.Scanner;

public class ej_7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    int n = teclado.nextInt();

    esprimo(n);
  }

  static void esprimo(int n) {
    boolean primo = true;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        primo = false;
        break;
      }
    }
    if (primo) {
      System.out.println(n + " Es primo");
    } else {
      System.out.println(n + " No es primo");
    }
  }
}
