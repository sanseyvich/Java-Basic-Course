package ua.artcode.oop.week4.homework;

/**
 * Created by olsas on 4/11/2016.
 */
public class RecursionCodingBat {
    /**
     * <p> {@link #factorial(int)}
     * <p> {@link #bunnyEars(int)}
     * <p> {@link #fibonacci(int)}
     * <p> {@link #bunnyEars2(int)}
     * <p> {@link #triangle(int)}
     * <p> {@link #sumDigits(int)}
     * <p> {@link #count7(int)}
     * <p> {@link #count8(int)}
     * <p> {@link #powerN(int, int)}
     * <p> {@link #countX(String)}
     */

    public int factorial(int n) {
        if (n > 0 && n < 2) return n;
        return n * factorial(n - 1);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }

    public int fibonacci(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        int n = bunnies % 2 == 0 ? 3 : 2;
        return bunnyEars2(bunnies - 1) + n;
    }

    public int triangle(int rows) {
        if (rows == 0) return 0;
        return triangle(rows - 1) + rows;
    }

    public int sumDigits(int n) {
        if (n < 10) return n;
        return (n % 10) + sumDigits(n / 10);
    }

    public int count7(int n) {
        if (n < 7) return 0;
        int x = (n % 10 == 7) ? 1 : 0;
        return count7(n / 10) + x;
    }

    public int count8(int n) {
        if (n < 8) return 0;
        int x = n % 10 == 8 ? 1 : 0;
        if (n % 100 == 88) x *= 2;
        return count8(n / 10) + x;
    }

    public int powerN(int base, int n) {
        if (n == 0) return 1;
        return powerN(base, n - 1) * base;
    }

    public int countX(String str) {
        int lastIndex = str.length() - 1;
        if (lastIndex < 0) return 0;
        int x = str.charAt(lastIndex) == 'x' ? 1 : 0;
        return countX(str.substring(0, lastIndex)) + x;
    }
}
