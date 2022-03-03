package U5.EXAMEN_2021_TARDE;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class main {
  public static void main(String[] args) {

      System.out.println();
      Agrupacion.dime_num_agrupaciones();
      System.out.println();

      Comparsa comp1 = new Comparsa("La comparsa","autor1","musico1","tipo1","escritor1", 20, "emp1");
      Chirigota chi1 = new Chirigota("La chirigota","autor2","musico2","tipo2","escritor2",23,3);
      Cuarteto cuar1 = new Cuarteto("El cuarteto","autor3","musico3","tipo3","escritor3",15, 4);
      Coro coro1 = new Coro("El coro","autor4","musico4","tipo4","escritor4", 12,12,13);
      Romancero rom1 = new Romancero("El Romancero","autor5","musico5","tipo5","escritor5","tematica");

      System.out.println();
      System.out.println("-- CANTAR PRESENTACION Y HACER TIPO");
      System.out.println();

      comp1.cantar_la_presentacion();
      comp1.hacer_tipo();
      System.out.println();
      chi1.cantar_la_presentacion();
      chi1.hacer_tipo();
      System.out.println();
      cuar1.cantar_la_presentacion();
      cuar1.hacer_tipo();
      System.out.println();
      coro1.cantar_la_presentacion();
      coro1.hacer_tipo();
      System.out.println();
      rom1.cantar_la_presentacion();
      rom1.hacer_tipo();
      System.out.println();

      Integrante int1 = new Integrante(1,"int1",20,"Cádiz");
      Integrante int2 = new Integrante(2,"int2",21,"Puerto Real");
      Integrante int3 = new Integrante(3,"int3",22,"San Fernando");
      Integrante int4 = new Integrante(4,"int4",23,"Chiclana");

      System.out.println();
      System.out.println("-- INSERCCIÓN Y ELIMINACION DE INTEGRANTES");
      System.out.println();

      comp1.insertar_integrante(int1);
      comp1.insertar_integrante(int2);
      System.out.println(comp1);
      System.out.println();

      comp1.eliminar_integrante(int1);
      System.out.println(comp1);
      System.out.println();

      cuar1.insertar_integrante(int1);
      cuar1.insertar_integrante(int2);
      System.out.println(cuar1);
      System.out.println();
      cuar1.eliminar_integrante(int2);
      System.out.println(cuar1);

      System.out.println();
      System.out.println("-- CAMINITO DEL FALLA");
      System.out.println();

      System.out.println();
      comp1.caminito_del_falla();
      chi1.caminito_del_falla();
      cuar1.caminito_del_falla();
      coro1.caminito_del_falla();
      System.out.println();

      System.out.println();
      System.out.println("-- AMO A ESCUCHA");
      System.out.println();

      chi1.amo_a_escucha();
      cuar1.amo_a_escucha();
      rom1.amo_a_escucha();

      System.out.println();

      Agrupacion[] agrupacion = {chi1,cuar1,rom1,coro1,comp1};

      System.out.println();
      System.out.println("-- ORDENACIONES AGRUPACIONES");
      System.out.println();

      System.out.println(Arrays.toString(agrupacion));
      Arrays.sort(agrupacion);
      System.out.println(Arrays.toString(agrupacion));
      System.out.println();
      Arrays.sort(agrupacion, new AgrupacionOrdenarPorAutor());
      System.out.println(Arrays.toString(agrupacion));

      COAC concurso2023 = new COAC();

      System.out.println();
      System.out.println("-- INSERCCIÓN Y ELIMINACION DE AGRUPACIONES");
      System.out.println();

      concurso2023.inscribir_agrupacion(comp1);
      concurso2023.inscribir_agrupacion(chi1);
      concurso2023.inscribir_agrupacion(cuar1);
      concurso2023.inscribir_agrupacion(coro1);
      System.out.println();
      System.out.println(concurso2023);
      concurso2023.eliminar_agrupacion(comp1);
      concurso2023.eliminar_agrupacion(chi1);
      System.out.println(concurso2023);
      System.out.println();

      System.out.println();
      System.out.println("-- ORDENACION DE AGRUPACIONES OFICIALES");
      System.out.println();

      concurso2023.ordenar_por_puntos();
      System.out.println(concurso2023);
      System.out.println();
      concurso2023.ordenar_por_nombre();
      System.out.println(concurso2023);
      System.out.println();
      concurso2023.ordenar_por_autor();
      System.out.println(concurso2023);

      System.out.println();
      System.out.println("-- METODO STATIC DE NUMERO DE AGRUPACIONES TOTALES");
      System.out.println();

      System.out.println();
      Agrupacion.dime_num_agrupaciones();

  }
}
