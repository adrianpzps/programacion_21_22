package U1.ENTREGABLE_2122;

import java.util.Scanner;

// ESPERO ESTAR MAS TRANQUILO EN EL SIGUIENTE, PORQUE SE HACERLOS.

public class ej_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca la altura: ");
    int altura = teclado.nextInt();

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < (altura * 2) + 4; j++) {
        // if (j == 0 || j == altura - 1 || (j == ((altura 1 + 4) + (altura / 2)) && (i >
        // altura/2))) {
        System.out.print("*");
        // } else {
        System.out.print(" ");
      }
    }
    System.out.println();
  }
}
// }
