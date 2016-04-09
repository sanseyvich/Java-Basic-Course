package ua.artcode.oop.week2.homework.src.library;

import java.util.ArrayList;

/**
 * Created by olsas on 4/1/2016.
 */
public class Reader {
    private String name;
    private ArrayList<Book> bookList;

    public Reader() {
        this("Default");
    }

    public Reader(String name) {
        this.name = name;
        this.bookList = new ArrayList<>();
    }

    public boolean tookBook(Book book) {
        if (bookList.contains(book)) {
            System.out.println("Already have such book!");
            return false;
        }
        return bookList.add(book);
    }

    @Override
    public final boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Reader other = (Reader) otherObject;
        return name.equals(other.getName());
    }

    public int getBookCount() {
        return bookList.size();
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    protected void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
}
