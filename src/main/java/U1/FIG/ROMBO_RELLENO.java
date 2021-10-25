package U1.FIG;

import java.util.Scanner;

public class ROMBO_RELLENO {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca la altura: ");
        int altura = teclado.nextInt();


        for (int i = 0 ; i < altura ; i++ ) {
            for (int j = 0 ; j < altura ; j++) {
                if ((j < (altura/2) - i) || (j > (altura/2) + i) || (j < i - altura/2) || (j > ((altura/2)*3)-i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
