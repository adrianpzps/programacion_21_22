package U1.T5II;

import java.util.Scanner;

public class ej5_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca la hora");

        int hora = teclado.nextInt();

        if (hora >= 6 && hora <= 12 ) {
            System.out.println("buenos dias");
        }
        else if (hora >= 13 && hora <= 20 ) {
            System.out.println("buenas tardes");
        }
        else if (hora >= 21 && hora <= 5) {
            System.out.println("buenas noches");
        }

    }

}
