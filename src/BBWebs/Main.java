package BBWebs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // 已经签到的天数索引
        int[] array = {1,2,4};
        // 计算当前天索引
        int currentDayIndex = 7;
        int count = judgeContinueDay(array, currentDayIndex);
        System.out.println(count);
    }

    public static int judgeContinueDay(int[] array, int currentDayIndex) {
        // 一天也没有签到
        if (array.length == 0) {
            return 0;
        }
        /**
         *
         */
        // 先进行排序，从小到大
        Arrays.sort(array);
        // 通过binarySearch方法查找是否存在，使用此方法前确保数组已排序
        int index1 = Arrays.binarySearch(array, currentDayIndex);
        int index2 = Arrays.binarySearch(array, currentDayIndex - 1);
        int tmpIndex;
        // binarySearch 方法的返回值
        if (index1 < 0 && index2 < 0) {
            return 0;
        } else if (index1 < 0) {
            tmpIndex = index2;
        } else {
            tmpIndex = index1;
        }
        int count = 1;
        // 从找到的索引往前查找，如果断开了则不连续
        for (int i = tmpIndex; i > 0; i--) {
            if (array[i] - 1 == array[i - 1]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
