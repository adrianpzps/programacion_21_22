package U1.T5II;

import java.util.Scanner;

public class ej5_11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Conteste a las siguientes afirmaciones determinando 0 para falso y 1 para verdadero. Cada respuesta correcta equivale a 1 punto. ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        int resultadototal = 0;

        System.out.println("Pregunta 1");
        int respuesta = teclado.nextInt();
        if (respuesta == 1) {
            resultadototal++;
        }
        System.out.println("Pregunta 2");
        int respuesta2 = teclado.nextInt();
        if (respuesta2 == 0) {
            resultadototal++;
        }
        System.out.println("Pregunta 3");
        int respuesta3 = teclado.nextInt();
        if (respuesta3 == 1) {
            resultadototal++;
        }
        System.out.println("Pregunta 4");
        int respuesta4 = teclado.nextInt();
        if (respuesta4 == 0) {
            resultadototal++;
        }
        System.out.println("Pregunta 5");
        int respuesta5 = teclado.nextInt();
        if (respuesta5 == 0) {
            resultadototal++;
        }
        System.out.println("Pregunta 6");
        int respuesta6 = teclado.nextInt();
        if (respuesta6 == 1) {
            resultadototal++;
        }
        System.out.println("Pregunta 7");
        int respuesta7 = teclado.nextInt();
        if (respuesta7 == 1) {
            resultadototal++;
        }
        System.out.println("Pregunta 8");
        int respuesta8 = teclado.nextInt();
        if (respuesta8 == 1) {
            resultadototal++;
        }
        System.out.println("Pregunta 9");
        int respuesta9 = teclado.nextInt();
        if (respuesta9 == 1) {
            resultadototal++;
        }
        System.out.println("Pregunta 10");
        int respuesta10 = teclado.nextInt();
        if (respuesta10 == 0) {
            resultadototal++;
        }
        System.out.println("Ha obtenido " + resultadototal + " puntos");
    }

}
