package learn.leetCode;

import java.util.Scanner;

/**
 * @Author: liangxuanhao
 * @Description: 反转整数
 * @Date: 2020年07月04日 11:08
 */
public class Question7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(reverse2(num));

    }

    public static int reverse(int x) {
        long x1 = 9646324351L;
        int flag = (x1 < 0)?-1:1;
        Long res = Long.valueOf(x1);
        if (res <= Integer.MIN_VALUE || res >= Integer.MAX_VALUE) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(Math.abs(res))).reverse();
        String as = stringBuilder.toString();
        res = Long.valueOf(as) * flag;
        if (res > Integer.MIN_VALUE && res< Integer.MAX_VALUE) {
            return Integer.parseInt(as) * flag;
        }
        return 0;
    }

    public static int reverse2(int x) {
        int flag = x > 0?1:-1;
        if (x <= Integer.MIN_VALUE || x >= Integer.MAX_VALUE) {
            return 0;
        }
        int temp = Math.abs(x);
        int reverse = 0;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return reverse * flag;
    }
}
