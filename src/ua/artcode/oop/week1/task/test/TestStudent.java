package ua.artcode.oop.week1.task.test;

import ua.artcode.oop.week1.task.model.Adress;
import ua.artcode.oop.week1.task.model.MyDate;
import ua.artcode.oop.week1.task.model.Student;
import ua.artcode.oop.week1.task.utils.StudentUtils;

/**
 * Created by olsas on 3/19/2016.
 */
public class TestStudent {
    // psvm
    public static void main(String[] args) {


        // create instance(initialize all fields),
        // allocate memory for student

        MyDate myDate = new MyDate(1990,19,2);
        Student student1 = new Student("Oleg", "phone", "@gmail.com",
                myDate,
                new Adress("Kiev", "Starokievs", "10"),0,0);

        Adress address = student1.getAddress();

        // Shift F6 - rename all
        Student[] studentArr = new Student[10];

        for (int i = 0; i < studentArr.length; i++) {
            studentArr[i] = StudentUtils.generateStudent();
        }

        for (int i = 0; i < studentArr.length; i++) {
            Student st1 = studentArr[i];
            System.out.println(st1.convertStudent());
        }



    }


}
