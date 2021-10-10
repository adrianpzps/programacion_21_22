package U1.T8b;

import java.util.Scanner;

public class ej8_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un numero: ");
    int n = teclado.nextInt();
    int var2 = 0;
    int var3 = 1;

    System.out.print("0, 1, ");

    for (int var = 0 ; var < n ; var++) {

      int resultado = var2 + var3;
      System.out.print(resultado + ", ");
      var2 = var3;
      var3 = resultado;
    }


  }
}
