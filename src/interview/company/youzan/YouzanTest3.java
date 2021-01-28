package interview.company.youzan;

import java.util.Scanner;

public class YouzanTest3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
//        int n = scanner.nextInt();
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = scanner.nextInt();
        }
        nge(nums);

    }

    private static void nge(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                for (int j = i + 1;j < length;j++) {
                    if (nums[i] < nums[j]) {
                        System.out.println(nums[j]);
                        break;
                    }
                    if (j == length - 1) {
                        System.out.println(-1);
                    }
                }
            } else {
                System.out.println(-1);
            }

        }

    }
}
