package U1.T4;

import java.util.Scanner;

public class ej4_4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca decimal a redondear: ");
        double primerNumero = teclado.nextDouble();
        System.out.print("Redondeo: ");
        System.out.println(Math.round(primerNumero));

    }
}
