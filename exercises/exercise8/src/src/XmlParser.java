package src;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class XmlParser {

    public File readFile(String path) {
        try {
            File inputFile = new File(path);
            return inputFile;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Document readXml (File f) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(f);
        return doc;
    }

    public void printXml(Document doc) {
        System.out.println("XML book List");
        System.out.println("------------------------");
        System.out.println("Root Element: " + doc.getDocumentElement().getNodeName());
        NodeList nList = doc.getElementsByTagName("Book");

        for (int i = 0; i < nList.getLength(); i ++) {
            Node nNode = nList.item(i);
            System.out.println("\nCurrent Element: " + nNode.getNodeName() + i);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.println("Title: " + eElement.getElementsByTagName("title").item(0).getTextContent() + "\n"
                                + "Published Year: " + eElement.getElementsByTagName("publishedYear").item(0).getTextContent() + "\n"
                                + "Number of Pages: " + eElement.getElementsByTagName("numberOfPages").item(0).getTextContent());
                System.out.println("Authors: ");
                
                NodeList authorList = eElement.getElementsByTagName("author");
                for (int j = 0; j < authorList.getLength(); j++) {
                    System.out.println(authorList.item(j).getTextContent());
                }
            }
        }
        System.out.println();
    }

    public void addBookToXml(String t, String y, String p, String au) throws ParserConfigurationException, SAXException, IOException, TransformerException {
        File xmFile = readFile("src/bookShelf.xml");
        Document doc = readXml(xmFile);

        Element newBook = doc.createElement("Book");
        
        Element title = doc.createElement("title");
        title.appendChild(doc.createTextNode(t));
        newBook.appendChild(title);

        Element year = doc.createElement("publishedYear");
        year.appendChild(doc.createTextNode(y));
        newBook.appendChild(year);

        Element numberOfPages = doc.createElement("numberOfPages");
        numberOfPages.appendChild(doc.createTextNode(p));
        newBook.appendChild(numberOfPages);

        Element authors = doc.createElement("authors");
        Element author = doc.createElement("author");
        author.appendChild(doc.createTextNode(au));
        authors.appendChild(author);
        newBook.appendChild(authors);

        doc.getDocumentElement().appendChild(newBook);

        TransformerFactory tFactory = TransformerFactory.newInstance();
        Transformer tf = tFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(xmFile);
        tf.transform(source, result);

        System.out.println("New Book Added Successfully! \n");
    }
}
