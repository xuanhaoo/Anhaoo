package learn.offer;


/**
 * 数字在排序数组中出现的次数
 */
public class Test38 {

    public int GetNumberOfK(int [] array , int k) {

        if (array.length == 0) {
            return 0;
        }
        int le = array.length;
        int firstIndex = mergeFindStart(array, 0, le - 1, k, le);
        int lastIndex = mergeFindEnd(array, 0, le - 1, k, le);
        if (firstIndex == -1 || lastIndex == -1) {
            return 0;
        }
        return lastIndex - firstIndex + 1;
    }
    /**
     * 找到第一个开始的索引位置
     * @param array
     * @param start
     * @param end
     * @param k
     * @return
     */
    private static int mergeFindStart(int[] array, int start, int end, int k, int le) {
        if (start > end) {
            return  -1;
        }
        int mid = (start + end) / 2;
        int tmp = array[mid];
        // 二分后的中间值大于需要查找的值
        if (tmp > k) {
            end = mid - 1;
        } else if (tmp == k) {
            // mid == 0,这个条件很重要，数组元素为第一个开始就是
            if (mid > 0 && array[mid - 1] != k || mid == 0) {
                return mid; // 这一个索引的值就是第一个开始的索引位置
            } else {
                end = mid - 1;
            }
        } else { // 中间值小于需要查找的值
            start = mid + 1;
        }
        return mergeFindStart(array, start, end, k, le);
    }

    /**
     * 找到该数结束时的索引
     * @param array
     * @param start
     * @param end
     * @param k
     * @return
     */
    private static int mergeFindEnd(int[] array, int start, int end, int k, int le) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        int tmp = array[mid];
        if (tmp > k) {
            end = mid - 1;
        } else if (tmp == k) {
            // mid < le - 1 与 array[mid + 1] != k 顺序重要
            if ((mid > 0 && mid < le - 1 && array[mid + 1] != k) || mid == le - 1) {
                return mid;
            } else {
                start = mid + 1;
            }
        } else {
            start = mid + 1;
        }
        return mergeFindEnd(array, start, end, k, le);
    }
}
