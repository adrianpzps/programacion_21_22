package U4.ENTREGABLE_21_22;

public class main {
  public static void main(String[] args) {

    Material Mod_iva = new Material(0.12);
    System.out.println("El iva se ha modificado al: " + Mod_iva.getIva() * 100 + "%");

    Material Mat_1 = new Material("Ladrillo", "Proveedor 1", 23, 1);
    Material Mat_2 = new Material("Madera", "Proveedor 2", 54, 3);
    Material Mat_3 = new Material("Cemento", "Proveedor 3", 32, 8);

    Material Mat_4 = new Material("Losa", 31, 43);
    Material Mat_5 = new Material("Arena", 43, 5);
    Material Mat_6 = new Material("Grava", 65, 7);

    ManoDeObra Mdo_1 = new ManoDeObra("ArreglosTotal", "Arreglamos de todo", 350, 6);

    Mat_1.mostrar_informacion();

    Mdo_1.mostrar_informacion();

    Vivienda.estancias_posibles();

    System.out.println("Da verguenza, intentaré ponerme al día");
  }
}
