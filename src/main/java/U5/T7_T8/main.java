package U5.T7_T8;

public class main {
  public static void main(String[] args) {

    etiqueta e1 = new etiqueta("Pepe", "C/ Sol", 652323232);
    etiqueta e2 = new etiqueta("Rocio", "C/ Luna", 652525252);

    caja c1 = new caja(15.2, 2, 65.3, caja.Unidades.cm);
    c1.set_etiqueta(e1);
    caja c2 = new caja(15.7, 2.5, 62.3, caja.Unidades.m);
    c2.set_etiqueta(e2);

    System.out.println(c1);

    System.out.println("Volumen: " + c1.getVolumen());

    System.out.println(c2);

    System.out.println("Volumen: " + c2.getVolumen());

    cajaCarton c3 = new cajaCarton(13.1, 2.6, 3.7);
    c3.set_etiqueta(36368);

    System.out.println(c3);

    System.out.println(cajaCarton.getResultado_global());
    System.out.println(cajaCarton.getCantidad_cajas());
    cajaCarton c4 = new cajaCarton(11.1, 1.6, 2.7);
    System.out.println(cajaCarton.getCantidad_cajas());
    System.out.println(cajaCarton.getResultado_global());
    ;
  }
}
