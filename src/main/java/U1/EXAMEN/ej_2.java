package U1.EXAMEN;

import java.util.Scanner;

public class ej_2 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca un número ");
    long n = teclado.nextLong();

    long cociente = n;
    long reverso = 0;

    System.out.print("Digitos que aparecen en el número: ");

    while (cociente > 0) {
      reverso = reverso * 10 + cociente % 10;
      cociente = cociente / 10;
    }

    cociente = reverso;
    long cociente2 = cociente;
    reverso = 0;
    int contador = 0;

    // Al final intento varias cosas, como poner un contador... pero que va...

    while (cociente2 > 0)
      while (cociente > 0) {
        System.out.print(cociente % 10 + " ");
        reverso = reverso * 10 + cociente % 10;
        if (contador == cociente % 10) {}

        cociente = cociente / 10;
      }

    cociente2 = cociente2 / 10;
  }
}
