package U5.EXAMEN_2021_MAÑANA;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {


        Caja c1 = new Caja();
        Caja c2 = new Caja();
        Caja c3 = new Caja();
        Caja c4 = new Caja();

        System.out.println("Existen " + Caja.getContadorCaja() + " cajas");

        Conductor Cond1 = new Conductor("fede","grac","prod",546744655);
        CamionCajas CC1 = new CamionCajas("8473HJF",500, Cond1);
        CamionCajas CC2 = new CamionCajas("8323HJF",400, Cond1);


        CC1.add(c1);
        CC1.add(c2);
        CC1.add(c3);
        CC1.add(c4);

        System.out.println(CC1);

        System.out.println();

        CC1.delete(c1);

        System.out.println(CC1);

        System.out.println("Existen " + Caja.getContadorCaja() + " cajas");




    }
}
