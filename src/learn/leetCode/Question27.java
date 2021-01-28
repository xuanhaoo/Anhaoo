package learn.leetCode;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年07月08日 10:20
 */
public class Question27 {

    public static void main(String[] args) {
        int[] x = new int[]{3,2,2,3};
        int re = removeElement(x, 3);

        System.out.println(re);
        for (int i = 0; i < re;i++) {
            System.out.print(x[i]+" ");
        }

    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        // [3,2,2,3]
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                // j++ 先运算 j再自增
                nums[j++] = nums[i];
            }
            i++;
        }
        return j;

    }
}
