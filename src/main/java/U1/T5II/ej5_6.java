package U1.T5II;

import java.util.Scanner;

public class ej5_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduzca nota 1: ");
        double nota1 = teclado.nextDouble();
        System.out.print("introduzca nota 2: ");
        double nota2 = teclado.nextDouble();
        System.out.print("introduzca nota 3: ");
        double nota3 = teclado.nextDouble();
        System.out.println("La nota media es: " + ((nota1 + nota2 + nota3) / 3));
    }
}
