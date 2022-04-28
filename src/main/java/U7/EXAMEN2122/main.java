package U7.EXAMEN2122;

public class main {
  public static void main(String[] args) {

    Pelicula p1 = new Pelicula("Peli1",1991,"España","Comedia", "Pepe");
    Pelicula p2 = new Pelicula("Peli2",1992,"Portugal","Drama", "Maria");
    Pelicula p3 = new Pelicula("Peli3",1993,"Francia","Accion", "Peter");
    Pelicula p4 = new Pelicula("Peli4",1994,"Estonia","Ciencia Ficcion", "Jan");
    Pelicula p5 = new Pelicula("Peli5",1995,"Jamaica","Terror", "Bob");

    Actor a1 = new Actor("Lucia","Vega","Española");
    Actor a2 = new Actor("Raquel","Santos","Portuguesa");
    Actor a3 = new Actor("Frank","Voumen","Francesa");
    Actor a4 = new Actor("Enzo","Nisa","Italiana");
    Actor a5 = new Actor("Charles","Freeman","Inglesa");

    Filmaffinity fm = new Filmaffinity();

    fm.addPeliculaActor(p1,a1);
    fm.addPeliculaActor(p1,a2);
    fm.addPeliculaActor(p1,a3);
    fm.addPeliculaActor(p2,a1);

    fm.getActores();
    fm.getPeliculas();
    fm.getActor("Charles","Freeman");
    fm.getPelicula("Peli1");
    fm.guardarDatos();
    fm.cargarDatos();
    fm.removePelicula("Peli1");

    System.out.println("Una verguenza...S");
  }
}
