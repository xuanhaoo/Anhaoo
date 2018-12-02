package company;

import java.util.Scanner;

public class YouzanTest2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        long n = scanner.nextLong();
        max2(m, n);
    }

    private static void max(long m, long n) {

        long min = m > n ? m : n;
        while (min > 0) {
            if (m % min == 0 && n % min == 0) {
                break;
            }
            min--;
        }
        System.out.println(min);
    }
    // 辗转相除
    private static void max2(long m, long n) {
        long x, y;
        if (m < n) {
            x = m;
            m = n;
            n = x;
        }

        while (m % n != 0) {
            y = m % n;
            m = n;
            n = y;
        }
        System.out.println(n);

    }
}
