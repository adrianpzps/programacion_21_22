package U1.T8b;

import java.util.Scanner;

public class ej8_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce un numero: ");
    int n = teclado.nextInt();

    for (int var = n ; var <= n + 4 ; var++ ) {
      System.out.println("|| Para " + var + " || su cuadrado es " + ( var * var ) + " || y su cubo " + ( var * var * var ) + " ||");
    }

  }
}
