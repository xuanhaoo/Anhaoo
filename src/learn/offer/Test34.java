package learn.offer;


/**
 * 丑数
 */
public class Test34 {

    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        /**
         * 既然丑数是只能被2,3,5整除的数，那么就从特殊丑数1开始往上乘，1，1*2,1*3,1*5,2*2,2*3,2*5,3*2,
         * 从每一项开始乘2,3,5循环，将其添加入数组，从小到大排序，第1500个。
         */
        int[] array = new int[index];
        array[0] = 1;
        int t1 = 0, t2 = 0, t3 = 0;
        for (int i = 1; i < index; i++) {
            array[i] = Math.min(array[t1] * 2, Math.min(array[t2] * 3, array[t3] * 5));
            if (array[i] == array[t1] * 2) {
                t1++;   // t1指针控制乘2的
            }
            if (array[i] == array[t2] * 3) {
                t2++; // t2指针控制乘3的
            }
            if (array[i] == array[t3] * 5) {
                t3++; // t3指针控制乘5的
            }
        }
        return array[index - 1];
    }
}
