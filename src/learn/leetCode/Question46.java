package learn.leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年11月24日 10:26
 */
public class Question46 {


    public static void main(String[] args) {

    }

    /**
     * 全排列
     * @param nums
     * @return
     */
    public static List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        // 全排列结果集
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> cur = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            cur.add(nums[i]);
        }
        // 回溯算法

    }

    private static void backtrack(List<List<Integer>> res, List<Integer> output, int n, int first) {
        if (first == n) {
            res.add(output);
        }
        for (int i = first; i < n; i++) {
            Collections.swap(output, first, i);
            backtrack(res, output, n, first);
            Collections.swap(output, first, i);
        }
    }

}
