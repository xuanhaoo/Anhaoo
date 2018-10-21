package offer;

/**
 * @author liangxuanhao
 * @date 2018年07月08日  23:11
 */
public class Test08 {

    public static void main(String[] args) {

        // 典型输入，单调升序的数组的一个旋转
        int[] array1 = {3, 4, 5, 1, 2};
        System.out.println(min(array1));

        // 有重复数字，并且重复的数字刚好的最小的数字
        int[] array2 = {3, 4, 5, 1, 1, 2};
        System.out.println(min(array2));

        // 有重复数字，但重复的数字不是第一个数字和最后一个数字
        int[] array3 = {3, 4, 5, 1, 2, 2};
        System.out.println(min(array3));

        // 有重复的数字，并且重复的数字刚好是第一个数字和最后一个数字
        int[] array4 = {1, 0, 1, 1, 1};
        System.out.println(min(array4));

        // 单调升序数组，旋转0个元素，也就是单调升序数组本身
        int[] array5 = {1, 2, 3, 4, 5};
        System.out.println(min(array5));

        // 数组中只有一个数字
        int[] array6 = {2};
        System.out.println(min(array6));

    }

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾， 我们称之数组的旋转。
     * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3, 4, 5, 1, 2｝为｛l ,2, 3, 4, 5}的一个旋转，该数组的最小值为
     * @param arr
     * @return
     */
    public static int min(int arr[]) {
        if(arr == null || arr.length == 0) {
            throw new RuntimeException("Invalid input");
        }

        int low = 0;
        int high = arr.length - 1;
        int mid = low;

        while(arr[low] >= arr[high]) {

            //如果左右指针已经靠近了，则高的是最小数
            if(high - low == 1) {
                return arr[high];
            }

            mid = (low + high) / 2;
            //如果3个值相等，则进行排序找出最小值
            if(arr[low] == arr[mid] && arr[mid] == arr[high]) {
                return finMin(arr, low, high);
            }
            //中间位置在前一个排好序的位置
            if(arr[low] <= arr[mid]) {
                low = mid;
            }
            //中间位置在后一个排好序的位置
            if(arr[mid] <= arr[high]) {
                high = mid;
            }




        }
        return arr[mid];
    }


    /**
     * 寻找出最小的数
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public static int finMin(int arr[], int start, int end) {

        int result = arr[start];
        for(int i = start + 1; i <= end;i++) {
            if(result > arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }
}
