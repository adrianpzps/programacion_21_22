package U1.FIG;

import java.util.Scanner;

public class RELOJ_ARENA_HUECO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura: ");

        int altura = teclado.nextInt();

        for (int i = 0 ; i < altura ; i++) {
            for (int j = 0 ; j < altura ; j++) {
                if (j == i || j == altura -1 - i || i == 0 || i == altura -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }






















    }
}
