package lr10.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class createXMLFile {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Employee");
            doc.appendChild(rootElement);

            Element Employer1 = doc.createElement("Employer");
            rootElement.appendChild(Employer1);

            Element surName1 = doc.createElement("surname");
            surName1.appendChild(doc.createTextNode("Petrov"));
            Employer1.appendChild(surName1);

            Element post1 = doc.createElement("post");
            post1.appendChild(doc.createTextNode("Boss"));
            Employer1.appendChild(post1);

            Element salary1 = doc.createElement("salary");
            salary1.appendChild(doc.createTextNode("5000$"));
            Employer1.appendChild(salary1);

            Element Employer2 = doc.createElement("Employer");
            rootElement.appendChild(Employer2);

            Element surName2 = doc.createElement("surname");
            surName2.appendChild(doc.createTextNode("Ivanov"));
            Employer2.appendChild(surName2);

            Element post2 = doc.createElement("post");
            post2.appendChild(doc.createTextNode("Deputy boss"));
            Employer2.appendChild(post2);

            Element salary2 = doc.createElement("salary");
            salary2.appendChild(doc.createTextNode("4500$"));
            Employer2.appendChild(salary2);

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result =
                    new javax.xml.transform.stream.StreamResult(new File("G:\\Labs\\labs\\src\\lr10\\XML\\example.xml"));
            transformer.transform(source, result);

            System.out.println("XML File Created!");
        } catch (Exception pce) {
            pce.printStackTrace();
        }
    }
}
