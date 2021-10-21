package U1.T8b;

import java.util.Scanner;

public class ej8_7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número: ");
    int num = teclado.nextInt();
    int cociente = num;
    int resto = 0;
    int rev = 0;

    int acu1 = num;
    int acu2 = 0;

    while (acu1 % 10 == 0) {
      acu1 = acu1 / 10;
      System.out.print(acu2);
    }

    while (cociente > 0) {
      resto = cociente % 10;
      cociente = cociente / 10;
      rev = (rev * 10) + resto;
    }
    System.out.println(rev);
  }
}
