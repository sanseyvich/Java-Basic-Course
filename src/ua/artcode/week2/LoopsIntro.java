package ua.artcode.week2;

/**
 * Created by olsas on 2/27/2016.
 */
public class LoopsIntro {
    public static void main(String[] args) {
        int column = 0;
        int exit = 10;
        while (column < exit) {
            System.out.println("do something " + column + " time");
            column++;
        }

        int count = 100;
        int endValue = 0;
        int startValue = 100;

        while (count > endValue) {
            System.out.println(count);
            count -= 2;
        }
        count++;
        while (count <= startValue) {
            System.out.println(count);
            count += 2;
        }

        for(int i = 0; i < 10; i++){
            System.out.print(i);
        }

    }
}
