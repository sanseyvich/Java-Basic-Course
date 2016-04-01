package ua.artcode.oop.week2.homework.src;

/**
 * Created by olsas on 3/29/2016.
 */
public abstract class Subject {
    private String name;
    private int mark;
    private double hoursInSemester;
    private double workedHours;

    public Subject() {
        this.name = "DefaultName";
        this.mark = 3;
        this.hoursInSemester = 250;
        this.workedHours = 0;
    }

    public abstract void pathExam();

    public String getInfo() {
        return String.format("Subject - %s, mark - %d \n", name, mark);
    }

    public int getMark() {
        return mark;
    }

    protected void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public double getHoursInSemester() {
        return hoursInSemester;
    }

    protected void setHoursInSemester(double hoursInSemester) {
        this.hoursInSemester = hoursInSemester;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    protected void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }
}
