package U5.U4U5_Entregable;

import java.util.Arrays;

public class Serie extends Multimedia implements reproducible{

  private String creador;

  public String getCreador() {
    return creador;
  }

  public void setCreador(String creador) {
    this.creador = creador;
  }

  public Integer getNumTemporadas() {
    return numTemporadas;
  }

  public void setNumTemporadas(Integer numTemporadas) {
    this.numTemporadas = numTemporadas;
  }

  public String[] getCapitulo() {
    return capitulo;
  }

  public void setCapitulo(String[] capitulo) {
    this.capitulo = capitulo;
  }

  public int getContadorcapitulos() {
    return contadorcapitulos;
  }

  public void setContadorcapitulos(int contadorcapitulos) {
    this.contadorcapitulos = contadorcapitulos;
  }

  private Integer numTemporadas;
  private String[] capitulo;
  private int contadorcapitulos = 0;


  public Serie(
      String titulo, Integer annoEstreno, String creador, Integer numTemporadas, int numCapitulos) {
    super(titulo, annoEstreno);
    this.creador = creador;
    this.numTemporadas = numTemporadas;
    this.capitulo = new String[numCapitulos];
  }

  public void add_capitulo(String nombreCapitulo) {
    capitulo[contadorcapitulos++] = nombreCapitulo;
  }

  public boolean eliminar_capitulo(String EnombreCapitulo) {

    String[] aux = new String[capitulo.length];

    for (int i = 0; i < capitulo.length; i++) {
      if (EnombreCapitulo != capitulo[i]) {
        aux[i] = capitulo[i];
      } else {
        aux[i] = capitulo[i + 1];
        capitulo = Arrays.copyOf(aux, aux.length - 1);
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "Serie{" +
            "titulo='" + titulo + '\'' +
            ", identificador=" + identificador +
            ", annoEstreno=" + annoEstreno +
            ", creador='" + creador + '\'' +
            ", numTemporadas=" + numTemporadas +
            ", capitulo=" + Arrays.toString(capitulo) +
            '}';
  }

  @Override
  public void dar_por_finalizado() {
    super.dar_por_finalizado();
  }

  public void play(){
    System.out.println("Reproduciendo pelicula " + getTitulo() + " capitulo " + capitulo[(int) (1 + (Math.random() * capitulo.length - 1))]);
  }
  public void pause(){
    System.out.println("Pausando pelicula " + getTitulo() + " capitulo " + capitulo[(int) (1 + (Math.random() * capitulo.length -1))]);
  }
  public void stop(){
    System.out.println("Parando pelicula " + getTitulo() + " capitulo " + capitulo[(int) (1 + (Math.random() * capitulo.length - 1))]);
  }

}
