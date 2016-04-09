package ua.artcode.oop.week2.homework.src.library;

/**
 * Created by olsas on 4/1/2016.
 */
public class Book {
    private String title;
    private String autor;
    private int year;

    public Book(){
        this("DefaultTitle", "DefaultAutor", 1024);
    }

    public Book(String title, String autor, int year) {
        this.title = title;
        this.autor = autor;
        this.year = year;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Book other = (Book) otherObject;
        return title.equals(other.getTitle()) && autor.equals(other.getAutor()) && year == other.getYear();
    }

    public String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    protected void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    protected void setYear(int year) {
        this.year = year;
    }
}
