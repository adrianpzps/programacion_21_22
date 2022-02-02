package U4.E_1920_PIZZERIA;

public class Ingrediente {

    private String NombreIngrediente;

    private int Calorias;

    public Ingrediente() {
        this.NombreIngrediente = "Queso";
        this.Calorias = 250;
    }

    public Ingrediente(String NombreIngrediente, int Calorias) {
        this.NombreIngrediente = NombreIngrediente;
        this.Calorias = Calorias;
    }

    public String getNombreIngrediente() {
        return NombreIngrediente;
    }



}
