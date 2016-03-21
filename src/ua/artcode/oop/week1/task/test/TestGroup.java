package ua.artcode.oop.week1.task.test;

import ua.artcode.oop.week1.task.model.MyGroup;
import ua.artcode.oop.week1.task.model.Student;
import ua.artcode.oop.week1.task.utils.StudentUtils;

/**
 * TDD
 */
public class TestGroup {


    public static void main(String[] args) {
        MyGroup myGroup = new MyGroup("ACO12");
        Student student = StudentUtils.generateStudent();


        boolean expected = true;
        boolean practical = myGroup.addStudent(student);
        System.out.printf("res %s, method %s, ex %s = practical %s\n",
                expected == practical, "addStudent", expected, practical);


        Student student1 = myGroup.get(0);
        System.out.printf("res %s, method %s, ex %s = practical %s\n",
                student1 == student, "get", student.convertStudent(),
                student1 != null ? student1.convertStudent() : "null");

    }
}
