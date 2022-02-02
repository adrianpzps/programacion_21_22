package U4.E_1920_PIZZERIA;

import java.util.Calendar;

public class Pedido {

    private Pizza pizzaPedido;
    private Calendar fecha;

    public Pedido(Pizza pizzaPedido) {
        this.pizzaPedido = pizzaPedido;
        this.fecha = Calendar.getInstance();
    }

    public Pedido(){
        this.pizzaPedido = new Pizza();
        Ingrediente Queso = new Ingrediente();
        Ingrediente JamonIberico = new Ingrediente("Jamon Iberico", 260);
        this.pizzaPedido.anadir_ingrediente(Queso);
        this.pizzaPedido.anadir_ingrediente(JamonIberico);
        this.fecha = Calendar.getInstance();
    }

    public void dime_fecha() {
        String dia, mes, annio;

        dia = Integer.toString(fecha.get(Calendar.DATE));
        mes = Integer.toString(fecha.get(Calendar.MONTH));
        annio = Integer.toString(fecha.get(Calendar.YEAR));

        System.out.println("Fecha: " + dia + "/" + (Integer.parseInt(mes) + 1) + "/" + annio);
    }

    public Pizza getPizzaPedido() {
        return pizzaPedido;
    }

}
