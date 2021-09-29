package U1.T5;

import java.util.Scanner;

public class ej5_6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el valor tiempo: ");
        double t = teclado.nextDouble();
        final double g = 9.8;

        // El termino final determina una constante que no se puede variar en el codigo

        if (t <= 0) {
            System.out.println("El tiempo es incorrecto");
        }
        else {
            System.out.println((g * t) + " es la velocidad" );
        }

    }

}
