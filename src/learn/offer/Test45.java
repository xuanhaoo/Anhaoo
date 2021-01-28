package learn.offer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 圆圈中最后剩下的数
 */
public class Test45 {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>();
        li.add(3);
        li.add(4);
//        System.out.println(li.get(0));
    }
    public int LastRemaining_Solution(int n, int m) {
        // 将0 - n-1数中的 删除第m个数
        if (n < 1 || m < 1 || m > n + 1) {
            return -1;
        }
        // n = 5, m = 3
        // 0,1,2,3,4
        // 3,4,0,1   del 2  (-1 + 3) % 5
        // 1,3,4     del 0  (2-1 + 3) % 4
        // 1,3       del 1  (-1 + 3) % 3
        // 3
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        // 第m个元素，m-1
        int index = -1;
        // 只需要剩下最后一个元素
        while (linkedList.size() > 1) {
            index = (index + m) % linkedList.size();
            linkedList.remove(index);
            index--;
        }
        int result = -1;
        if (linkedList.size() > 0) {
            result = linkedList.get(0);
        }
        return result;
    }
}
