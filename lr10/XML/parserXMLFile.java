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
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class parserXMLFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            File inputFile = new File("G:\\Labs\\labs\\src\\lr10\\XML\\example.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент: " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Employer");
            for (int i = 0; i < nodeList.getLength(); i++){
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Фамилия рабочего: "
                    + element.getElementsByTagName("surname").item(0)
                            .getTextContent());
                    System.out.println("Должность рабочего: "
                            + element.getElementsByTagName("post").item(0)
                            .getTextContent());
                    System.out.println("Зарплата рабочего: "
                            + element.getElementsByTagName("salary").item(0)
                            .getTextContent());
                }
            }
            //Дополнение xml файла
            System.out.print("\nВведите новую фамилию: ");
            String surNameInput = in.nextLine();
            System.out.print("Введите новую должность: ");
            String postInput = in.nextLine();
            System.out.print("Введите новую зарплату: ");
            String salaryInput = in.nextLine();
            Node rootElement = doc.getDocumentElement();

            Element newElementInput = doc.createElement("Employee");

            Element surNameNew = doc.createElement("surname");
            surNameNew.appendChild(doc.createTextNode(surNameInput));
            newElementInput.appendChild(surNameNew);

            Element postNew = doc.createElement("post");
            postNew.appendChild(doc.createTextNode(postInput));
            newElementInput.appendChild(postNew);

            Element salaryNew = doc.createElement("salary");
            salaryNew.appendChild(doc.createTextNode(salaryInput));
            newElementInput.appendChild(salaryNew);

            rootElement.appendChild(newElementInput);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File
                    ("G:\\Labs\\labs\\src\\lr10\\XML\\example.xml"));
            transformer.transform(source,result);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
