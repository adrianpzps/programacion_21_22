package U1.T8b;

import java.util.Scanner;

public class ej8_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la altura: ");
        int a = teclado.nextInt();

        for (int fila = 1 ; fila <= a ; fila++) {
            for (int colum = 1 ; colum <= a ; colum++) {
                if (fila == colum || colum == a - fila +1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }







    }
}
