package ua.artcode.basic.week2;

/**
 * Created by olsas on 2/28/2016.
 */
public class RandomNum {
    public static void main(String[] args) {
        double powUse = Math.pow(2, 5);
        double random = Math.random(); //0....1 random double

        for (int i = 0; i < 10; i++) {
            System.out.println((int) (Math.random()*10));
        }
        System.out.println(random);
    }
}
