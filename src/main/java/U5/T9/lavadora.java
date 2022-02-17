package U5.T9;

public class lavadora extends electrodomestico {

    public Integer getCarga() {
        return carga;
    }

    protected Integer carga;

    // Si se crea un constructor vacio, este recoge todos los atributos determinados por defecto
    // de la clase padre

    public lavadora() {
        this.carga = 5;
    }

    public lavadora(int precioBase, Double peso) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public lavadora(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "lavadora{" +
                "precioBase=" + precioBase +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", precioFinal=" + getPrecioFinal() +
                ", carga=" + carga +
                '}';
    }

    @Override
    public Double getPrecioFinal() {
        if (this.carga > 30) {
            return super.getPrecioFinal() + 50;
        }
        return super.getPrecioFinal();
    }
}
