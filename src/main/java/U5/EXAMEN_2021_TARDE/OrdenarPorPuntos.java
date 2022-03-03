package U5.EXAMEN_2021_TARDE;

import java.util.Comparator;

public class OrdenarPorPuntos implements Comparator {

    @Override
    public int compare(Object objeto1, Object objeto2) {
        AgrupacionOficial agrupacion1 = (AgrupacionOficial) objeto1;
        AgrupacionOficial agrupacion2 = (AgrupacionOficial) objeto2;

        if (agrupacion1.getPuntosObtenidos() < agrupacion2.getPuntosObtenidos()) {
            return -1;
        } else if (agrupacion1.getPuntosObtenidos() > agrupacion2.getPuntosObtenidos()) {
            return 1;
        }
        return 0;
    }
}
