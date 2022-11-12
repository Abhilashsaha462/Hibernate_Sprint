package com.niit.author.model;
import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int BookId;
   @Column(name = "Book_Name")
    private String BookName;

    private int BookPrice;

    public Book() {
    }

    public Book(int bookId, String bookName, int bookPrice) {
        BookId = bookId;
        BookName = bookName;
        BookPrice = bookPrice;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(int bookPrice) {
        BookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookId=" + BookId +
                ", BookName='" + BookName + '\'' +
                ", BookPrice=" + BookPrice +
                '}';
    }
}
