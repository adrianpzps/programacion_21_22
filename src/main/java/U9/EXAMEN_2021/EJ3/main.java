package U9.EXAMEN_2021.EJ3;

public class main {

  public static void main(String[] args) {

    System.out.println(Consultas.MostrarEmpleados());

    System.out.println("\n- Lista a formato Json \n");

    Consultas.listaJson();

    ConexionBD.close();

  }


}
