package U4.ENTREGABLE_21_22;

import java.util.Arrays;

public class Vivienda {

    public enum Estancias {
        SALON,
        COCINA,
        BANO,
        DORMITORIO,
        TERRAZA,
        VESTIBULO,
        COMEDOR,
        BALCON
    }

    private Estancias Habitaciones;
    private String direccion;
    private int m2;
    int indiceHabitaciones;
    private String[] listaHabitaciones = new String[indiceHabitaciones];


    public Vivienda(String direccion, int m2) {
        this.direccion = direccion;
        this.m2 = m2;
    }

    public static void estancias_posibles() {
        System.out.println();
        System.out.println("Las estancias posibles son: ");

        for (Vivienda.Estancias objeto: Vivienda.Estancias.values()) {
            System.out.println("-> " + objeto);
        }

    }

    public Estancias getHabitaciones() {
        return Habitaciones;
    }

    public void setHabitaciones(Estancias habitaciones) {
        Habitaciones = habitaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

}
