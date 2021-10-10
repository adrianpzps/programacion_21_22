package U1.T8;

import java.util.Scanner;

public class ej8_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un numero: ");
    int numero = teclado.nextInt();

    while (numero != 0) {
      if (numero % 2 == 0) {
        System.out.println("Es par");
      } else {
        System.out.println("Es impar");
      }
      if (numero > 0) {
        System.out.println("Es positivo");
      } else {
        System.out.println("Es negativo");
      }
      System.out.println("Su cuadrado es: " + numero * numero);
      System.out.println("Introduzca un numero: ");
      numero = teclado.nextInt();
    }

  }
}
