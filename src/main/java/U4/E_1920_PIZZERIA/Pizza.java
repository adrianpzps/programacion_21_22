package U4.E_1920_PIZZERIA;

public class Pizza {

    // Enum

    public enum enumTamano {
        familiar,
        mediana
    }

    // Atributos

    private enumTamano Tamano;

    private int MaxIng = 3;

    private Ingrediente[] Ingrediente;

    private int NumIng = 0;

    // Constructores

    public Pizza() {
        this.Tamano = enumTamano.familiar;
        this.Ingrediente = new Ingrediente[MaxIng];
    }

    public Pizza(enumTamano Tamano) {
        this.Tamano = Tamano;
        this.Ingrediente = new Ingrediente[MaxIng];
    }

    // Métodos

    public static void dime_tamanos() {

        System.out.println("Los tamaños disponibles son: ");

        for (enumTamano objeto: enumTamano.values()) {
            System.out.println("-> " + objeto);
        }

    }

    public void dime_numero_ingredientes() {
        System.out.println("La pizza tiene " + NumIng + " ingredientes.");
    }

    public boolean anadir_ingrediente (Ingrediente Ingrediente) {
        if (NumIng < MaxIng) {
            this.Ingrediente[NumIng++] = Ingrediente;
            return true;
        } else {
            System.out.println("No se ha podido añadir " + Ingrediente.getNombreIngrediente() +
                    ". La pizza ya ha alcanzado el número máximo de ingredientes.");
            return false;
        }
    }

    public void dime_informacion_pizza() {

        System.out.println("El tamaño de la pizza es: " + this.Tamano);
        System.out.println("Los ingredientes de la pizza son: ");

        for (int i = 0; i < NumIng; i++) {
            System.out.println("-> " + Ingrediente[i].getNombreIngrediente());
        }
    }








}
