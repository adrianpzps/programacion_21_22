package U1.T5II;

import java.util.Scanner;

public class ej5_23 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor = teclado.nextLine();
    double precio = 0;

    if (sabor.equals("manzana")) {
      precio = 18;
    } else if (sabor.equals("fresa")) {
      precio = 16;
    } else if (sabor.equals("chocolate")) {
      System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
      String opcho = teclado.nextLine();
      if (opcho.equals("negro")) {
        precio = 14;
      } else if (opcho.equals("blanco")) {
        precio = 15;
      }
    }
    System.out.print("¿Quiere nata? (si o no): ");
    double pnata = 0;
    String cnata = teclado.nextLine();
    if (cnata.equals("si")) {
      pnata = 2.50;
    } else if (cnata.equals("no")) {
    }
    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    double pnombre = 0;
    String cnombre = teclado.nextLine();
    if (cnombre.equals("si")) {
      pnombre = 2.75;
    } else if (cnombre.equals("no")) {
    }
    if (sabor.equals("manzana")) {
      System.out.println("Tarta de manzana: " + precio + " €");
    } else if (sabor.equals("fresa")) {
      System.out.println("Tarta de fresa: " + precio + " €");
    } else if (precio == 14) {
      System.out.println("Tarta de chocolate negro: " + precio + " €");
    } else if (precio == 15) {
      System.out.println("Tarta de chocolate blanco: " + precio + " €");
    }
    if (pnata == 2.50) {
      System.out.println("Con nata: 2,50 €");
    }
    if (pnombre == 2.75) {
      System.out.println("Con nombre: 2,75 €");
    }
    System.out.println("Total: " + (precio + pnata + pnombre) + " €");
  }
}
