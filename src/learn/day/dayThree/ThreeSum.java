package learn.day.dayThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author liangxuanhao
 * @date 2018年05月03日  8:54
 */
public class ThreeSum {


    public static void main(String[] args) {

        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};

        List<List<Integer>> list = threeSumList(nums);

        for(int i = 0; i < list.size();i++) {
            System.out.println(list.get(i));
        }




    }

    public static List<List<Integer>> threeSumList(int[] nums) {

        //对数组排序
        Arrays.sort(nums);

        //存放结果
        List<List<Integer>> result = new ArrayList<>();




        for(int i = 0;i < nums.length;i++) {
            int cur = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            if(i > 0 && cur == nums[i - 1]) {
                continue;
            }

            while(left < right) {
                int temp = nums[left] + nums[right];
                if(temp > -1 * cur) {
                    right--;
                }else if(temp < -1 * cur) {
                    left++;
                }else {
                    List<Integer> list = new ArrayList<>();
                    list.add(cur);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    //添加进结果

                    result.add(list);
                    while(left + 1 < right && nums[left] == nums[left +1]) {
                        left++;
                    }
                    while(right -1 > left && nums[right] == nums[right -1]) {
                        right--;
                    }
                    left++;
                    right--;



                }
            }

        }

        return result;

    }
}
