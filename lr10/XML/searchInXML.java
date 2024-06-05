package lr10.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class searchInXML {
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

            System.out.print("Введите фамилию для поиска в файле: ");
            String surName = in.nextLine();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;

                if (surName.equals(element.getElementsByTagName("surname").item(0).getTextContent())) {
                System.out.print("Фамилия: " + element.getElementsByTagName("surname").item(0).getTextContent() + "\t");
                System.out.print("Должность: " + element.getElementsByTagName("post").item(0).getTextContent() + "\t");
                System.out.print("Зарплата: " + element.getElementsByTagName("salary").item(0).getTextContent() + "\t");
                    System.out.println("\n");
                }
            }
        }

    }catch (Exception e){
        e.printStackTrace();
    }
    }
}
