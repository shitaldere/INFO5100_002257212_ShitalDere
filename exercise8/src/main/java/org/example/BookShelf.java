package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "BookShelf")
public class BookShelf {

    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    @XmlElementWrapper(name = "Book")
    @XmlElement(name = "Book")
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                '}';
    }
}
