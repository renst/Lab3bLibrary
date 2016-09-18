package Library;

import java.util.ArrayList;

/**
 * Created by Martin on 2016-09-18.
 */
public class Book {

    private String isbn;
    private String title;
    private int edition;
    private double price;
    private ArrayList<Author> authors;

    public Book(String title){
        this.title = title;
        authors = new ArrayList<>();
    }

    public void addAuthor(String name){
        authors.add(new Author(name));
    }

    public ArrayList<Author> getAuthors(){
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return isbn;
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Edition: %d, Authors: %s, ISBN: %s",
                title,
                edition,
                authors,
                isbn);
    }
}
