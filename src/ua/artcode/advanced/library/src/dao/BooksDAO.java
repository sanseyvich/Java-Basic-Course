package ua.artcode.advanced.library.src.dao;

import ua.artcode.advanced.library.src.service.Book;

import java.util.List;

/**
 * Created by olsas on 5/14/2016.
 */
public class BooksDAO {
    private List<Book> books;

    public BooksDAO(List<Book> books) {
        this.books = books;
    }

    public boolean addBook(Book book) {
        return books.add(book);
    }


}
