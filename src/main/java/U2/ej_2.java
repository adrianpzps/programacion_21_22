package U2;

import java.util.Scanner;

public class ej_2 {

  public static void main(String[] args) {
    int i, num;
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce un número");
    num = sc.nextInt();

    System.out.println("Mostrando los 10 número posteriores " + num);
    i = num;

    while (i < num + 10) {
      System.out.println("Número posterior " + (i + 1));
      i++;
    }
  }
}
