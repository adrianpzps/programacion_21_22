package U7.T2;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ej5 {

  public static void main(String[] args) {

    ArrayList<Integer> conjunto1 = new ArrayList<>();
    conjunto1.add(2);
    conjunto1.add(1);
    conjunto1.add(3);
    ArrayList<Integer> conjunto2 = new ArrayList<>();
    conjunto2.add(2);
    conjunto2.add(1);
    conjunto2.add(3);

    System.out.println(fusion(conjunto1,conjunto2));



  }

  public static ArrayList fusion (ArrayList conjunto1, ArrayList conjunto2) {

    // El set creo que sobra

    Set<Integer> con1 = new TreeSet<>(conjunto1);
    Set<Integer> con2 = new TreeSet<>(conjunto2);


    ArrayList<Integer> conjunto3 = new ArrayList<>();

    conjunto3.addAll(con1);
    conjunto3.addAll(con2);

    return conjunto3;
  }

}
