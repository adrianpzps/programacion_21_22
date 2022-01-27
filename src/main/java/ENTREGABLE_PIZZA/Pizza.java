package ENTREGABLE_PIZZA;

public class Pizza {

  // Creamos enum para tamaños de pizza

  public enum SizePizzas {
    Mediana,
    Familiar
  }

  // Creamos variable para enum

  private SizePizzas size;

  // Creamos int para maximo de ingrendientes en el String ingredientes

  private final int MaxIngredientes = 3;

  // Creamos Array de ingredientes;

  private Ingrediente[] ingredientes = new Ingrediente[MaxIngredientes];

  // Creamos un contador de ingredientes

  private int ContadorIngredientes = 0;

  // Creamos constructor para Pizza con tamaño familiar predeterminado

  public Pizza() {
    this.size = SizePizzas.Familiar;
  }

  // Creamos constructor para poder elegir el tamaño de pizza

  public Pizza(SizePizzas size) {
    this.size = size;
  }

  // Creamos un método para mostrar los tamaños disponible de pizza

  public static void mostrarSize() {
    for (SizePizzas item : SizePizzas.values()) {
      System.out.println(item);
    }
  }

  // Creamos un metodo para contar el número de ingredientes

  public int contarIngredientes () {
    return ContadorIngredientes;
  }

  // Creamos un metodo para añadir ingredientes

  public boolean annadirIngrediente (Ingrediente ingrediente) {
    boolean resultado = false;
    if (contarIngredientes() < MaxIngredientes) {
      ingredientes[ContadorIngredientes++] = ingrediente;
      resultado = true;
    }
    return resultado;
  }

}
