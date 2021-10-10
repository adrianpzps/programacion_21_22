package U1.T8;

import java.util.Scanner;

public class ej8_4 {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      System.out.println("Inserte un numero: ");
      int numero = teclado.nextInt();
      int variable = 0;

      while (numero > variable) {
          variable++;
      System.out.println(variable);
      }
  }
}
