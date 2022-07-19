import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomParserExample {

    public static void Read() throws ParserConfigurationException,
            SAXException, IOException {

        //Get Document Builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Load the input XML document, parse it and return an instance of the
        // Document class.
        Document document = builder.parse(new File("eurofxref-daily.xml"));

        List<Cube> cubes = new ArrayList<Cube>();

        NodeList nodeList = document.getDocumentElement().getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element elem = (Element) node;

                // Get the value of the ID attribute.
                String time = node.getAttributes().getNamedItem("time").getNodeValue();
                String currency = node.getAttributes().getNamedItem("currency").getNodeValue();
                double rate = Double.parseDouble(node.getAttributes().getNamedItem("rate").getNodeValue());
                cubes.add(new Cube(currency, rate));
            }
        }

        // Print all cubes.
        for (Cube empl: cubes)
            System.out.println(empl.toString());
    }
}