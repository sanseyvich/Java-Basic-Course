package ua.artcode.oop.week2.homework.src.library;

import java.util.ArrayList;

/**
 * Created by olsas on 4/1/2016.
 */
public class Library {
    private String libraryName;
    private ArrayList<Reader> readers;
    private ArrayList<Book> books;
    private ArrayList<Reader> blackList;
    private int bookLimit;

    public Library() {
        this.libraryName = "Default";
        this.readers = new ArrayList<>();
        this.books = new ArrayList<>();
        this.blackList = new ArrayList<>();
        this.bookLimit = 3;
    }

    public Library(String libraryName, ArrayList<Reader> readers, ArrayList<Book> books, ArrayList<Reader> blackList, int bookLimit) {
        this.libraryName = libraryName;
        this.readers = readers;
        this.books = books;
        this.blackList = blackList;
        this.bookLimit = bookLimit;
    }

    public String viewReadersList() {
        String list = "";
        for (Reader reader : readers) {
            list += reader.getName() + "\n";
        }
        return list;
    }

    public String viewBooksList() {
        String list = "";
        for (Book book : books) {
            list += String.format("%s, %s, %d\n", book.getTitle(), book.getAutor(), book.getYear());
        }
        return list;
    }

    public void addReader(Reader reader) {
        readers.add(reader);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean assignBookToReader(Reader reader, Book book) {
        if (!(readers.contains(reader)) || !(books.contains(book))) {
            System.out.println("Specified reader or/and book is not belong to the library!!");
            return false;
        }
        if (reader.getBookCount() >= bookLimit || blackList.contains(reader)) {
            System.out.println("Reader is blacklisted or have already reached book limit!!");
            return false;
        }
        return books.remove(book) && readers.get(readers.indexOf(reader)).tookBook(book);
    }

    public ArrayList<Book> getBooksOnAllReaders() {
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).getBookList().size() > 0) {
                books.addAll(readers.get(i).getBookList());
            }
        }
        return books;
    }

    public ArrayList<Book> getBooksOnReader(Reader testReader) {
        if (!(readers.contains(testReader))) {
            System.out.println("Specified reader or/and book is not belong to the library");
            return null;
        }
        return readers.get(readers.indexOf(testReader)).getBookList();
    }

    public boolean addReaderToBlackList(Reader reader) {
        return blackList.add(reader);
    }

    public ArrayList<Book> getBooksByAuthor(String autor) {
        ArrayList<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getAutor().equals(autor)) list.add(book);
        }
        return list;
    }

    public ArrayList<Book> getNewBooks(int year) {
        ArrayList<Book> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) list.add(book);
        }
        return list;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }

    public void setReaders(ArrayList<Reader> readers) {
        this.readers = readers;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public ArrayList<Reader> getBlackList() {
        return blackList;
    }

    public void setBlackList(ArrayList<Reader> blackList) {
        this.blackList = blackList;
    }

    public int getBookLimit() {
        return bookLimit;
    }

    public void setBookLimit(int bookLimit) {
        this.bookLimit = bookLimit;
    }
}
