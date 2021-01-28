package learn.leetCode;

import java.util.Scanner;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年07月07日 14:04
 */
public class Question26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[]{0,0,1,1,1,2,2,3,3,4};
        int re = removeDuplicates(x);
        System.out.println(re);
        for (int i = 0; i < re;i++) {
            System.out.print(x[i]+" ");
        }

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int le = nums.length;
        int i = 0;
        int j = 1;
        // [1,1,3]  [0,0,1,1,1,2,2,3,3,4]
        while (j < le) {
            if (nums[i] != nums[j]) {
                // ++i 先加1
                nums[++i] = nums[j];
            }
            j++;
        }
        return ++i;
    }
}
