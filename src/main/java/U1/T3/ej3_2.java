package U1.T3;

import java.util.Scanner;

public class ej3_2 {
         public static void main(String[] args) {

             Scanner teclado = new Scanner(System.in);

             System.out.print( "Introduzca año de nacimiento: " );
             short primerNumero = teclado.nextShort();
             System.out.print( "Introduzca año actual: " );
             short segundoNumero = teclado.nextShort();
             System.out.print( "Edad: " );
             System.out.println( segundoNumero-primerNumero );
         }


    }
