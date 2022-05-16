package U8.ENTREGABLE_21_22;

import com.google.gson.Gson;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcessPosts {

  private static Document doc;
  private static List<Post> listaposts = new ArrayList<>();

  public void parseDOM(String filename) {

    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      doc = db.parse(new File(filename));

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(Arrays.toString(e.getStackTrace()));
    }
  }

  public void addPost(Post post) {

    Element root = doc.getDocumentElement();

    NodeList nl = doc.getElementsByTagName("post");

    Element newpost = doc.createElement("post");
    root.appendChild(newpost);

    Element title = doc.createElement("title");
    newpost.appendChild(title);
    title.setTextContent(post.getTitle());

    Element link = doc.createElement("link");
    newpost.appendChild(link);
    link.setTextContent(post.getLink());

    Element description = doc.createElement("description");
    newpost.appendChild(description);
    description.setTextContent(post.getDescription());

    Element pubdate = doc.createElement("pubdate");
    newpost.appendChild(pubdate);
    pubdate.setTextContent(post.getPubdate());

    Element guild = doc.createElement("guid");
    newpost.appendChild(guild);
    guild.setTextContent(post.getGuild());
  }

  public void imprimir() {

    Element root = doc.getDocumentElement();
    System.out.println("<" + root.getTagName() + ">");
    NodeList nl = root.getChildNodes();

    for (int i = 0; i < nl.getLength(); i++) {

      if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

        Element e = (Element) nl.item(i);
        System.out.println("   <" + e.getTagName() + ">");
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

      } else if (nl.item(i).getNodeType() == Node.COMMENT_NODE) {

        Comment c = (Comment) nl.item(i);
        System.out.println(c.getTextContent());
      }
    }
  }

  public List<Post> getPosts() {

    String t = "";
    String l = "";
    String d = "";
    String p = "";
    String g = "";

    Element root = doc.getDocumentElement();
    NodeList nl = root.getChildNodes();

    for (int i = 0; i < nl.getLength(); i++) {
      if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
        Element e = (Element) nl.item(i);
        NodeList n2 = e.getChildNodes();

        for (int j = 0; j < n2.getLength(); j++) {
          if (n2.item(j).getNodeType() == Node.ELEMENT_NODE
              && n2.item(j).getNodeName().equalsIgnoreCase("title")) {
            Element e2 = (Element) n2.item(j);
            t = e2.getTextContent();
          } else if (n2.item(j).getNodeType() == Node.ELEMENT_NODE
              && n2.item(j).getNodeName().equalsIgnoreCase("link")) {
            Element e2 = (Element) n2.item(j);
            l = e2.getTextContent();
          } else if (n2.item(j).getNodeType() == Node.ELEMENT_NODE
              && n2.item(j).getNodeName().equalsIgnoreCase("description")) {
            Element e2 = (Element) n2.item(j);
            d = e2.getTextContent();
          } else if (n2.item(j).getNodeType() == Node.ELEMENT_NODE
              && n2.item(j).getNodeName().equalsIgnoreCase("pubdate")) {
            Element e2 = (Element) n2.item(j);
            p = e2.getTextContent();
          } else if (n2.item(j).getNodeType() == Node.ELEMENT_NODE
              && n2.item(j).getNodeName().equalsIgnoreCase("guid")) {
            Element e2 = (Element) n2.item(j);
            g = e2.getTextContent();
          }
        }
        Post px = new Post(t, l, d, p, g);
        listaposts.add(px);
      }
    }
    return listaposts;
  }

  public void convertToJSON() {

    Gson gson = new Gson();
    String json_completo = gson.toJson(listaposts);

    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("posts.json"));
      out.write(json_completo);
      out.close();
    } catch (IOException ex) {
      System.out.println("ERROR: Fallo al escribir el fichero");
    }
  }

  public Integer numPostsStax(String filename) {

    Integer contador = 0;

    try {
      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlReader =
          xmlInputFactory.createXMLEventReader(new FileInputStream(filename));

      while (xmlReader.hasNext()) {
        XMLEvent xmlEvent = xmlReader.nextEvent();
        if (xmlEvent.isStartElement()) {
          StartElement startTag = xmlEvent.asStartElement();
          if (startTag.getName().equals(new QName("post"))) {
            contador++;
          }
        }
      }
    } catch (FileNotFoundException | XMLStreamException e) {
      System.out.println(e.getMessage());
    }
    return contador;
  }
}
