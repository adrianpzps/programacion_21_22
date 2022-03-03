package U5.EXAMEN_2021_MAÑANA;

public class Caja {

    private Integer idCaja;
    private static Integer contadorCaja = 0;

    public Caja() {
        setContadorCaja(getContadorCaja() + 1);
        this.idCaja = getContadorCaja();
    }


    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public static Integer getContadorCaja() {
        return contadorCaja;
    }

    public static void setContadorCaja(Integer contadorCaja) {
        Caja.contadorCaja = contadorCaja;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "idCaja=" + idCaja +
                '}';
    }
}

