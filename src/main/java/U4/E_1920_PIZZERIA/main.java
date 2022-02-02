package U4.E_1920_PIZZERIA;

public class main {
    public static void main(String[] args) {

        System.out.println();

        Pizza.dime_tamanos();

        Ingrediente Ing_1 = new Ingrediente();
        Ingrediente Ing_2 = new Ingrediente("Jamon Iberico", 260);
        Ingrediente Ing_3 = new Ingrediente("Tomate", 25);
        Ingrediente Ing_4 = new Ingrediente("Atun", 175);

        Pizza Piz_1 = new Pizza();
        Pizza Piz_2 = new Pizza(Pizza.enumTamano.mediana);

        System.out.println("\n-- Relativo a Pizza 1\n");

        Piz_1.anadir_ingrediente(Ing_1);
        Piz_1.anadir_ingrediente(Ing_2);
        Piz_1.anadir_ingrediente(Ing_3);
        Piz_1.anadir_ingrediente(Ing_4);

        Piz_1.dime_numero_ingredientes();

        Piz_1.dime_informacion_pizza();

        System.out.println("\n-- Relativo a Pizza 2\n");

        Piz_2.anadir_ingrediente(Ing_3);
        Piz_2.anadir_ingrediente(Ing_4);

        Piz_2.dime_numero_ingredientes();

        Piz_2.dime_informacion_pizza();

        Pedido Ped_1 = new Pedido(Piz_1);
        Pedido Ped_2 = new Pedido(Piz_2);

        Pedido Ped_3 = new Pedido();

        System.out.println("\nFecha Pedido 1:");

        Ped_1.dime_fecha();

        System.out.println("\nFecha Pedido 2:");

        Ped_2.dime_fecha();

        System.out.println("");

        Ped_3.getPizzaPedido().dime_informacion_pizza();
        Ped_3.dime_fecha();

        Pizzeria PizzaHut = new Pizzeria();
        Pizzeria Telepizza = new Pizzeria(3);

        PizzaHut.anadir_pedido(Ped_1);
        PizzaHut.anadir_pedido(Ped_2);
        PizzaHut.anadir_pedido(Ped_3);

        Telepizza.anadir_pedido(Ped_1);
        Telepizza.anadir_pedido(Ped_2);
        Telepizza.anadir_pedido(Ped_1);
        Telepizza.anadir_pedido(Ped_3);
        Telepizza.anadir_pedido(Ped_1);

        System.out.println();

        PizzaHut.mostrar_numero_pedidos();

        System.out.println();

        Telepizza.mostrar_numero_pedidos();

        Pizzeria Carusso = new Pizzeria();

        System.out.println();

        Carusso.mostrar_pedidos();

        System.out.println();

        Telepizza.mostrar_pedidos();

    }
}
