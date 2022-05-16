package U8.ENTREGABLE_21_22;

import java.util.Scanner;

public class main {

  public static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);

      System.out.println("Introduzca el título: ");
      String titulo = teclado.next();
      System.out.println("Introduzca el link: ");
      String link = teclado.next();
      System.out.println("Introduzca el descripcion: ");
      String desc = teclado.next();
      System.out.println("Introduzca la pubdate: ");
      String pdate = teclado.next();
      System.out.println("Introduzca el guid: ");
      String guid = teclado.next();

      ProcessPosts p = new ProcessPosts();

      p.parseDOM("posts.xml");

      Post post1 = new Post(titulo, link, desc, pdate, guid);

      p.addPost(post1);

      p.imprimir();

      System.out.println();

      System.out.println(p.getPosts());

      System.out.println();

      p.convertToJSON();

      System.out.println("Hay " + p.numPostsStax("posts.xml") + " posts");

  }
}
