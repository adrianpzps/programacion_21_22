package U4.E5;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca una longitud: ");
    int longitud = sc.nextInt();

    texto c1 = new texto (longitud);

    System.out.println("Para añadir al principio, introduzca principio, para añadir al final, introduzca final.");
    String posicion = sc.next();

    System.out.println("Introduzca un caracter a añadir: ");
    String add = sc.next();

    c1.annadir(posicion, add);

    System.out.println("Para añadir al principio, introduzca principio, para añadir al final, introduzca final.");
    posicion = sc.next();

    System.out.println("Introduzca una palabra: ");
    add = sc.next();

    c1.annadir2(posicion, add);

    c1.vocales();




  }
}
