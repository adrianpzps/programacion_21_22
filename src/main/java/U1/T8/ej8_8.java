package U1.T8;

import java.util.Scanner;

public class ej8_8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un numero: ");
    int numero = teclado.nextInt();
    int resultado = 1;

    for (int var = numero ; var > 0 ; var-- ) {
      resultado = resultado * var;
    }
    System.out.println("El factorial de " + numero + " es: " + resultado);
  }
}
