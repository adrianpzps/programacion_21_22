package U1.T5II;

import java.util.Scanner;

public class ej5_10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca la hora: ");
    int hora = teclado.nextInt();
    System.out.println("Introduzca los minutos");
    int min = teclado.nextInt();
    int minxh = 60;
    int mnoche = 24;
    System.out.println("Faltan: " + ((mnoche - 1) - hora) + "H y " + (minxh - min) + "M");
  }
}
