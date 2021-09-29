package U1.T5;

import java.util.Scanner;

public class ej5_4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n1 = teclado.nextInt();
        System.out.println("Introduzca otro número ");
        int n2 = teclado.nextInt();

        if (n1 % 2 == 0 && n2 % 2 == 0) {
            System.out.println("Ambos son pares");
        } else if (n1 % 2 == 0 && n2 % 2 != 0) {
            System.out.println("El primer numero es par");
        } else if (n1 % 2 != 0 && n2 % 2 == 0) {
            System.out.println("El segundo numero es par");
        } else if (n1 % 2 != 0 && n2 % 2 != 0) {
            System.out.println("Ningun numero es par");
        }
    }
}
