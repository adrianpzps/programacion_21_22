package U1.T8;

public class ej8_6 {
  public static void main(String[] args) {

    int numero = 7;
    int multiplo = 1;
    int resultado = 0;

    do {
      resultado = numero * multiplo;
      System.out.println(resultado);
      multiplo++;
    } while (resultado < 92);
  }
}
