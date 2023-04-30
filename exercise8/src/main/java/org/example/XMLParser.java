package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.StringReader;

public class XMLParser {

    public static void main(String[] args) throws JAXBException {

        try {
            File file = new File("src/main/java/org/example/demo.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();


            //get book xml elements
            NodeList bookNodes = doc.getElementsByTagName("Book");

            printXMLTree(bookNodes);

            // create new book element
            Element newBook = doc.createElement("Book");

            // create title element
            Element title = doc.createElement("title");
            title.appendChild(doc.createTextNode("New Book Title"));
            newBook.appendChild(title);

            // create publishedYear element
            Element publishedYear = doc.createElement("publishedYear");
            publishedYear.appendChild(doc.createTextNode("2022"));
            newBook.appendChild(publishedYear);

            // create numberOfPages element
            Element numberOfPages = doc.createElement("numberOfPages");
            numberOfPages.appendChild(doc.createTextNode("400"));
            newBook.appendChild(numberOfPages);

            // create authors element
            Element authors = doc.createElement("authors");

            // create author element
            Element author = doc.createElement("author");
            author.appendChild(doc.createTextNode("New Author"));
            authors.appendChild(author);

            newBook.appendChild(authors);

            Element rootElement = doc.getDocumentElement();

            // add new book to the bookshelf
            rootElement.appendChild(newBook);


            System.out.println("\n\nXML after adding new book\n");
            printXMLTree(bookNodes);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void printXMLTree( NodeList bookNodes) {
        for (int i = 0; i < bookNodes.getLength(); i++) {
            Element bookElement = (Element) bookNodes.item(i);

            String title = bookElement.getElementsByTagName("title").item(0).getTextContent();
            String publishedYear = bookElement.getElementsByTagName("publishedYear").item(0).getTextContent();
            String numberOfPages = bookElement.getElementsByTagName("numberOfPages").item(0).getTextContent();
            NodeList authorNodes = bookElement.getElementsByTagName("author");
            String[] authors = new String[authorNodes.getLength()];
            for (int j = 0; j < authorNodes.getLength(); j++) {
                authors[j] = authorNodes.item(j).getTextContent();
            }

            System.out.println("Book #" + (i+1));
            System.out.println("Title: " + title);
            System.out.println("Published Year: " + publishedYear);
            System.out.println("Number of Pages: " + numberOfPages);
            System.out.print("Authors: ");
            for (int j = 0; j < authors.length; j++) {
                System.out.print(authors[j]);
                if (j < authors.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("\n");
        }
    }
}
