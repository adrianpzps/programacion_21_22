package U5.EXAMEN_2021_TARDE;

public class Romancero extends Agrupacion implements Callejera {

    private String temaDelCartelon;

    public Romancero(String nombre, String autor, String autorDeMusica, String tipo, String autorDeLetras, String temaDelCartelon) {
        super(nombre, autor, autorDeMusica, tipo, autorDeLetras);
        this.temaDelCartelon = temaDelCartelon;
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "temaDelCartelon='" + temaDelCartelon + '\'' +
                "} " + super.toString();
    }

    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero " + getNombre());
    }

    @Override
    public void hacer_tipo() {
        System.out.println("El Romancero " + getNombre() + " va del tipo " + getTipo());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Romancero " + getNombre());
    }
}
