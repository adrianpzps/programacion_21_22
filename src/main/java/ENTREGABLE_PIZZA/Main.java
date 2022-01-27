package ENTREGABLE_PIZZA;

public class Main {
  public static void main(String[] args) {

    // Creamos objetos Pizza

    Pizza p1 = new Pizza();
    Pizza p2 = new Pizza(Pizza.SizePizzas.Mediana);

    // Creamos objetos Ingrediente

    Ingrediente i1 = new Ingrediente("Jamon",250);
    Ingrediente i2 = new Ingrediente("Ternera",265);
    Ingrediente i3 = new Ingrediente("Tomate",25);
    Ingrediente i4 = new Ingrediente("Atun",180);
    Ingrediente i5 = new Ingrediente("Bacon",270);

    // Metodo mostrar tamaños de Pizza

    Pizza.mostrarSize();

    // Metodo añadir ingrediente

    



  }
}
