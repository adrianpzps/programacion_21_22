package U1.T8;

import java.util.Scanner;

public class ej8_10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un numero: ");
    int numero = teclado.nextInt();

    while (numero < 1 || numero > 10) {
      System.out.println("Introduzca un numero: ");
      numero = teclado.nextInt();
    }
    for (int var = 1 ; var <= 10 ; var++ ) {
      System.out.println(numero + " X " + var + " = " + (numero*var));
    }
  }
}
