package U3.T1.FUNCIONES;

import java.util.Scanner;

public class ej_3 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca: \n 1. Calcular Área \n 2. Calcular Volumen");

    int calculo = teclado.nextInt();

    System.out.println("Introduzca el radio de la base: ");
    int radio = teclado.nextInt();
    System.out.println("Introduzca la altura: ");
    int altura = teclado.nextInt();

    calcula(calculo, radio, altura);
  }

  static void calcula(int calculo, int radio, int altura) {

    double resultado;

    if (calculo == 1) {
      resultado = 2 * 3.14 * radio * (altura + radio);
      System.out.println(resultado);
    } else {
      resultado = 3.14 * (radio * radio) * altura;
      System.out.println(resultado);
    }
  }
}
