package learn.leetCode;

import java.util.Scanner;

/**
 * @Author: liangxuanhao
 * @Description: 回文数
 * @Date: 2020年07月04日 13:43
 */
public class Question9 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reverse = 0;
        int temp = x;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return reverse == x;

    }

}
