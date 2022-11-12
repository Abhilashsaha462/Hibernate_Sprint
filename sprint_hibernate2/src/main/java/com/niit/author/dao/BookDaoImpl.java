package com.niit.author.dao;

import com.niit.author.model.Book;
import com.niit.author.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookDaoImpl implements BookDao{
    @Override
    public boolean saveBook(Book book) {
        try{
            Session session= HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(book);
            transaction.commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return true;

    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books=null;
        try{
            Session session=HibernateUtil.getSessionFactory().openSession();
            books=session.createQuery("from Book").list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
}
