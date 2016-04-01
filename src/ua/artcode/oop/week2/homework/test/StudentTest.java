package ua.artcode.oop.week2.homework.test;

import ua.artcode.oop.week2.homework.src.Student;
import ua.artcode.oop.week2.homework.src.Subject;

/**
 * Created by olsas on 4/1/2016.
 */
public class StudentTest extends Student {
    @Override
    public void study() {
        System.out.println("TestStudent studies!");
    }

    public static void main(String[] args) {
        // test data
        StudentTest studentTest = new StudentTest();
        Subject[] testSchedule = new SubjectTest[3];
        testSchedule[0] = new SubjectTest();
        testSchedule[1] = new SubjectTest();
        testSchedule[2] = new SubjectTest();
        studentTest.setSchedule(testSchedule);

        Subject testAddSubject = new SubjectTest();

        String getScheduleInfoExpected = "Subject - DefaultName, mark - 3 \n" +
                "Subject - DefaultName, mark - 3 \n" +
                "Subject - DefaultName, mark - 3 \n";

        int getAverageMarkExpected = 3;

        run(studentTest.addSubjectTest(testAddSubject));
        run(studentTest.deleteLastSubjectTest());
        run(studentTest.getScheduleInfoTest(getScheduleInfoExpected));
        run(studentTest.getAverageMarkTest(getAverageMarkExpected));

    }

    private boolean addSubjectTest(Subject testSubject) {
        System.out.println("Run addSubjectTest...");
        addSubject(testSubject);
        Subject[] testSchedule = getSchedule();
        return testSchedule[testSchedule.length - 1].getInfo().equals(testSubject.getInfo());
    }

    private boolean deleteLastSubjectTest() {
        System.out.println("Run deleteLastSubjectTest...");
        int startScheduleLength = getSchedule().length;
        deleteLastSubject();
        return startScheduleLength - 1 == getSchedule().length;
    }

    private boolean getScheduleInfoTest(String expectedInfo) {
        System.out.println("Run getScheduleInfoTest...");
        return getScheduleInfo().equals(expectedInfo);
    }

    private boolean getAverageMarkTest(int expectedMark) {
        System.out.println("Run getAverageMarkTest...");
        return getAverageMark() == expectedMark;
    }

    private static void run(boolean result) {
        System.out.printf("test result is -> %b \n", result);
    }
}
