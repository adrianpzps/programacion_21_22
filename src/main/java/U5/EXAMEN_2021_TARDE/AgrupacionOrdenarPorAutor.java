package U5.EXAMEN_2021_TARDE;

import java.util.Comparator;

public class AgrupacionOrdenarPorAutor implements Comparator {
    @Override
    public int compare(Object objeto1, Object objeto2) {
        Agrupacion agrupacion1 = (Agrupacion) objeto1;
        Agrupacion agrupacion2 = (Agrupacion) objeto2;

        return (agrupacion1.getAutor().compareTo(agrupacion2.getAutor()));
    }
}
