package src;

import java.io.File;

import javax.json.JsonObject;

import org.w3c.dom.Document;

public class Main {
  public static void main(String[] args) {

    // XML

    try {
      XmlParser xmlParser = new XmlParser();
      
      // read xml
      File xmlFile = xmlParser.readFile("src/bookShelf.xml");
      Document doc = xmlParser.readXml(xmlFile);
      
      // print xml elements 
      xmlParser.printXml(doc);

      // add new book
      xmlParser.addBookToXml("The Power of Now", "1999", "236", "Eckhart Tolle");

      // print updated xml elements
      Document updatedDoc = xmlParser.readXml(xmlFile);

      System.out.println("Updated Book List");
      xmlParser.printXml(updatedDoc);

      System.out.println();

      // JSON
  
      JsonParser jsonParser = new JsonParser();

      // read json file
      JsonObject books = jsonParser.readJsonFile("src/bookShelf.json");

      // print json data
      jsonParser.printJson(books);

      // add new book
      jsonParser.addBookToJson("The Power of Now", "1999", "236", "Eckhart Tolle");

      // print updated json data
      JsonObject updatedbooks = jsonParser.readJsonFile("src/bookShelf.json");
      System.out.println("Updated Json book list");
      jsonParser.printJson(updatedbooks);

      System.out.println();


      } catch (Exception e) {
      e.printStackTrace();
    }
    


    
  }
}
