package U1.T5II;

import java.util.Scanner;

public class ej5_1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el dia de la semana");

        int dia = teclado.nextInt();

        switch (dia) {
            case 1:
                System.out.println("programacion");
                break;
            case 2:
                System.out.println("bbdd");
                break;
            case 3:
                System.out.println("lm");
                break;
            case 4:
                System.out.println("fol");
                break;
            case 5:
                System.out.println("si");
                break;
        }





    }
}
