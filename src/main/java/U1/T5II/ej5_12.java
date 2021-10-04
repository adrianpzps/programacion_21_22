package U1.T5II;

import java.util.Scanner;

public class ej5_12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un numero: ");
    int na = teclado.nextInt();
    System.out.println("Introduzca un numero: ");
    int nb = teclado.nextInt();
    System.out.println("Introduzca un numero: ");
    int nc = teclado.nextInt();

    System.out.println("Los numero ordenados de mayor a menor son: ");

    if (na > nb && na > nc && nb > nc) {
      System.out.println(na + ", " + nb + ", " + nc);
    }
    else if (na > nb && na > nc && nb < nc) {
      System.out.println(na + ", " + nc + ", " + nb);
    }
    else if (nb > na && nb > nc && na > nc) {
      System.out.println(nb + ", " + na + ", " + nc);
    }
    else if (nb > na && nb > nc && na < nc) {
      System.out.println(nb + ", " + nc + ", " + na);
    }
    else if (nc > na && nc > nb && na > nb) {
      System.out.println(nc + ", " + na + ", " + nb);
    }
    else if (nc > na && nc > nb && na < nb) {
      System.out.println(nc + ", " + nb + ", " + na);
    }
  }
}
