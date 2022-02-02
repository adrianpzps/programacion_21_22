package U4.EJ_PIZZERIA;

import java.util.Calendar;

public class main {
  public static void main(String[] args) {

    Pizza.dime_tamaños();

    Pizza Pizza_1 = new Pizza();
    Pizza Pizza_2 = new Pizza(Pizza.enum_tamano.mediana);

    Ingrediente Ing_1 = new Ingrediente();
    Ingrediente Ing_2 = new Ingrediente("Jamon", 200);
    Ingrediente Ing_3 = new Ingrediente("Tomate", 20);
    Ingrediente Ing_4 = new Ingrediente("Atun", 150);

    Pizza_1.anadir_ingrediente(Ing_1);
    Pizza_1.anadir_ingrediente(Ing_2);
    Pizza_1.anadir_ingrediente(Ing_3);
    Pizza_1.anadir_ingrediente(Ing_4);

    Pizza_1.dime_numero_ingredientes();

    Calendar fecha = Calendar.getInstance();

    String dia, mes, annio;

    dia = Integer.toString(fecha.get(Calendar.DATE));
    mes = Integer.toString(fecha.get(Calendar.MONTH));
    annio = Integer.toString(fecha.get(Calendar.YEAR));

    System.out.println (dia + "/" + mes +"/" + annio);

  }



}
