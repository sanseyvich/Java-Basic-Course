package ua.artcode.basic.week3;

/**
 * Created by olsas on 3/5/2016.
 */
public class _02StringFormat {

    public static void main(String[] args) {
        String name = "Oleg";
        int age = 30;
        double salary = 100.500;
        boolean isStrong = true;

        String message = "name = " + name + " age " + age + " salary " + salary + " strong " + isStrong;

        //%s - String
        //%d - byte, short, int, long
        //%.f - float, double
        String formatted = String.format("name = %s age %d salary %.2f strong %s", name, age, salary, isStrong);

        System.out.println(message);
        System.out.println(formatted);
    }
}
