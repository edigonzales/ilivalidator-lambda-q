package ch.so.agi.ilivalidator;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
    private String name;
    
    private String isbn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
