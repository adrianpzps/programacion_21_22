package U1.EXAMEN;

import java.util.Scanner;

public class ej_4 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Bienvenido a Carbonita Volando");

    double abs = 0.2;
    double pla = 0.3;
    double madera = 0.5;
    double flexible = 0.7;

    System.out.print("Introduzca el precio de su figura en gramos: ");
    int gramos = teclado.nextInt();

    System.out.print("Introduzca el tipo de material (1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
    int tipo = teclado.nextInt();

    System.out.print("¿Quiere posprocesado? (1=si, 2=no): ");
    int pp = teclado.nextInt();

    System.out.print("¿Pertenece a Enjuto3D Premium? (1=si, 2=no): ");
    int ep = teclado.nextInt();

    double precio = 0;

    if (tipo == 1) {
      precio = gramos * abs;
    } else if (tipo == 2) {
      precio = gramos * pla;
    } else if (tipo == 3) {
      precio = gramos * madera;
    } else {
      precio = gramos * flexible;
    }

    if (pp == 1) {
      precio = precio + 3;
    }

    if (ep == 2) {
      precio = precio + 2;
    }

    System.out.print("El coste total de la pieza es: " + precio + " €");
  }
}
