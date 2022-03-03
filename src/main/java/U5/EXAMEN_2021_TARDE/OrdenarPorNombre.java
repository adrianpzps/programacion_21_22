package U5.EXAMEN_2021_TARDE;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator {
    @Override
    public int compare(Object objeto1, Object objeto2) {
        AgrupacionOficial agrupacion1 = (AgrupacionOficial) objeto1;
        AgrupacionOficial agrupacion2 = (AgrupacionOficial) objeto2;

        return (agrupacion2.getNombre().compareTo(agrupacion1.getNombre()));
    }
}
