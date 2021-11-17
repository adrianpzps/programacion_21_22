package U3.T2.CADENAS;

import java.util.Scanner;

public class ej_7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("ACIERTA LA CONTRASEÑA!");
    System.out.print("Jugador 1: Introduce su contraseña: ");
    String con1 = teclado.next();
    System.out.println("Contiene " + con1.length() + " letras");
    System.out.println("Empieza por " + con1.charAt(0));
    System.out.println("Finaliza por " + con1.charAt(con1.length() - 1));
    System.out.print("Jugador 2: Introduce su contraseña: ");
    String con2 = teclado.next();
    if (con1.equals(con2)) {
      System.out.println("Acertaste!");
    } else if (con1.length() > con2.length()) {
      System.out.println("Es menor");
    } else if (con1.length() < con2.length()) {
      System.out.println("Es mayor");
    } else {
      System.out.println("Fallaste!");
    }
  }
}
