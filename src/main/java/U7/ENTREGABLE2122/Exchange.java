package U7.ENTREGABLE2122;

import java.io.*;
import java.util.*;

public class Exchange implements Serializable {

    private Map<Divisa, List<ParCotizacion>> mapa;
    private String nombre;

    public Exchange(String nombre) {
        this.nombre = nombre;
        this.mapa = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "mapa=" + mapa +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDivisasOrdenadas(){
        Set<Divisa> orden =
                new TreeSet<>(
                        new Comparator<Divisa>() {
                            @Override
                            public int compare(Divisa d1, Divisa d2) {
                                return d1.getSimbolo().compareTo(d2.getSimbolo());
                            }
                        });
        for (Map.Entry entry : mapa.entrySet()) {
            orden.add((Divisa) entry.getKey());

        }
        System.out.println(orden);
    }
    //public List<Divisa> obtenerCotizaciones(String simbolo) {}
    public void mostrarCotizacionesAlAlzaUnaHora(){

    }

    public void addCotizacion(ParCotizacion cotizacion){
        if (!mapa.containsKey(cotizacion.getDivisa_base())) {
            ArrayList<ParCotizacion> apares = new ArrayList<>();
            apares.add(cotizacion);
            mapa.put(cotizacion.getDivisa_base(), apares);
        } else {
            mapa.get(cotizacion.getDivisa_base()).add(cotizacion);
        }
        System.out.println(mapa);
    }

    public void guardarCotizaciones(){
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("cotizaciones.dat"))) {
            Set<ParCotizacion> cotiz = new HashSet<>();
            Set<Map.Entry<Divisa, List<ParCotizacion>>> entradas = mapa.entrySet();
            Iterator<Map.Entry<Divisa, List<ParCotizacion>>> it = entradas.iterator();
            while (it.hasNext()) {
                Map.Entry<Divisa, List<ParCotizacion>> entrada = it.next();
                cotiz.addAll(entrada.getValue());
            }
            out.writeObject(cotiz);
            System.out.println("Mapa guardado");
            System.out.println(mapa);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void recuperarCotizaciones() {
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream("cotizaciones.dat"))) {
            Set<ParCotizacion> cotiz = (Set<ParCotizacion>) in.readObject();
            mapa.clear();
            System.out.println("Mapa borrado");
            System.out.println(mapa);
            Iterator<ParCotizacion> it = cotiz.iterator();
            while (it.hasNext()) {
                ParCotizacion pc = it.next();
                addCotizacion(pc);
            }
            System.out.println("Mapa cargado");
            System.out.println(mapa);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}


