package U1.T3;

import java.util.Scanner;

public class ej3_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca dividendo: ");
        double primerNumero = teclado.nextDouble();
        System.out.print("Introduzca divisor: ");
        double segundoNumero = teclado.nextDouble();
        System.out.print("Resultado: ");
        System.out.println(primerNumero / segundoNumero);

    }

}
