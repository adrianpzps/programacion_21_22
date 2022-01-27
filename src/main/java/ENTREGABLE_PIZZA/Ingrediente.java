package ENTREGABLE_PIZZA;

public class Ingrediente {

    // Creamos variables para String para nombre y int para calorias

    private String nombre;
    private int calorias;

    // Creamos constructor

    public Ingrediente(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }

    // Creamos constructor con Queso predeterminado

    public Ingrediente() {
        this.nombre = "Queso";
        this.calorias = 250;
    }

}
