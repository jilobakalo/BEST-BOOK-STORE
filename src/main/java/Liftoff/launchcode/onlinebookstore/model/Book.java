package Liftoff.launchcode.onlinebookstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer ID;
    @NotNull
    @Size(min=5,max=500, message="The book name must between five to five hundred.")
    private String bookName;

    private String author;
    private String title ;
    private int price ;
    private String description;
    @ManyToOne
    @NotNull(message="category is required")
    private Category category;

    public Book(String bookName, String author, String title, Category category, int price, String description) {
        this.bookName = bookName;
        this.author = author;
        this.title = title;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getID() {
        return ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + ID +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
