package com.niit.author.dao;

import com.niit.author.model.Book;

import java.util.List;

public interface BookDao {
    boolean saveBook(Book book);
    List<Book> getAllBooks();

}
