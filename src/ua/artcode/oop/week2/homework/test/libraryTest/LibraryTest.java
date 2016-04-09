package ua.artcode.oop.week2.homework.test.libraryTest;

import ua.artcode.oop.week2.homework.src.library.Book;
import ua.artcode.oop.week2.homework.src.library.Library;
import ua.artcode.oop.week2.homework.src.library.Reader;

import java.util.ArrayList;

/**
 * Created by olsas on 4/1/2016.
 */
public class LibraryTest {

    public static void main(String[] args) {
        //test data
        Library testLibrary = new Library();
        Reader reader_1 = new Reader("Oleg");
        Reader reader_2 = new Reader("Oles");
        Book book_1 = new Book("Java for boys", "Vasulivna", 1999);
        Book book_2 = new Book("Java for children", "Masok", 1950);
        ArrayList<Reader> readers = new ArrayList<>(2);
        readers.add(reader_1);
        readers.add(reader_2);
        ArrayList<Book> books = new ArrayList<>(2);
        books.add(book_1);
        books.add(book_2);
        testLibrary.setBooks(books);
        testLibrary.setReaders(readers);
        testLibrary.assignBookToReader(reader_1, book_1);
        testLibrary.assignBookToReader(reader_2, book_2);

        Reader viewReadersListTestReader = new Reader("Valera");
        String viewReadersListExpected = "Valera\n";

        Book viewBooksListTestBook = new Book("Java for girls", "Petrovich", 1999);
        String viewBooksListExpected = "Java for girls, Petrovich, 1999\n";

        Library addBookTestLibrary = new Library();
        Book addBookTestBook = new Book();

        Library addReaderTestLibrary = new Library();
        Reader addReaderTestReader = new Reader();

        Reader assignBookToReaderTestReader = new Reader();
        Book assignBookToReaderTestBook = new Book();


        ArrayList<Book> getBooksOnAllReadersExpected = new ArrayList<>(2);
        getBooksOnAllReadersExpected.add(book_1);
        getBooksOnAllReadersExpected.add(book_2);

        ArrayList<Book> getBooksOnReaderExpected = new ArrayList<>(1);
        getBooksOnReaderExpected.add(book_2);

        Library addReaderToBlackListTestLibrary = new Library();
        Reader addReaderToBlackListTestReader = new Reader();

        Library getBooksByAuthorTestLibrary = new Library();
        getBooksByAuthorTestLibrary.addBook(book_1);
        String getBooksByAuthorTestAutor = "Vasulivna";
        ArrayList<Book> getBooksByAuthorExpected = new ArrayList<>(1);
        getBooksByAuthorExpected.add(book_1);

        Library getNewBooksTestLibrary = new Library();
        getNewBooksTestLibrary.addBook(book_1);
        getNewBooksTestLibrary.addBook(book_2);
        int getNewBooksYear = 1999;
        ArrayList<Book> getNewBooksExpected = new ArrayList<>(1);
        getNewBooksExpected.add(book_1);

        LibraryTest libraryTest = new LibraryTest();

        //test execution
        run(libraryTest.viewReadersListTest(viewReadersListTestReader, viewReadersListExpected));
        run(libraryTest.viewBooksListTest(viewBooksListTestBook, viewBooksListExpected));
        run(libraryTest.addBookTest(addBookTestLibrary, addBookTestBook));
        run(libraryTest.addReaderTest(addReaderTestLibrary, addReaderTestReader));
        run(libraryTest.assignBookToReaderTest(assignBookToReaderTestReader, assignBookToReaderTestBook));
        run(libraryTest.getBooksOnAllReadersTest(testLibrary, getBooksOnAllReadersExpected));
        run(libraryTest.getBooksOnReaderTest(testLibrary, reader_2, getBooksOnReaderExpected));
        run(libraryTest.addReaderToBlackListTest(addReaderToBlackListTestLibrary, addReaderToBlackListTestReader));
        run(libraryTest.getBooksByAuthorTest(getBooksByAuthorTestLibrary, getBooksByAuthorTestAutor, getBooksByAuthorExpected));
        run(libraryTest.getNewBooksTest(getNewBooksTestLibrary, getNewBooksYear, getNewBooksExpected));
    }

