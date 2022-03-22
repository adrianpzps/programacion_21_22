package U7.T3B;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ej2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Map<Integer,String> m = new HashMap<>();
        m.put(calculosumadni("12341678D"),"Ana");
        m.put(calculosumadni("56325421L"),"Marta");
        m.put(calculosumadni("78956456K"),"Luis");
        m.put(calculosumadni("53265654J"),"Pedro");

        System.out.println("Introduzca un dni: ");
        String dni = teclado.next();
        Integer cdni = calculosumadni(dni);

        if (m.get(cdni) != null) {
            System.out.println(m.get(cdni));
        } else {
            System.out.println("No existe");
        }

    }


    public static Integer calculosumadni (String dni){
        int sumadni = 0;
        for (int i = 0; i < dni.length() - 1; i++) {
            sumadni += Integer.parseInt(String.valueOf(dni.charAt(i)));
        }
        return sumadni;
    }
}
