package ua.artcode.basic.week1;

/**
 * Created by olsas on 2/27/2016.
 */
public class TypeConversionTest {
    public static void main(String[] args) {
        double a = 43.43;
        float b = (float) a;


        char g1 = '\u1086';
        System.out.println(g1); //windows concole probably doesn't know cyrillic, thats why output is ႆ
    }
}
