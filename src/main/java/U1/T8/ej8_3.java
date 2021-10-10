package U1.T8;

import java.util.Scanner;

public class ej8_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int usu = 0;
    int maq = 1;

    while (usu != -1 && usu != maq) {
      System.out.println("Introduce un numero: ");
      maq = (int) (Math.random() * 100 + 1);
      usu = teclado.nextInt();
      if (usu != -1) {
        System.out.println("USUARIO SACO: " + usu + " - MAQUINA SACO: " + maq);
      }
    }
  }
}
