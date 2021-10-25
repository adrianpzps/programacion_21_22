package U1.ENTREGABLE_2122;

import java.util.Scanner;

// ESPERO ESTAR MAS TRANQUILO EN EL SIGUIENTE, PORQUE SE HACERLOS.

public class ej_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce un número de 6 cifras: ");
    int numero = teclado.nextInt();

    while (numero < 100000 || numero > 999999) {
      System.out.print("Introduce un número de 6 cifras: ");
      numero = teclado.nextInt();
    }

    int cociente = numero;
    int dig = 0;
    int resto;
    int var1 = 0;

    while (dig < 3) {
      resto = cociente % 10;
      cociente = cociente / 10;
      var1 = (var1 * 10) + resto;
      dig++;
    }

    System.out.print(var1);

    int cociente2 = var1;
    int var2 = 0;
    resto = 0;

    while (cociente2 > 0) {
      resto = cociente2 % 10;
      cociente = cociente2 / 10;
      var2 = (var2 * 10) + resto;
    }
    System.out.println(var2);
  }
}
