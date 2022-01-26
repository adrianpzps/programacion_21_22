package U4.E8;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    sistema s1 = new sistema();

    // corriente

    System.out.println("Introduzca - Corriente: false (APAGADA), true (ENCENDIDA)");

    boolean cor = sc.nextBoolean();

    if (!cor) {

      s1.setCorriente(false);

    }

    // diferencial

    System.out.println("Introduzca - Diferencial: false (APAGADO), true (ENCENDIDO)");

    boolean dif = sc.nextBoolean();

    if (!dif) {

      s1.setDiferencial(false);

    }

    // bombilla 1

    System.out.println("Introduzca - Bombilla 1: false (APAGADA), true (ENCENDIDA)");

    boolean b1 = sc.nextBoolean();

    if (!b1) {

      s1.setBombilla1(false);

    }

    // bombilla 2

    System.out.println("Introduzca - Bombilla 2: false (APAGADA), true (ENCENDIDA)");

    boolean b2 = sc.nextBoolean();

    if (!b2) {

      s1.setBombilla2(false);

    }

    // bombilla 3

    System.out.println("Introduzca - Bombilla 3: false (APAGADA), true (ENCENDIDA)");

    boolean b3 = sc.nextBoolean();

    if (!b3) {

      s1.setBombilla3(false);

    }

    System.out.println();

    s1.informacion();

    System.out.println("Introduzca - Diferencial: false (APAGADO), true (ENCENDIDO)");

    dif = sc.nextBoolean();

    if (!dif) {

      s1.setDiferencial(false);

    } else {

      s1.setDiferencial(true);

    }

    s1.informacion();

    System.out.println("Introduzca - Diferencial: false (APAGADO), true (ENCENDIDO)");

    dif = sc.nextBoolean();

    if (!dif) {

      s1.setDiferencial(false);

    } else {

      s1.setDiferencial(true);

    }

    s1.informacion();
  }
}
