package dayThree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liangxuanhao
 * @date 2018年04月29日  15:57
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] nums =new int[]{2,7,11,12};
        int target = 9;
//        twoSum(nums, target);

        int[] s = twoSums(nums, target);

        for(int i = 0;i < s.length;i++) {
            System.out.println(s[i]);
        }
    }

    public static void twoSum(int[] nums, int target) {
        int i=0;
        int length=nums.length-1;
        int mid=nums[i]+nums[length];
        while(i<length){
            if(mid==target){
                System.out.println(i);
                System.out.println(length);
                i++;
                length--;

            } else if(mid>target){
                length--;
            } else {
                i++;
            }
            mid=nums[i]+nums[length];
        }
    }

    public static int[] twoSums(int[] nums, int target) {
        //创建一下数组，要存两个index的数组。
        int[] result = new int[2];
        //这里用hashtable也行，看心情。
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //扫一遍数组，一边扫一边存
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            //这里搞出来个差值，其实差值是在没找到之后添加到map里面的。
            int toFind = target - cur;
            //如果发现之前需要这个差值，那就找index。
            if(map.containsKey(cur)){
                result[0] = map.get(cur);
                result[1] = i;
                return result;
            }
            //如果没有，就put到map里面
            else{
                map.put(toFind, i);
            }
        }
        return result;
    }
}
