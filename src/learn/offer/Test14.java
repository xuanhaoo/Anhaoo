package learn.offer;

import java.util.Scanner;

/**
 * @title: 将整数数组中的奇数放置在前半部分，偶数放置在后半部分
 * @Description: 剑指offer14题
 * @Author: liangxuanhao
 * @Date: 2018-12-05 14:41
 */
public class Test14 {

    public static void main(String[] args) {
        /**int[] num = {1,2,3,4,5,6,7};
         int[] num2 = compareNum(num);
         for (int x : num2) {
         System.out.print(x + ",");
         }*/
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int[] num = new int[m];
        for (int i = 0; i < m; i++) {
            num[i] = scan.nextInt();
        }
        int[] num2 = compareNum(num);
        for (int x : num2) {
            System.out.print(x + ",");
        }


    }

    /**
     *
     * @param num
     */
    private static int[] compareNum(int[] num) {
        int left = 0;
        int right = num.length - 1;
        if (num == null || num.length == 0) {
            return null;
        }
        while (left < right) {
            if (left < right && num[left] % 2 != 0) {
                left++;
            }
            if (left < right && num[right] % 2 == 0) {
                right--;
            }
            int tmp = num[left];
            num[left] = num[right];
            num[right] = tmp;
            left++;
            right--;
        }
        return num;
    }

}
