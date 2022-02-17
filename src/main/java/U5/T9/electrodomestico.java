package U5.T9;

public abstract class electrodomestico {

  // ATRIBUTOS

  protected int precioBase;

  public enum enumColor {
    Negro,
    Blanco,
    Rojo,
    Azul,
    Gris
  }

  protected enumColor color;

  public enum enumConsumoEnergetico {
    A,
    B,
    C,
    D,
    E,
    F
  }

  protected enumConsumoEnergetico consumo;
  protected Double peso;

  // CONSTRUCTORES

  public electrodomestico(int precioBase, enumColor color, enumConsumoEnergetico consumo, Double peso) {
    this.precioBase = precioBase;
    this.color = color;
    this.consumo = consumo;
    this.peso = peso;
  }

  public electrodomestico() {
    this.precioBase = 100;
    this.color = enumColor.Blanco;
    this.consumo = enumConsumoEnergetico.F;
    this.peso = 5.0;
  }

  public electrodomestico(int precioBase, Double peso) {
    this.precioBase = precioBase;
    this.peso = peso;
    this.consumo = enumConsumoEnergetico.F;
    this.color = enumColor.Blanco;
  }

  public int getPrecioBase() {
    return precioBase;
  }

  public enumColor getColor() {
    return color;
  }

  public enumConsumoEnergetico getConsumo() {
    return consumo;
  }

  public Double getPeso() {
    return peso;
  }

  public void setPrecioBase(int precioBase) {
    this.precioBase = precioBase;
  }

  public Double getPrecioFinal() {
    double precioFinal = 0;

    if (consumo.equals(enumConsumoEnergetico.A)) {
      precioFinal = this.precioBase + 100.0;
    } else if (consumo.equals(enumConsumoEnergetico.B)) {
      precioFinal = this.precioBase + 80.0;
    } else if (consumo.equals(enumConsumoEnergetico.C)) {
      precioFinal = this.precioBase + 60.0;
    } else if (consumo.equals(enumConsumoEnergetico.D)) {
      precioFinal = this.precioBase + 50.0;
    } else if (consumo.equals(enumConsumoEnergetico.E)) {
      precioFinal = this.precioBase + 30.0;
    } else if (consumo.equals(enumConsumoEnergetico.F)) {
      precioFinal = this.precioBase + 10.0;
    }

    if (this.peso >= 0 && this.peso <= 29) {
      precioFinal += 10;
    } else if (this.peso >= 30 && this.peso <= 49) {
      precioFinal += 60;
    } else if (this.peso >= 50 && this.peso <= 79) {
      precioFinal += 80;
    } else if (this.peso >= 80) {
      precioFinal += 100;
    }

    return precioFinal;
  }

  @Override
  public String toString() {
    return "electrodomestico{" +
            "precioBase=" + precioBase +
            ", color=" + color +
            ", consumo=" + consumo +
            ", peso=" + peso +
            ", precioFinal=" + getPrecioFinal() +
            '}';
  }

}
