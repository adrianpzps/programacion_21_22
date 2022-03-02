package U5.U4U5_Entregable;

public class main {
  public static void main(String[] args) {

      Serie s1 = new Serie("serie1",1992,"pepe",1,6);
      Serie s2 = new Serie("serie2",1998,"maria",3,9);

      s1.add_capitulo("cap1");
      s1.add_capitulo("cap2");
      s1.add_capitulo("cap3");
      s1.add_capitulo("cap4");
      s1.add_capitulo("cap5");
      s1.add_capitulo("cap6");

      s2.add_capitulo("cap1");
      s2.add_capitulo("cap2");
      s2.add_capitulo("cap3");
      s2.add_capitulo("cap4");
      s2.add_capitulo("cap5");
      s2.add_capitulo("cap6");
      s2.add_capitulo("cap7");
      s2.add_capitulo("cap8");
      s2.add_capitulo("cap9");

      System.out.println("Construcción:" + s1);

      s1.eliminar_capitulo("cap5");

      System.out.println("Eliminación:"  + s1);

      System.out.println();
      Multimedia.numero_de_elementos();

      System.out.println(s2);

      System.out.println();
      s1.dar_por_finalizado();

      Pelicula p1 = new Pelicula("Peli1",2004,"marcos",150,"laproductora", "españa");

      System.out.println(p1);

      p1.play();
      p1.pause();
      p1.stop();

      System.out.println();

      s1.play();
      s1.pause();
      s1.stop();

      System.out.println();
      Multimedia.numero_de_elementos();

      Libro l1 = new Libro("libro1",1886,"luis","e1",12345,235);
      Libro l2 = new Libro("libro2",1876,"rodrigo","e2",23456,225);

      Catalogo cat1 = new Catalogo(5);
      cat1.add_multimedia(s1);
      cat1.add_multimedia(s2);
      cat1.add_multimedia(p1);
      cat1.add_multimedia(l1);
      cat1.add_multimedia(l2);

      System.out.println();
      System.out.println(cat1);

      // cat1.eliminar_multimedia(s2);

      System.out.println();
      System.out.println(cat1);

      // Arrays.sort(Multimedia);

  }
}
