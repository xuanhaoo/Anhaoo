package learn.day.dayOne;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Random ran = new Random();
        //int[] sort = { 34, 38, 49, 32, 7, 41, 42, 8, 34, 24 };
        int[] sort=new int[5];
        for (int i = 0; i < 5; i++) {
            sort[i] = ran.nextInt(50);
        }
        System.out.print("排序前的数组为");
        for (int i : sort) {
            System.out.print(i + " ");
        }


//        quickSort(sort, 0, sort.length - 1);
//        System.out.println("");
//        System.out.print("排序后的数组为");
//        for (int i : sort) {
//            System.out.print(i + " ");
//        }
        //insertSort(sort);
        insertSort2(sort);
//        selectSort(sort);
        //bubbleSort(sort);

    }


    /**
     * 交换函数
     * @param a
     * @param i
     * @param j
     */
    public static void swap(int[] a, int i, int j) {
        a[i] ^= a[j];
        a[j] ^= a[i];
        a[i] ^= a[j];

    }

    /**
     * 选择排序
     */
    public static void  selectSort(int[] a) {


        for(int i = 0; i < a.length-1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        System.out.println();
        for (int i:a) {
            System.out.print(i+ " ");
        }
    }


    /**
     * ，冒泡排序
     * @param a
     */
    public static void bubbleSort(int[] a) {


        int temp = 0;
        for (int i = 0;i < a.length-1;i++) {
            for (int j = 0;j < a.length - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println();
        for (int i:a) {
            System.out.print(i+ " ");
        }

    }


    /**
     * 快速排序
     * @param a
     * @param low
     * @param high
     */
    public static void quickSort(int[] a, int low, int high) {
        int pivotLoc = 0; //中心点
        if (low < high) {
            pivotLoc = partitionLoc(a, low, high);
            System.out.println();
            System.out.println(pivotLoc);
            quickSort(a, low, pivotLoc-1);
            quickSort(a, pivotLoc+1, high);
        }
    }


    private static int partitionLoc(int[] a, int low, int high) {
        int key = a[low];
        while(low < high) {
            while (low < high && a[high] >= key) {      //过滤掉比基准点大的
                high--;
            }
            a[low] = a[high]; //跳出while循环，如果说明比基准点小，调换
            while (low < high && a[low] <= key) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }


    /**
     * 直接插入排序
     * @param a
     */
    public static void insertSort(int[] a) {
        int temp = 0;
        for (int i = 1;i < a.length;i++) {
            temp = a[i];
            int j = i -1;
            while (j >= 0 && a[j] > temp) {
               a[j+1] = a[j];
               j--;
            }
            a[j+1] =temp;
        }

        System.out.println();
        for (int i:a) {
            System.out.print(i+ " ");
        }

    }

    public static void insertSort2(int[] a) {
        for (int i = 1; i < a.length;i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j-1]) {
//                    int tmp = a[j];
//                    a[j] = a[j-1];
//                    a[j-1] = tmp;
                    int tmp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = tmp;
                } else {
                    break;
                }
            }
        }
        System.out.println();
        for (int i:a) {
            System.out.print(i+ " ");
        }
    }


    /**
     * 归并排序
     */

    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = (left+right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void  merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int index = 0;
        while(i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                tmp[index++] = arr[i];
            } else {
                tmp[index++] = arr[j];
            }
        }
        while (i <= mid ) {
            tmp[index++] = arr[i];
        }
        while (j <= right) {
            tmp[index++] = arr[j];
        }
        for (int index2 = 0; index2 < tmp.length; index2++) {
            arr[index2 + left] = tmp[index2];
        }
    }
}
