package learn.offer;


import java.util.*;

/**
 * 求数数组中最小的k个数
 */
public class Test30 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> resultList = new ArrayList<>();
        if (input.length == 0 || k == 0 || k > input.length) {
            return resultList;
        }
        /**
         * 建立最大堆，重写compare方法
         */
        Queue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < k; i++) {
            maxHeap.add(input[i]);
        }
        int le = input.length;
        for (int j = k; j < le; j++) {
            if (maxHeap.peek() > input[j]) {
                maxHeap.poll();
                maxHeap.add(input[j]);
            }
        }
        //resultList = new ArrayList<Integer>(maxHeap);
        for (Integer x : maxHeap) {
            resultList.add(x);
        }
        return resultList;


    }
}
