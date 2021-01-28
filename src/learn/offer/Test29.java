package learn.offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @title: 找出数组中出现次数超过一半的值
 * @Description:
 * @Author: liangxuanhao
 * @Date: 2018-12-11 14:57
 */
public class Test29 {

    public static void main(String[] args) {

//        int[] arr = {4,5,1,2,2,2,2,7,6,2,9,8,2,2,2,2};
//        System.out.println(arr.length);


        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

//        String tmpStr = str.substring(1, str.length() - 1);
        String[] strArr = str.split(",");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        halfNumByMap(intArr);
//        halfNumByMap(intArr);
    }

    /**
     * 既然该数字超过一半，那么数组排序后的中位数一定是出现次数一半的
     */
    private static void halfNumFind(int[] array) {
        if (array.length <= 0) {
            return ;
        }
        // 排序
        Arrays.sort(array);
        int le = array.length;
        int halfLe = le / 2;
        int count = 0;
        // 验证是否超过了一半
        for (int i = 0; i < le; i++) {
            if (array[i] == array[halfLe]) {
                count++;
            }
        }
        if (2 * count > le) {
            System.out.println(array[halfLe]);
        } else {
            System.out.println(0);
        }
    }

    /**
     * 通过map集合
     * @param array
     */
    private static void halfNumByMap(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        int le = array.length;

        for (int i = 0; i < le; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        // 遍历map集合
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() * 2 > le) {
                System.out.println(entry.getKey());
            }
        }


    }


}
