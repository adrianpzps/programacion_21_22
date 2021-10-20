package U1.T8b;

import java.util.Scanner;

public class ej8_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la altura: ");
        int a = teclado.nextInt();

        for (int i = 1 ; i < a ; i++) {
            for (int j = 1 ; j <= a ; j++) {
                if (j == 1 || j == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1 ; i <= a ; i++) {
            if (i == 1 || i == a) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

    }
}




