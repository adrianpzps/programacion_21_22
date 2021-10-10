package U1.T5II;

import java.util.Scanner;

public class ej5_25 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comer = teclado.nextLine();
    double precio = 0;

    if (comer.equals("palmera")) {
      precio = 1.40;
    } else if (comer.equals("donut")) {
      precio = 1;
    } else if (comer.equals("pitufo")) {
      System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
      String oppi = teclado.nextLine();
      if (oppi.equals("aceite")) {
        precio = 1.20;
      } else if (oppi.equals("tortilla")) {
        precio = 1.60;
      }
    }
    System.out.print("¿Qué ha tomado de beber? (zumo o cafe): ");
    double pbebida = 0;
    String cbebida = teclado.nextLine();
    if (cbebida.equals("zumo")) {
      pbebida = 1.50;
    } else if (cbebida.equals("cafe")) {
      pbebida = 1.20;
    }
    if (comer.equals("palmera")) {
      System.out.println("Palmera: " + precio + " €");
    } else if (comer.equals("donut")) {
      System.out.println("Donut: " + precio + " €");
    } else if (precio == 1.20) {
      System.out.println("Pitufo con aceite: " + precio + " €");
    } else if (precio == 1.60) {
      System.out.println("Pitufo con tortilla: " + precio + " €");
    }
    if (pbebida == 1.50) {
      System.out.println("Zumo: 1,50 €");
    } else if (pbebida == 1.20) {
      System.out.println("Café: 1,20 €");
    }
    System.out.println("Total desayuno: " + (precio + pbebida) + " €");
  }
}
