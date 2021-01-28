package learn.offer;


/**
 * 连续子数组的最大和
 * ex：{1,-2,3,10,-4,7,2,-5} 最大子数组{3,10,-4,7,2,}
 */
public class Test31 {

    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int le = array.length;
        int max = array[0];
        int cur = array[0];
        for (int i = 1; i < le; i++) {
            cur = cur > 0 ? cur + array[i] : array[i];
            if (max < cur) {
                max = cur;
            }
        }
        return max;
    }
}
