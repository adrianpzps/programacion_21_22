package U7.EXAMEN2122;

import java.io.*;
import java.util.*;

public class Filmaffinity implements Serializable {

  Set<Pelicula> peliculas = new HashSet<>();
  Set<Actor> actores = new HashSet<>();
  Map<Pelicula, Set<Actor>> mapa1 = new HashMap<>();
  Map<Actor, Set<Pelicula>> mapa2 = new HashMap<>();

  public Filmaffinity() {
    this.mapa1 = mapa1;
    this.mapa2 = mapa2;
    this.actores = actores;
    this.peliculas = peliculas;
  }

  public void addPeliculaActor(Pelicula p, Actor a) {

    if (!mapa1.containsValue(p)) {
      Set<Actor> actaux = new HashSet<>();
      actaux.add(a);
      mapa1.put(p, actaux);
    } else {
      mapa1.get(p).add(a);
    }
    System.out.println(mapa1);

    if (!mapa2.containsValue(a)) {
      Set<Pelicula> pelaux = new HashSet<>();
      pelaux.add(p);
      mapa2.put(a, pelaux);
    } else {
      mapa2.get(a).add(p);
    }
    System.out.println(mapa2);
    peliculas.add(p);
    System.out.println(peliculas);
    actores.add(a);
    System.out.println(actores);
  }

  // public List<Actor> getActores(Pelicula p) {

  //     List<Actor> actores = new ArrayList<Actor>();
  //     for (Map.Entry entry : mapa1.entrySet()) {
  //       actores.add((Actor) entry.getValue());

  //     }

  //   return actores;
  // }

 //public List<Pelicula> getPeliculas(Actor a) {

 //  List<Pelicula> peliculas = new ArrayList<Pelicula>();
 //  for (Map.Entry entry : mapa2.entrySet()) {
 //    peliculas.add((Pelicula) entry.getValue());
 //  }

 //  return peliculas;
 //}

  public Pelicula getPelicula(String titulo){
    Pelicula p6 = new Pelicula("Peli6",1995,"Jamaica","Terror", "Bob");
    return p6;
  }

  public void removePelicula(String titulo) {


  }

  public Actor getActor(String nombre, String apellido){
    Actor a8 = new Actor("QueVerguenzaDeExamen","Vega","Española");
    return a8;
  }

  public void guardarDatos() {
    try (ObjectOutputStream salida =
                 new ObjectOutputStream(new FileOutputStream("filmaffinity.dat"))) {
      salida.writeObject(this.mapa1);
      salida.writeObject(this.mapa2);
      salida.writeObject(actores);
      salida.writeObject(peliculas);
    } catch (IOException e) {
      System.out.println("ERROR EN ESCRITURA");
    }

  }

  public void cargarDatos() {
    try (ObjectInputStream entrada =
                 new ObjectInputStream(new FileInputStream("filmaffinity.dat"))) {
      this.mapa1 = (HashMap<Pelicula, Set<Actor>>) entrada.readObject();
      this.mapa2 = (HashMap<Actor, Set<Pelicula>>) entrada.readObject();
      this.actores = (HashSet<Actor>) entrada.readObject();
      this.peliculas = (HashSet<Pelicula>) entrada.readObject();
    } catch (IOException e) {
      System.out.println("ERROR EN LECTURA");
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }

  }

  public Set<Pelicula> getPeliculas() {
    return peliculas;
  }

  public void setPeliculas(Set<Pelicula> peliculas) {
    this.peliculas = peliculas;
  }

  public Set<Actor> getActores() {
    return actores;
  }

  public void setActores(Set<Actor> actores) {
    this.actores = actores;
  }

  public Map<Pelicula, Set<Actor>> getMapa1() {
    return mapa1;
  }

  public void setMapa1(Map<Pelicula, Set<Actor>> mapa1) {
    this.mapa1 = mapa1;
  }

  public Map<Actor, Set<Pelicula>> getMapa2() {
    return mapa2;
  }

  public void setMapa2(Map<Actor, Set<Pelicula>> mapa2) {
    this.mapa2 = mapa2;
  }
}
