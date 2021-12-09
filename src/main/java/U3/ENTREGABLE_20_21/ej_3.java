package U3.ENTREGABLE_20_21;

import java.util.Arrays;
import java.util.Scanner;

public class ej_3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        int n = teclado.nextInt();

        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (100 + Math.random() * 101);

            }
            System.out.println(Arrays.toString(array[i]));
        }

        int[][] array90 = new int[n][n];

        System.out.println();

        for (int i = 0; i < array90.length; i++) {
            int contador = n-1;
            for (int j = 0; j < array90[i].length; j++) {
                array90[i][j] = array[contador][i];
                contador--;
            }

            System.out.println(Arrays.toString(array90[i]));
        }


    }
}
