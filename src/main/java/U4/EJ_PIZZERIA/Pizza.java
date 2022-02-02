package U4.EJ_PIZZERIA;

public class Pizza {

  public enum enum_tamano {
    familiar,
    mediana
  }
  private enum_tamano tamano;
  private int maximo_ingredientes = 3;
  private int contador_ingredientes = 0;
  private Ingrediente[] ingredientes = new Ingrediente[maximo_ingredientes];

  public Pizza() {
    this.tamano = enum_tamano.familiar;
  }

  public Pizza(enum_tamano tamaño) {
    this.tamano = tamaño;
  }

  public static void dime_tamaños() {
    System.out.println("Los tamaños disponibles son: ");
    for (enum_tamano opcion : enum_tamano.values()) {
      System.out.println(opcion);
    }
  }

  public int numero_ingredientes(){
    return contador_ingredientes;
  }

  public void dime_numero_ingredientes(){
    System.out.println("La pizza tiene " + contador_ingredientes + " ingredientes");
  }

  public boolean anadir_ingrediente(Ingrediente ingrediente) {
    boolean resultado = false;
    if (contador_ingredientes < maximo_ingredientes) {
      ingredientes[contador_ingredientes++] = ingrediente;
      resultado = true;
    }
    return resultado;
  }

}
