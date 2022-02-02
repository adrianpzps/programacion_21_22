package U4.EJ_PIZZERIA;

public class Ingrediente {

    private String nombre_ingrediente;

    private int calorias;

    public Ingrediente (String nombre_ingrediente, int calorias) {
        this.nombre_ingrediente = nombre_ingrediente;
        this.calorias = calorias;
    }

    public Ingrediente () {
        this.nombre_ingrediente = "Queso";
        this.calorias = 250;
    }



}
