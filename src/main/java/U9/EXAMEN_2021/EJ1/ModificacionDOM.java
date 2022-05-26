package U9.EXAMEN_2021.EJ1;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ModificacionDOM {

    private static Document doc;

    public static void parsear() {

        try {
            // Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new File("pilotos.xml"));

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public static void anadirPiloto() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca nombre: ");
        String nnombre = teclado.nextLine();

        System.out.print("Introduzca edad: ");
        Integer nedad = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Introduzca escuderia: ");
        String nescuderia = teclado.nextLine();

        System.out.print("Introduzca número de campeonatos: ");
        Integer ncampeonatos = teclado.nextInt();
        teclado.nextLine();

        Element root = doc.getDocumentElement();

        Element nuevopiloto = doc.createElement("piloto");
        root.appendChild(nuevopiloto);

        Element nombre = doc.createElement("nombre");
        nuevopiloto.appendChild(nombre);
        nombre.setTextContent(nnombre);

        Element edad = doc.createElement("edad");
        nuevopiloto.appendChild(edad);
        edad.setTextContent(Integer.toString(nedad));

        Element escuderia = doc.createElement("escuderia");
        nuevopiloto.appendChild(escuderia);
        escuderia.setTextContent(nescuderia);

        Element campeonatos = doc.createElement("campeonatos");
        nuevopiloto.appendChild(campeonatos);
        campeonatos.setTextContent(Integer.toString(ncampeonatos));

    }

    public static void insertarPaisPiloto() {
        Element root = doc.getDocumentElement();

        NodeList nl = root.getChildNodes();

        for (int i = 0; i < nl.getLength(); i++) {

            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

                Element e = (Element) nl.item(i);

                if (e.getTagName().equalsIgnoreCase("piloto")) {

                    Element pais = doc.createElement("pais");
                    pais.setTextContent("España");
                    e.appendChild(pais);
                }

            }
        }
    }

    public static void imprimir() {

        // Cojo el elemento (etiqueta) raíz
        Element root = doc.getDocumentElement();

        // Imprimo el nombre de la etiqueta raíz
        System.out.println("<" + root.getTagName() + ">");

        // Obtengo todos los nodos hijos del elemento raíz
        NodeList nl = root.getChildNodes();

        // Recorremos todos los nodos hijos del elemento raíz
        for (int i = 0; i < nl.getLength(); i++) {

            // Es un hijo que es etiqueta (element)
            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

                Element e = (Element) nl.item(i);

                // Muestro la información del elemento (etiqueta)
                System.out.println("   <" + e.getTagName() + ">");
                // System.out.println(e.getTextContent());

                NodeList n2 = e.getChildNodes();

                for (int j = 0; j < n2.getLength(); j++) {

                    if (n2.item(j).getNodeType() == Node.ELEMENT_NODE) {

                        Element e2 = (Element) n2.item(j);
                        System.out.print("      <" + e2.getTagName() + ">");
                        System.out.print(e2.getTextContent());
                        System.out.println("</" + e2.getTagName() + ">");
                    }
                }

                System.out.println("   </" + e.getTagName() + ">");

            } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE){

                Comment c = (Comment) nl.item(i);

                System.out.println(c.getTextContent());

            }
        }

        // Imprimo el nombre de la etiqueta raíz
        System.out.println("</" + root.getTagName() + ">");
        System.out.println();

    }

}
