package U5.EXAMEN_2021_TARDE;

public abstract class AgrupacionOficial extends Agrupacion{

    public Integer getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(Integer puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }

    private Integer puntosObtenidos;

    public AgrupacionOficial(String nombre, String autor, String autorDeMusica, String tipo, String autorDeLetras, Integer puntosObtenidos) {
        super(nombre, autor, autorDeMusica, tipo, autorDeLetras);
        this.puntosObtenidos = puntosObtenidos;
    }

    @Override
    public void cantar_la_presentacion() {

    }

    @Override
    public void hacer_tipo() {

    }

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                "puntosObtenidos=" + puntosObtenidos +
                "} " + super.toString();
    }

    public abstract void caminito_del_falla();
}
