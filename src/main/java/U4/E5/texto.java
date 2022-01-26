package U4.E5;

public class texto {

    private int longitud;
    private StringBuilder cadena = new StringBuilder("");

    // Constructor

    public texto(int longitud) {
        this.longitud = longitud;
    }

    public void annadircad(String posicion, String add) {

        if (cadena.length() < longitud) {
            System.out.println("Existe espacio.");
            if (posicion.equalsIgnoreCase("principio")) {
                this.cadena.insert(0,add);
            } else if (posicion.equalsIgnoreCase("final")){
                this.cadena.insert(cadena.length(),add);
            }
        } else {
            System.out.println("No existe espacio.");
        }

        System.out.println(cadena);
    }

    public void annadir2car(String posicion, char car) {

        if (this.cadena.length() < longitud) {
            System.out.println("Existe espacio.");
            if (posicion.equalsIgnoreCase("principio")) {
                this.cadena.insert(0,car);
            } else if (posicion.equalsIgnoreCase("final")) {
                this.cadena.insert(cadena.length(),car);
            }
        } else {
            System.out.println("No existe espacio.");
        }

        System.out.println(cadena);
    }

    public void annadir2cad(String posicion, String add) {

        if (cadena.length() + add.length() <= longitud) {
            System.out.println("Existe espacio.");
            if (posicion.equalsIgnoreCase("principio")) {
                this.cadena.insert(0,add);
            } else if (posicion.equalsIgnoreCase("final")) {
                this.cadena.insert(cadena.length(),add);
            }
        } else {
            System.out.println("No existe espacio.");
        }

        System.out.println(cadena);
    }

    public int vocales() {
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";

        int contador = 0;

        for (int i = 0; i < this.cadena.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (this.cadena.charAt(i) == vocales.charAt(j)) {
                    contador++;
                }
            }
        }
        System.out.println(contador + "vocales");
        return contador;
    }
}
