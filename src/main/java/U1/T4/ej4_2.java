package U1.T4;

import java.util.Scanner;

public class ej4_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca Nota 1: ");
        double primerNumero = teclado.nextDouble();
        System.out.print("Introduzca Nota 2: ");
        double segundoNumero = teclado.nextDouble();
        System.out.print("Media: ");
        System.out.println((primerNumero+segundoNumero)/2);
    }
}
