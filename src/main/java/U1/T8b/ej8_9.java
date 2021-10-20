package U1.T8b;

import java.util.Scanner;

public class ej8_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la altura: ");
        int altura = teclado.nextInt();

        for (int i = 0 ; i < altura -1 ; i++) {
            System.out.println("*");
        }
        for (int j = 0 ; j < altura / 2 + 1 ; j++) {
            System.out.print("*");
        }
    }
}
