package U7.T1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class ej8 {
  public static void main(String[] args) {

    ArrayList<String> c = new ArrayList<>();

    c.add("pepe");
    c.add("lucia");
    c.add("pepe");
    c.add("pepe");
    c.add("maria");

    System.out.println(eliminarepetidos(c));

  }

  public static List eliminarepetidos(List c) {

    LinkedHashSet listasinrep = new LinkedHashSet<>(c);
    c.clear();
    c.add(listasinrep);

    return c;
  }
}
