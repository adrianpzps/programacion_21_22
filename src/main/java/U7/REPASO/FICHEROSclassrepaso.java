package U7.REPASO;

import java.io.*;
import java.util.Arrays;

public class FICHEROSclassrepaso {

    public static void main(String[] args) {

        // LECTURA DE FICHERO --------------------------------------------------------

        String texto = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader("Main.java"));
            String linea = in.readLine();
            while (linea != null) {
                texto += linea;
                linea = in.readLine();
            }
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(texto);

        // ESCRITURA DE FICHERO --------------------------------------------------------------

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("Machado.txt"));
            String cad = "Mi infancia son recuerdos de un patio de Sevilla";
            for (int i = 0; i < cad.length(); i++) {
                out.write(cad.charAt(i));
            }
            cad = "y un huerto claro donde madura el limonero";
            out.newLine();
            out.write(cad);
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // LECTURA DE FICHEROS BINARIOS --------------------------------------------------------------

        // Para leer ficheros binarios, esta vez vamos a utilizar el ObjectInputStream, que se lo
        // pasaremos al FileInputStream para crear un flujo de entrada.
        // Como siempre, es necesario rodear el código con el try-catch correspondiente.
        // Utilizamos la nueva forma del try-catch para evitar el problema de que el flujo de entrada no
        // se cierre.

        int[] numeros = new int[0];
        try (ObjectInputStream flujo_entrada =
                     new ObjectInputStream(new FileInputStream("datos.dat"))) {
            // Podemos escribir este array de enteros, recorriéndolo...pero se escribiría como una hilera
            // de enteros.
            //      for (int num : enteros) {
            //        flujo_salida.writeInt(num);
            //      }
            // ...pero una forma más sencilla de hacerlo es utilizando el método writeObject.
            numeros = (int[]) flujo_entrada.readObject(); // <- aquí leemos un objeto (o array),
            // que convertimos, porque siempre devuelve un objeto.

        } catch (IOException e) {
            System.out.println("¡Error al leer el fichero!");
        } catch (ClassNotFoundException e) { // <- esto es una excepción que se lanza cuando
            // no se encuentra la clase que se está leyendo.
            System.out.println(e.getMessage());
        }
        System.out.println(Arrays.toString(numeros));

        // Tenemos los siguientes métodos para escribir los diferentes tipos:
        // boolean readBoolean ()  ----- lee un valor boolean en el flujo
        // char readChar()         ----- lee un valor char del valor entero que se pasa
        // int readInt()           ----- lee un entero
        // long readLong()         ----- lee un entero largo
        // double readDouble()     ----- lee un double
        // Object readObject()     ----- lee un objeto Serializable

        // Sin embargo, si queremos leer un array de enteros, podemos hacerlo de la siguiente forma:
        try (ObjectInputStream flujo_entrada =
                     new ObjectInputStream(new FileInputStream("datos.dat"))) {
            // Tendremos que hacer un bucle infinito, ya que no sabemos cuantos números vamos a leer.
            // Cuando se llegue al final,
            // saltará una excepción de fin de fichero (EOFException, End Of File) y podremos seguir
            // normalmente.
            while (true) {
                int num = flujo_entrada.readInt();
                System.out.println(num);
            }
        } catch (EOFException e) {
            System.out.println("¡Fin de fichero!");
        } catch (IOException e) {
            System.out.println("¡Error al leer el fichero!");
        }
        System.out.println(Arrays.toString(numeros));


        // ESCRITURA FICHEROS BINARIOS -------------------------------------------------------------

        // Para escribir ficheros binarios, esta vez vamos a utilizar el ObjectOutputStream, que se lo
        // pasaremos al FileOutputStream para crear un flujo de salida.
        // Como siempre, es necesario rodear el código con el try-catch correspondiente.
        // Sin embargo, esta vez vamos a dar una manera diferente de hacerlo, que nos permite un
        // autocierre de los ficheros y un mejor control de las excepciones.
        // Fíjate bien en cómo se hace el try.

        int[] enteros = new int[10];
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i;
        }
        try (ObjectOutputStream flujo_salida =
                     new ObjectOutputStream(new FileOutputStream("datos.dat"))) {
            // Podemos escribir este array de enteros, recorriéndolo...pero se escribiría como una hilera
            // de enteros.
            //      for (int num : enteros) {
            //        flujo_salida.writeInt(num);
            //      }
            // ...pero una forma más sencilla de hacerlo es utilizando el método writeObject.
            flujo_salida.writeObject(enteros);

        } catch (IOException e) {
            System.out.println("¡Error al escribir el fichero!");
        }

        // Tenemos los siguientes métodos para escribir los diferentes tipos:
        // void writeBoolean (boolean b)    ---- escribe un valor boolean en el flujo
        // void writeChar(int c)            ---- escribe el valor char del valor entero que se pasa
        // void writeInt(int n)             ---- escribe un entero
        // void writeLong(long n)           ---- escribe un entero largo
        // void writeDouble(double d)       ---- escribe un
        // double void writeObject(Objecto) ---- escribe un objeto Serializable

        // Para escribir objetos típicos de Java (Integer, Double, String, etc) no hay problema, no hay
        // que hacer nada especial. Pero... ¿y para escribir un objeto de una clase que hemos
        // confeccionado nosotros?. Para ello tiene que implementar la interfaz Serializable. ¿Cómo?.
        // Simplemente así:

        //    class miClase implements Serializable {
        //         cuerpo de la clase
        //      }

        // No es necesario que se incluya ningún método en la clase.

    }
}
