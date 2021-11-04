package U1.EXAMEN;

import java.util.Scanner;

public class ej_3 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduzca un número: ");
    int n = teclado.nextInt();

    int cociente = n;
    int reverso = 0;
    int csuma = 0;

    while (cociente > 0) {
      reverso = reverso * 10 + cociente % 10;
      cociente = cociente / 10;
    }

    cociente = reverso;
    reverso = 0;

    while (cociente > 0) {
      reverso = reverso * 10 + cociente % 10;
      int ale = (int) (1000 + (Math.random() * 9999));
      System.out.println("La clave generada para " + cociente % 10 + " es: " + ale);
      System.out.print("La suma de las cifras totales es: ");

      int varale = 0;

      while (ale > 0) {
        varale = varale + ale % 10;
        ale = ale / 10;
      }
      System.out.print(varale + cociente % 10);
      csuma = csuma + varale + cociente % 10;
      System.out.println();

      cociente = cociente / 10;
    }
    System.out.println("El número resultante es: " + csuma);
  }
}
