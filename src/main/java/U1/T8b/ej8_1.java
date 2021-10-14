package U1.T8b;

import java.util.Scanner;

public class ej8_1 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int clave = 0001;

    for (int var = 1; var <= 4; var++) {
      System.out.println("Introduce la clave");
      int claveusuario = teclado.nextInt();

      if (clave == claveusuario) {
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        return;
      } else {
        System.out.println("Lo siento, esa no es la combinación");
        System.out.println("------------------------------------");
      }
    }
  }
}
