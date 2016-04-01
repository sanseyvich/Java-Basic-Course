package ua.artcode.oop.week2.homework.test;

import ua.artcode.oop.week2.homework.src.Subject;

/**
 * Created by olsas on 4/1/2016.
 */
public class SubjectTest extends Subject {
    @Override
    public void pathExam() {
        System.out.println("Test subject path exam!");
    }

    public static void main(String[] args) {
        SubjectTest subjectTest = new SubjectTest();
        //test data
        String getInfoExpected = "Subject - DefaultName, mark - 3";

        run(subjectTest.getInfoTest(getInfoExpected));
    }

    private boolean getInfoTest(String expected) {
        System.out.println("Run getInfoTest...");
        return expected.equals(getInfo());
    }

    private static void run(boolean result) {
        System.out.printf("test result is -> %b \n", result);
    }
}
