package U1.T2;

import java.util.Scanner;

public class ej2_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print( "INTRODUZCA EL NUMERO: ");
        int milla = 1609;
        int numero = teclado.nextInt ();
        System.out.println(numero+ " MILLAS");
        System.out.println("ESTE ES EL RESULTADO DE MILLAS EM METROS: "+milla*numero);
    }
}
