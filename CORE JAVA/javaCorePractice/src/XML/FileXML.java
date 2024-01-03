package XML;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class FileXML {

    public static void main(String[] args) {

        File file = new File("XMLFile.xml");

        // an instance of factory that gives a document builder
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // an instance of builder to parse the specified xml file
        DocumentBuilder db;
        try {
            db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Student");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) node;
                    System.out.println("Name: " + eElement.getElementsByTagName("Name").item(0).getTextContent());
                    System.out.println("ID: " + eElement.getElementsByTagName("ID").item(0).getTextContent());
                    System.out.println("Dept: " + eElement.getElementsByTagName("Dept").item(0).getTextContent());
                    System.out.println("----------------------");
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            // Handle exceptions appropriately
            e.printStackTrace();
        }
    }
}
