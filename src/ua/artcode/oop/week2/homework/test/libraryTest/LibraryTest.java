package ua.artcode.oop.week2.homework.test.libraryTest;

import ua.artcode.oop.week2.homework.src.library.Library;
import ua.artcode.oop.week2.homework.src.library.Reader;

/**
 * Created by olsas on 4/1/2016.
 */
public class LibraryTest {
    private boolean addReaderTest() {
        Reader testReader = new Reader("test");
        Library testLibrary = new Library();
        testLibrary.addReader(testReader);
        return testLibrary.getReaders()[0] == testReader;
    }
}
