package U1.T6;

import java.util.Scanner;

public class ej6_5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca el radio de la circunfenrecia: ");
    double radio = teclado.nextDouble();
    System.out.println("Introduzca:\n1.Calcular diámetro\n2.Calcular perímetro\n3.Calcular área");
    int calc = teclado.nextInt();

    double resul;

    switch (calc) {
      case 1:
        resul = radio * 2;
        System.out.println("El diámetro es: " + resul);
        break;
      case 2:
        resul = 2 * 3.14 * radio;
        System.out.println("El perímetro es: " + resul);
        break;
      case 3:
        resul = 3.14 * radio * radio;
        System.out.println("El área es: " + resul);
    }
  }
}
