package U1.T5II;

import java.util.Scanner;

public class ej5_22 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca la altura de la bandera en cm:");
    int alt = teclado.nextInt();
    System.out.println("Ahora introduzca la anchura:");
    int anc = teclado.nextInt();
    System.out.println("¿Quiere escudo bordado? (s/n):");
    String bord = teclado.next();

    int m2 = alt * anc;
    double precio = (alt * anc) / 100;
    double pbor = 2.50;
    double genv = 3.25;

    System.out.println("Gracias. Aquí tiene el desglose de su compra:");
    System.out.println("Bandera de " + m2 + " cm2: " + precio + "€");

    if (bord.equals("n")) {
      System.out.println("Sin escudo: 0.00€");
      pbor = 0;
    } else if (bord.equals("s")) {
      System.out.println("Con escudo: 2.50€");
    }

    System.out.println("Gastos de envío: 3,25€");
    System.out.println("Total: " + (precio + pbor + genv) + "€");
  }
}
