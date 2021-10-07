package U1.T5II;

import java.util.Scanner;

public class ej5_20 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca la base imponible: ");
    double produc = teclado.nextDouble();
    System.out.println("Introduzca el tipo de IVA:\n1 - general\n2 - reducido\n3 - superreducido");
    int iva = teclado.nextInt();
    double riva = 0;

    if (iva == 1) {
      riva = ((produc * 21) / 100);
    } else if (iva == 2) {
      riva = ((produc * 10) / 100);
    } else if (iva == 3) {
      riva = ((produc * 4) / 100);
    }

    System.out.println(
        "Introduzca el cigo promocional:\n1 - nopro\n2 - mitad\n3 - meno5\n4 - 5porc");
    int promo = teclado.nextInt();
    double rpromo = 0;

    if (promo == 1) {
      rpromo = (produc + riva);
    } else if (promo == 2) {
      rpromo = ((produc + riva)) / 2;
    } else if (promo == 3) {
      rpromo = ((produc + riva)) - 5;
    } else if (promo == 4) {
      rpromo = (produc + riva) * 5 / 100;
    }

    System.out.println("Base imponible");

    if (iva == 1) {
      System.out.println("IVA (21%)");
    } else if (iva == 2) {
      System.out.println("IVA (10%)");
    } else if (iva == 3) {
      System.out.println("IVA (4%)");
    }

    System.out.println("Precio con IVA");
    System.out.println(produc);
    System.out.println(riva);
    System.out.println(produc + riva);

    if (promo == 1) {
      System.out.println("Cód. promo. (SIN PROMO): -0");
    } else if (promo == 2) {
      System.out.println("Cód. promo. (MITAD): -" + rpromo);
    } else if (promo == 3) {
      System.out.println("Cód. promo. (MENOS 5): -" + rpromo);
    } else if (promo == 4) {
      System.out.println("Cód. promo. (MENOS 5 %): -" + rpromo);
    }

    System.out.println("TOTAL");
    System.out.println((produc + riva) - rpromo);
  }
}
