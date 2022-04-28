package U7LAMBDA;

import java.util.ArrayList;
import java.util.List;

public class ej1 {
  public static void main(String[] args) {

      List<Integer> lista = new ArrayList<>();

      Integer tamano = 100;

    for (int i = 0; i < tamano; i++) {
        Integer aleatorio = (int) (1 + (Math.random() * 999));
        lista.add(aleatorio);
    }
    // lista.stream().forEach(System.out::println);

    lista.stream().filter(n -> esprimo(n)).forEach(System.out::println);

    System.out.println("Suma de números " + lista.stream().mapToInt(Integer::intValue).filter(n -> esprimo(n)).sum());
    System.out.println("Número menor " + lista.stream().mapToInt(Integer::intValue).filter(n -> esprimo(n)).min());
    System.out.println("Número mayor " + lista.stream().mapToInt(Integer::intValue).filter(n -> esprimo(n)).max());
    System.out.println("Media " + lista.stream().mapToDouble(Integer::doubleValue).filter(n -> esprimo((int) n)).average());


  }
  public static boolean esprimo(int num){
      boolean primo = true;
      for (int i = 2; i < num; i++) {
          if (num % i == 0) {
              primo = false;
              break;
          }
      }
      return primo;
  }

}
