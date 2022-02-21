package U5.T9;

public class television extends electrodomestico{

    protected int pulgadas;
    protected boolean tieneTDT;

    public television() {
        this.pulgadas = 20;
        this.tieneTDT = false;
    }

    public television(int precioBase, Double peso) {
        super(precioBase, peso);
        this.pulgadas = 20;
        this.tieneTDT = false;
    }

    public television(int precioBase, enumColor color, enumConsumoEnergetico consumo, Double peso, int pulgadas, boolean tieneTDT) {
        super(precioBase, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.tieneTDT = tieneTDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public boolean isTieneTDT() {
        return tieneTDT;
    }

    @Override
    public Double getPrecioFinal() {
        double incrementoprecio = 0;
        if (pulgadas > 40){
            incrementoprecio = (getPrecioFinal() * 0.3);
        }
        if (tieneTDT) {
            incrementoprecio += 50;
        }
        return super.getPrecioFinal() + incrementoprecio;
    }

    @Override
    public String toString() {
        return "television{" +
                "precioBase=" + precioBase +
                ", precioFinal=" + getPrecioFinal() +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", pulgadas=" + pulgadas +
                ", tieneTDT=" + tieneTDT +
                '}';
    }
}
