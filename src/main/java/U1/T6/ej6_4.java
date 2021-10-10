package U1.T6;

import java.util.Scanner;

public class ej6_4 {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca el primer valor: ");
    byte n1 = teclado.nextByte();
    System.out.println("Introduzca el segundo valor: ");
    byte n2 = teclado.nextByte();

    byte var = 0;

    if (n1 > n2) {
      var = n2;
      System.out.println(n2);
    } else {
      var = n1;
      System.out.println(n1);
    }

    System.out.println("Introduzca el primer valor: ");
    byte n3 = teclado.nextByte();
    System.out.println("Introduzca el segundo valor: ");
    byte n4 = teclado.nextByte();

    byte var2;

    var2 = n3 > n4 ? n4 : n3;
    System.out.println(var2);
  }
}
