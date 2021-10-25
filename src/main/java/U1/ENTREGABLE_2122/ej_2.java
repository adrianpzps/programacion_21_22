package U1.ENTREGABLE_2122;

import java.util.Scanner;

// ESPERO ESTAR MAS TRANQUILO EN EL SIGUIENTE, PORQUE SE HACERLOS.

public class ej_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    int numero = teclado.nextInt();
    System.out.print("Introduzca un número: ");
    int salto = teclado.nextInt();

    int cociente = numero;
    int resto;
    int var = 0;
    int var2 = 1;

    while (cociente > 0) {
      // if
      resto = cociente % 10;
      cociente = cociente / 10;
      var = (var * 10) + resto;
    }
  }
}
