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
  protected Double precioFinal;

  // CONSTRUCTORES

  public electrodomestico(
      int precioBase, enumColor color, enumConsumoEnergetico consumo, Double peso) {
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
    this.consumo = enumConsumoEnergetico.A;
    this.color = enumColor.Gris;
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

  public Double getPrecioFinal() {
    if (consumo.equals(enumConsumoEnergetico.A)) {
      this.precioFinal = this.precioBase + 100.0;
    } else if (consumo.equals(enumConsumoEnergetico.B)) {
      this.precioFinal = this.precioBase + 80.0;
    } else if (consumo.equals(enumConsumoEnergetico.C)) {
      this.precioFinal = this.precioBase + 60.0;
    } else if (consumo.equals(enumConsumoEnergetico.D)) {
      this.precioFinal = this.precioBase + 50.0;
    } else if (consumo.equals(enumConsumoEnergetico.E)) {
      this.precioFinal = this.precioBase + 30.0;
    } else if (consumo.equals(enumConsumoEnergetico.F)) {
      this.precioFinal = this.precioBase + 10.0;
    }

    if (peso >= 0 && peso <= 29) {
      this.precioFinal += 10;
    } else if (peso >= 30 && peso <= 49) {
      this.precioFinal += 60;
    } else if (peso >= 50 && peso <= 79) {
      this.precioFinal += 80;
    } else if (peso >= 80) {
      this.precioFinal += 100;
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
            ", precioFinal=" + precioFinal +
            '}';
  }

}
