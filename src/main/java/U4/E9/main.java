package U4.E9;

import U4.E9.MAQUINARIA.locomotoras;
import U4.E9.MAQUINARIA.trenes;
import U4.E9.PERSONAL.jefes_estacion;
import U4.E9.PERSONAL.maquinistas;
import U4.E9.PERSONAL.mecanicos;


public class main {
  public static void main(String[] args) {

    maquinistas m1 = new maquinistas("Adrián Pérez Porras", "Jefe", 54654654, 3142);
    maquinistas m2 = new maquinistas("Pepe Flores", "Base", 23334243, 3232);

    mecanicos mec1 = new mecanicos("Felipe Ruiz", 654645654, mecanicos.tipo_especialidad.Frenos);
    mecanicos mec2 = new mecanicos("Vanesa Martin",665523598, mecanicos.tipo_especialidad.Hidraulica);

    jefes_estacion jef1 = new jefes_estacion("Pedro Ruiz", 75865231);
    jefes_estacion jef2 = new jefes_estacion("Mercedes Porras", 55212354);

    locomotoras loc1 = new locomotoras("5623JKL", "20000cv", 2002, mec2);
    locomotoras loc2 = new locomotoras("8754JKL", "13000cv", 2015, mec1);

    trenes tren1 = new trenes(loc1);

    tren1.annadirvagones(200, 1000, "Carne");
    tren1.annadirvagones(200, 1000, "Patatas");
    tren1.annadirvagones(200, 1000, "Huevos");
    tren1.annadirvagones(200, 1000, "Pasta");
    tren1.annadirvagones(200, 1000, "Tomates");
    tren1.annadirvagones(200, 1000, "Cafe");

  }
}
