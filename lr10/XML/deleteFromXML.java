package lr10.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class deleteFromXML {
    public static void main(String[] args) {
        try {
            File inputFile = new File("G:\\Labs\\labs\\src\\lr10\\XML\\example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Employer");

            Node node = nodeList.item(0);
            Element bookElement = (Element) node;
            bookElement.getElementsByTagName("Employer").item(0);
            Node parentNode = bookElement.getParentNode();
            parentNode.removeChild(bookElement);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File
                    ("G:\\Labs\\labs\\src\\lr10\\XML\\example.xml"));
            transformer.transform(source,result);
            System.out.println("Первый сотрудник удален");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
