package learn.leetCode;

import java.util.Arrays;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年05月17日 12:40
 */
public class Question137 {

    public static void main(String[] args) {
        int[] num = new int[]{-19,-46,-19,-46,-9,-9,-19,17,17,17,-13,-13,-9,-13,-46,-28};
        System.out.println(singleNumber(num));

    }

    public static int singleNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        // 排序
        Arrays.sort(nums);
        int count = 0;
        while (count < nums.length - 1) {
            if (nums[count] == nums[count + 1]) {
                count  += 3;
            } else {
                return nums[count];
            }
        }
        return nums[nums.length - 1];
    }
}
