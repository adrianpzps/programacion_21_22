package U1.T5II;

import java.util.Scanner;

public class ej5_12v2 {

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
    } else if (na > nb && na > nc && nb < nc) {
      int aux1 = nb;
      nb = nc;
      nc = aux1;
    } else if (nb > na && nb > nc && na > nc) {
      int aux2 = nb;
      nb = na;
      na = aux2;
    } else if (nb > na && nb > nc && na < nc) {
      int aux3 = nb;
      nb = nc;
      nc = aux3;
      int aux4 = na;
      na = nc;
      nc = aux4;
    } else if (nc > na && nc > nb && na > nb) {
      int aux5 = nc;
      nc = na;
      na = aux5;
      int aux6 = nb;
      nb = nc;
      nc = aux6;
    } else if (nc > na && nc > nb && na < nb) {
      int aux7 = nc;
      nc = na;
      na = aux7;
    }
    System.out.println(na + ", " + nb + ", " + nc);
  }
}
