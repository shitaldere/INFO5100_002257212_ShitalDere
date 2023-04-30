package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class JSONParser {

    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/java/org/example/books.json");
        JsonNode rootNode = objectMapper.readTree(file);
        JsonNode bookNode = rootNode.path("BookShelf").path("Book");

        //check if bookNode is array and the print it
        if (bookNode.isArray()) {
            ArrayNode bookArray = (ArrayNode) bookNode;

            printJsonTree(bookArray);

            // add new book to bookshelf json path
            ObjectNode newBook = objectMapper.createObjectNode();
            newBook.put("title", "New Book");
            newBook.put("publishedYear", "2022");
            newBook.put("numberOfPages", "300");
            ObjectNode authorsNode = objectMapper.createObjectNode();
            authorsNode.put("author", "Jane Doe");
            newBook.set("authors", authorsNode);
            bookArray.add(newBook);


            System.out.println("\n\n\nAfter Adding new book");

            printJsonTree(bookArray);

        }
    }

    // method to print the complete parse json
    public static void printJsonTree(ArrayNode bookArray) {

        int count = 1;

        for (JsonNode node : bookArray) {

            System.out.println("\nDetails of Book " + count++);
            String title = node.path("title").asText();
            String publishedYear = node.path("publishedYear").asText();
            String numberOfPages = node.path("numberOfPages").asText();
            JsonNode authorsNode = node.path("authors").path("author");

            System.out.print("Book {" +
                    "title='" + title + '\'' +
                    ", publishedYear=" + publishedYear +
                    ", numberOfPages=" + numberOfPages );
            if (authorsNode.isArray()) {
                ArrayNode authorsArray = (ArrayNode) authorsNode;
                for (JsonNode authorNode : authorsArray) {
                    String author = authorNode.asText();
                    System.out.print(  ", authors=" + author + '}');
                }
            } else {
                String author = authorsNode.asText();
                System.out.print( ", authors=" + author + '}');
            }
        }

    }
}
