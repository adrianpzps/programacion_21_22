package U1.T5;

import java.util.Scanner;

public class ej5_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n = teclado.nextInt();
        if (n % 2 == 0)
        System.out.println("Es par");
        else
        System.out.println("Es impar");

    }
}
