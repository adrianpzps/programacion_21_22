package U1.T6;

import java.util.Scanner;

public class ej6_3 {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);

  System.out.println("Introduzca un número: ");
  int numero = teclado.nextInt();
  int var = 0;

  if (numero % 2 == 0) {
    var = 1;
    System.out.println("Es par. Variable: " + var);
  } else {
    System.out.println("Es impar. Variable: " + var);
  }

  System.out.println("Introduzca un número: ");
  int numero2 = teclado.nextInt();
  int var2;

  var2 = numero2 % 2 == 0 ? 1 : 0;

    System.out.println(var2);
  }
}
