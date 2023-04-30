package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;


@XmlRootElement(name = "Book")
public class Book {


    private String title;
    private String publishedYear;
    private String numberOfPages;
    private String[] authors;

    public String getTitle() {
        return title;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public String[] getAuthors() {
        return authors;
    }

    @XmlElement(name = "title")
    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement(name = "publishedYear")
    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    @XmlElement(name = "numberOfPages")
    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @XmlElementWrapper(name = "authors")
    @XmlElement(name = "author")
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publishedYear='" + publishedYear + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", authors=" + Arrays.toString(authors) +
                '}';
    }
}
