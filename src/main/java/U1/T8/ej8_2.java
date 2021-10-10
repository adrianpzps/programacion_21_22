package U1.T8;

import java.util.Scanner;

public class ej8_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Edad del alumno: ");
    int edad = teclado.nextInt();
    int alum = 0;
    int sumaedades = 0;
    int mediaedad = 0;
    int alumay = 0;

    while (edad > 0) {
      alum++;
      sumaedades = edad + sumaedades;
      mediaedad = sumaedades / alum;
      if (edad > 18) {
        alumay++;
      }
      System.out.println("Suma de edades: " + sumaedades);
      System.out.println("Media de edades: " + mediaedad);
      System.out.println("Alumnos introducidos: " + alum);
      System.out.println("Alumnos mayores de edad: " + alumay);
      System.out.println("");
      System.out.println("Edad del alumno: ");
      edad = teclado.nextInt();
    }
  }
}
