package U3.AHORCADO;

import java.util.Scanner;

public class ej_1 {

    public static void main(String[] args) {
        // Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas (la cadena a
        // adivinar y el resultado parcial) y un carácter a buscar en la cadena a adivinar. Debe
        // devolver el resultado de encontrar ese character en la cadena a adivinar.
        // La función tendrá el siguiente prototipo:
        // public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char
        // letra)
        // En el programa principal, se debe pedir al usuario que introduzca una palabra a adivinar y un
        // carácter a buscar en la cadena. Se pedirá caracteres hasta que se consiga adivinar la palabra
        // completa.
        // NOTA: La palabra a adivinar no contendrá tildes ni caracteres extraños, además será en
        // minúsculas para simplificar el ejercicio.

        // StringBuilder s = new StringBuilder("hola");
        // capacity() Devuelve la capacidad del StringBuilder
        // reverse() Invierte el orden de los caracteres del StringBuilder
        // setCharAt(int indice,char ch)
        // Cambia el carácter indicado en el primer argumento por el carácter que se le pasa en el segundo
        // charAt(int indice)
        // Devuelve el carácter asociado a la posición que se le indica en el argumento
        // toString() Convierte un StringBuilder en un String
        // insert(int indiceIni,String cadena)
        // Añade la cadena del segundo argumento a partir de la posición indicada en el primero
        // delete(int indiceIni,int indiceFin)
        // Borra la cadena de caracteres incluidos entre los dos indices indicados en los argumentos
        // deleteChar(int indice) Borra el carácter indicado en el índice
        //replace(int indiceIni, int indiceFin, String str)
        //Reemplaza los caracteres comprendidos entre los dos indices por la cadena
        //que se le pasa en el argumento


        Scanner sc = new Scanner(System.in);

        String cadena_a_adivinar = "programacion";
        String resultado_parcial = "";
        char letra;

        for (int i = 0; i < cadena_a_adivinar.length(); i++) {
            resultado_parcial += '-';
        }

        do {
            System.out.println(resultado_parcial);
            System.out.println("Introduzca una letra:");
            letra = sc.nextLine().charAt(0);

            resultado_parcial = palabraAhorcado(cadena_a_adivinar, resultado_parcial, letra);
        } while (!cadena_a_adivinar.equalsIgnoreCase(resultado_parcial));

        System.out.println("Felicidades, Has ganado");
    }

    public static String palabraAhorcado(
            String cadena_a_adivinar, String resultado_parcial, char letra) {

        StringBuilder rpSB = new StringBuilder(resultado_parcial);

        for (int i = 0; i < cadena_a_adivinar.length(); i++) {
            if (cadena_a_adivinar.charAt(i) == letra) {
                rpSB.setCharAt(i, letra);
            }
        }
        return rpSB.toString();
    }


}

