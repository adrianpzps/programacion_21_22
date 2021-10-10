package U1.T7;

import java.util.Scanner;

public class ej7_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int var1 = 1;
    int var2 = 2;
    int var3;

    var3 = var2;
    var2 = var1;
    var1 = var3;

    System.out.println(var1 + " " + var2);
  }
}
