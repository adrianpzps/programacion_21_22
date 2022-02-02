package U4.E_1920_PIZZERIA;

import java.util.Arrays;

public class Pizzeria {

    private Pedido[] pizzeriaPedido;

    private int standarPedidos = 5;

    private int indicePedidos;



    public Pizzeria(){
        this.pizzeriaPedido = new Pedido[standarPedidos];
    }

    public Pizzeria(int n){
        this.pizzeriaPedido = new Pedido[n];
    }

    public void anadir_pedido(Pedido p){
        if(indicePedidos >= pizzeriaPedido.length) {
            pizzeriaPedido = Arrays.copyOf(pizzeriaPedido, pizzeriaPedido.length + 1);
        }
        pizzeriaPedido[indicePedidos++] = p;
    }

    public void mostrar_numero_pedidos(){
        System.out.println("La Pizzeria tiene " + indicePedidos + " pedidos");
    }

    public void mostrar_pedidos(){
        if(indicePedidos < 1){
            System.out.println("La Pizzeria no ha recibido ningun pedido.");
        } else {
            for (int i = 0; i < indicePedidos; i++) {
                System.out.println("Pedido número: " + (i + 1));
                pizzeriaPedido[i].dime_fecha();
                pizzeriaPedido[i].getPizzaPedido().dime_informacion_pizza();
                System.out.println();
            }
        }
    }







}
