package U1.T5II;

import java.util.Scanner;

public class ej5_5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el valor de a: ");
        double a = teclado.nextDouble();
        System.out.print("Introduzca el valor de b: ");
        double b = teclado.nextDouble();
        if (a == 0) {
            System.out.println("La ecuacion no tiene solucion real");
        } else {
            System.out.println("x: " + ((-b) / a));
        }
    }
}
