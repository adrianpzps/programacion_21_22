package U1.T5II;

import java.util.Scanner;

public class ej5_15 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int resultadototal = 0;

    System.out.println(
        "1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    int respuesta = teclado.nextInt();
    if (respuesta == 1) {
      resultadototal += 3;
    }
    System.out.println("2. Ha aumentado sus gastos de vestuario");
    int respuesta2 = teclado.nextInt();
    if (respuesta2 == 1) {
      resultadototal += 3;
    }
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti");
    int respuesta3 = teclado.nextInt();
    if (respuesta3 == 1) {
      resultadototal += 3;
    }
    System.out.println(
        "4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
    int respuesta4 = teclado.nextInt();
    if (respuesta4 == 1) {
      resultadototal += 3;
    }
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil");
    int respuesta5 = teclado.nextInt();
    if (respuesta5 == 1) {
      resultadototal += 3;
    }
    System.out.println(
        "6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    int respuesta6 = teclado.nextInt();
    if (respuesta6 == 1) {
      resultadototal += 3;
    }
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    int respuesta7 = teclado.nextInt();
    if (respuesta7 == 1) {
      resultadototal += 3;
    }
    System.out.println(
        "8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    int respuesta8 = teclado.nextInt();
    if (respuesta8 == 1) {
      resultadototal += 3;
    }
    System.out.println("9. Has notado que últimamente se perfuma más");
    int respuesta9 = teclado.nextInt();
    if (respuesta9 == 1) {
      resultadototal += 3;
    }
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    int respuesta10 = teclado.nextInt();
    if (respuesta10 == 1) {
      resultadototal += 3;
    }
    if (resultadototal <= 10) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if (resultadototal <= 20) {
      System.out.println(
          "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if (resultadototal <= 30) {
      System.out.println(
          "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
  }
}
