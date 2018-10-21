package offer;

/**
 * @author liangxuanhao
 * @date 2018年07月07日  18:06
 */
public class findByTwoSplit {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,11};
        int key = 5;
        int position = findByRecure(arr,key,0,arr.length - 1);

        //int position = findByWhile(arr, key);

        if(position == -1){
            System.out.println("查找的是"+key+",序列中没有该数！");
        }else{
            System.out.println("查找的是"+key+",找到位置为："+position);
        }


    }


    /**
     * 二分查找通过循环（不使用递归）
     * @param arr
     * @param key
     * @return
     */
    public static int findByWhile(int arr[], int key) {

        int low = 0; //左移开始位置
        int high = arr.length - 1; //右移开始位置
        int middle = -1; //返回值,-1代表没有找到的返回值

        //判断条件
        if(arr.length <= 0 || arr[low] > key || arr[high] < key || low > high) {
            return -1;
        }
        while(low < high) {
            int mid = (low + high) / 2;
            if(arr[mid] < key) {
                low = mid + 1;
            }else if(arr[mid] > key) {
                high = mid - 1;
            }else {
                middle = mid;
            }
        }

        return middle;

    }

    /**
     * 递归实现二分查找
     * @param arr
     * @param key
     * @param low
     * @param high
     * @return
     */
    public static int findByRecure(int arr[], int key, int low, int high) {

        //判断条件
        if(arr.length <= 0 || arr[low] > key || arr[high] < key || low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
            if(arr[mid] < key) {
                findByRecure(arr, key, low + 1, high);
            }else if(arr[mid] > key) {
                findByRecure(arr, key, low, high - 1);
            }else {
                return mid;
            }

        return -1;

    }
}
