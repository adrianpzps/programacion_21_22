package U4.E9.MAQUINARIA;

public class trenes {

  // Trenes: están formados por una locomotora y un máximo de 5 vagones.
  // Cada tren tiene asignado un maquinista que es responsable de él.

  private locomotoras loc;
  private vagones[] vag;
  final int max_vagones = 5;
  int vag_actuales;

  public trenes(locomotoras loc) {
    this.loc = loc;
    this.vag = new vagones[5];
    this.vag_actuales = 0;
  }

  public void annadirvagones(int carga, int capacidad, String tipo_mercancia) {

    vagones v5 = new vagones(carga, capacidad, tipo_mercancia);

    if (vag_actuales < max_vagones) {
      vag[vag_actuales] = v5;
      System.out.println("Se ha añadido " + tipo_mercancia);
      vag_actuales++;
    } else {
      System.out.println("No caben mas vagones");
    }
  }
}
