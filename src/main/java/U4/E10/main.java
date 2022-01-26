package U4.E10;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca una hora: ");
    int uhora = sc.nextInt();

    System.out.println("Introduzca los minutos: ");
    int uminuto = sc.nextInt();

    System.out.println("Introduzca los segundos: ");
    int usegundo = sc.nextInt();

    System.out.println("Introduzca los segundos a sumar a la hora introducida: ");
    int sumsegundo = sc.nextInt();

    Hora h1 = new Hora(uhora, uminuto, usegundo);

    while (!h1.chora) {
      System.out.println("Introduzca una hora: ");
      uhora = sc.nextInt();
      h1.setHora(uhora);
    }

    h1.calculo(sumsegundo);

    System.out.println(h1.getHora() + " HORAS, " + h1.getMinuto() + " MINUTOS, " + h1.getSegundo() + " SEGUNDOS");
  }
}
