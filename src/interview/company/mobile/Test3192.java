package interview.company.mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2019年03月19 12:59
 */
public class Test3192 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String subStr = s.substring(1, s.length() - 3);
        String[] arrTemp = subStr.split(",");
        String keyTmp = s.substring(s.length() - 1, s.length());
        int key = Integer.valueOf(keyTmp);


        int le = arrTemp.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < le; i++) {
            list.add(Integer.valueOf(arrTemp[i]));
        }

        int result = search(list, key);
        System.out.println(result);
    }


    public static int search (List<Integer> list, int key) {
        if (list.isEmpty() || !list.contains(key)) {
            return -1;
        }
        int le = list.size();
        int[] arr = new int[le];
        int i = 0;
        for (Integer x : list) {
            arr[i] = x;
            i++;
        }

        int left = 0;
        int right = le - 1;
        while (left < right) {
            int middle = (left + right) / 2;

            if (left < right && arr[middle] < key) {
                left++;
            }
            if (left < right && arr[middle] > key) {
                right--;
            }

            if (arr[middle] == key) {
                int tmp = middle;
                while (tmp >=left && arr[tmp] == key) {
                    tmp--;
                }
                return tmp+1;
            }

        }
        return -1;

    }
}
