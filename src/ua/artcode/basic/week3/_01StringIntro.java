package ua.artcode.basic.week3;

/**
 * Created by olsas on 3/5/2016.
 */
public class _01StringIntro {
    public static void main(String[] args) {
        // create

        String s1 = new String("new");
        String s2 = "tst";
        String s3 = 45 + "";

        String s4 = String.valueOf(true);

        int [] a1 = {52,53,54};
        String s5 = new String(a1, 0, 1);

        //System.out.println(s4);
        System.out.println(s5);
    }
}