    private static void run(boolean result) {
        System.out.printf("test result is -> %b \n", result);
    }

    private boolean viewReadersListTest(Reader testReader, String expectedList) {
        System.out.println("viewReadersListTest executing");
        Library testLibrary = new Library();
        testLibrary.addReader(testReader);
        return testLibrary.viewReadersList().equals(expectedList);
    }

    private boolean viewBooksListTest(Book testBook, String expectedList) {
        System.out.println("viewBooksListTest executing");
        Library testLibrary = new Library();
        testLibrary.addBook(testBook);
        return testLibrary.viewBooksList().equals(expectedList);
    }

    private boolean addBookTest(Library testLibrary, Book testBook) {
        System.out.println("addBookTest executing");
        testLibrary.addBook(testBook);
        ArrayList<Book> books = testLibrary.getBooks();
        return testBook.equals(books.get(books.size() - 1));
    }

    private boolean addReaderTest(Library testLibrary, Reader testReader) {
        System.out.println("addReaderTest executing");
        testLibrary.addReader(testReader);
        ArrayList<Reader> readers = testLibrary.getReaders();
        return testReader.equals(readers.get(readers.size() - 1));
    }

    private boolean assignBookToReaderTest(Reader testReader, Book testBook) {
        System.out.println("assignBookToReaderTest executing");
        Library testLibrary = new Library();
        testLibrary.addReader(testReader);
        testLibrary.addBook(testBook);
        if (!(testLibrary.assignBookToReader(testReader, testBook))) return false;
        ArrayList<Book> bookList = testReader.getBookList();
        return testBook.equals(bookList.get(bookList.size() - 1));
    }

    private boolean getBooksOnAllReadersTest(Library testLibrary, ArrayList<Book> expectedBooks) {
        System.out.println("getBooksOnAllReadersTest executing");
        ArrayList<Book> actualList = testLibrary.getBooksOnAllReaders();
        return actualList.containsAll(expectedBooks) && actualList.size() == expectedBooks.size();
    }

    private boolean getBooksOnReaderTest(Library testLibrary, Reader testReader, ArrayList<Book> expectedBookList) {
        System.out.println("getBooksOnReaderTest executing");
        ArrayList<Book> actualList = testLibrary.getBooksOnReader(testReader);
        return actualList.containsAll(expectedBookList) && actualList.size() == expectedBookList.size();
    }

    private boolean addReaderToBlackListTest(Library testLibrary, Reader testReader) {
        System.out.println("addReaderToBlackListTest executing");
        if (!(testLibrary.addReaderToBlackList(testReader))) {
            System.out.println("Unable to add reader!");
            return false;
        }
        ArrayList<Reader> blackList = testLibrary.getBlackList();
        return !(testLibrary.assignBookToReader(testReader, new Book())) && blackList.get(blackList.size() - 1).equals(testReader);
    }

    private boolean getBooksByAuthorTest(Library testLibrary, String autor, ArrayList<Book> expectedBookList) {
        System.out.println("getBooksByAuthorTest executing");
        ArrayList<Book> actualList = testLibrary.getBooksByAuthor(autor);
        return actualList.containsAll(expectedBookList) && actualList.size() == expectedBookList.size();
    }

    private boolean getNewBooksTest(Library testLibrary, int year, ArrayList<Book> expectedBookList) {
        System.out.println("getNewBooksTest executing");
        ArrayList<Book> actualList = testLibrary.getNewBooks(year);
        return actualList.containsAll(expectedBookList) && actualList.size() == expectedBookList.size();
    }
}
