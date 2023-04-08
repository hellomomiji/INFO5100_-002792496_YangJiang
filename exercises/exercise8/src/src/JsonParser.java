package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonWriter;

public class JsonParser {

  
  public JsonObject readJsonFile(String path) throws FileNotFoundException {
    File inputFile = new File(path);
    FileReader fr = new FileReader(inputFile);
    JsonReader reader = Json.createReader(fr);
    JsonObject root = reader.readObject();
    return root;
  }
  
  public void printJson(JsonObject root) {
    JsonArray books = root.getJsonObject("BookShelf").getJsonArray("Book");

    System.out.println("Json Book List");
    System.out.println("-----------------------");
    for (JsonObject book : books.getValuesAs(JsonObject.class)) {
      System.out.println("Title: " + book.getString("title"));
      System.out.println("Year Published: " + book.getString("publishedYear"));
      System.out.println("Number of Pages: " + book.getString("numberOfPages"));
      System.out.println("Author: " + book.getJsonObject("authors").getString("author"));

      System.out.println();
    }
    System.out.println();
  }

  public void addBookToJson(String t, String y, String p, String au) throws FileNotFoundException {
    JsonObject shelf = readJsonFile("src/bookShelf.json").getJsonObject("BookShelf");

    JsonObject newBook = Json.createObjectBuilder()
                        .add("title", "The Power of Now")
                        .add("publishedYear", "1999")
                        .add("numberOfPages", "236")
                        .add("authors", Json.createObjectBuilder()
                                        .add("author", "Eckhart Tolle").build())
                        .build();

    JsonArrayBuilder bookArrayBuilder = Json.createArrayBuilder(shelf.getJsonArray("Book"));
    bookArrayBuilder.add(newBook);
    JsonArray updatedArray = bookArrayBuilder.build();
    
    JsonObject updatedShelf = Json.createObjectBuilder().add("Book", updatedArray).build();
    JsonObject newRoot = Json.createObjectBuilder().add("BookShelf", updatedShelf).build();

    try {
      JsonWriter writer = Json.createWriter(new FileWriter("src/bookShelf.json"));
      writer.writeObject(newRoot);
      writer.close();
      System.out.println("New Book Successfully added to json File.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }




}
