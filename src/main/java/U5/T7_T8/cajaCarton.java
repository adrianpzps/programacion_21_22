package U5.T7_T8;

public class cajaCarton extends caja {
  private int etiq;
  static Double resultado_global = 0.0;

  public static Integer getCantidad_cajas() {
    return cantidad_cajas;
  }

  static Integer cantidad_cajas = 0;

  public cajaCarton(double ancho, double alto, double fondo) {
    super(ancho, alto, fondo, Unidades.cm);
    setResultado_global(getResultado_global() + this.calcular_superficie());
    cantidad_cajas++;
  }

  public void set_etiqueta(int etiq) {
    this.etiq = etiq;
  }

  @Override
  public double getVolumen() {
    return super.getVolumen() * 0.8;
  }

  public Double calcular_superficie() {
    Double resultado = 0.0;
    resultado = 2 * (ancho * alto + alto * fondo + ancho * fondo);
    return resultado;
  }

  public static Double getResultado_global() {
    return resultado_global;
  }

  public static void setResultado_global(Double resultado_global) {
    cajaCarton.resultado_global = resultado_global;
  }

  @Override
  public String toString() {
    return "cajaCarton{" +
            "ancho=" + ancho +
            ", alto=" + alto +
            ", fondo=" + fondo +
            ", etiq=" + etiq +
            '}';
  }
}
