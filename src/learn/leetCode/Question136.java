package learn.leetCode;

/**
 * @Author: liangxuanhao
 * @Description: 两个元素只出现一次的数
 * @Date: 2020年05月17日 12:33
 */
public class Question136 {


    public static void main(String[] args) {
        int[] num = new int[]{4,1,2,1,2};

        System.out.println(singleNumber(num));
    }


    /**
     * 异或运算：（二进制）
     * 两个相同的数异或为0
     * 0与任何数异或为任何数
     * 不相同的数异或为1（二进制）
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;

    }


}
