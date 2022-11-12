package com.niit.author;

import com.niit.author.dao.BookDao;
import com.niit.author.dao.BookDaoImpl;
import com.niit.author.model.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        BookDao bookDao=new BookDaoImpl();
        Book book=new Book();
//        book.setBookId(101);
        book.setBookName("Data Structure");
        book.setBookPrice(217);
        System.out.println(bookDao.saveBook(book));
        bookDao.getAllBooks().forEach(i->System.out.println(i));




    }
}
