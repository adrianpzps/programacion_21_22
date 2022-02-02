package U4.ENTREGABLE_21_22;

public class ManoDeObra {

  private String nombreEmpresa;
  private String descripcionTrabajo;
  int horasRealizadas;
  int cantidadObreros;

  public ManoDeObra(
      String nombreEmpresa, String descripcionTrabajo, int horasRealizadas, int cantidadObreros) {
    this.nombreEmpresa = nombreEmpresa;
    this.descripcionTrabajo = descripcionTrabajo;
    this.horasRealizadas = horasRealizadas;
    this.cantidadObreros = cantidadObreros;
  }

  public void mostrar_informacion() {

    System.out.println();
    System.out.println("Nombre de Empresa: " + this.nombreEmpresa);
    System.out.println("Descripción del trabajo: " + this.descripcionTrabajo);
    System.out.println("Horas de trabajo realizadas: " + this.horasRealizadas);
    System.out.println("Cantidad de obreros: " + this.cantidadObreros);
  }

  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }

  public String getDescripcionTrabajo() {
    return descripcionTrabajo;
  }

  public void setDescripcionTrabajo(String descripcionTrabajo) {
    this.descripcionTrabajo = descripcionTrabajo;
  }

  public int getHorasRealizadas() {
    return horasRealizadas;
  }

  public void setHorasRealizadas(int horasRealizadas) {
    this.horasRealizadas = horasRealizadas;
  }

  public int getCantidadObreros() {
    return cantidadObreros;
  }

  public void setCantidadObreros(int cantidadObreros) {
    this.cantidadObreros = cantidadObreros;
  }
}
