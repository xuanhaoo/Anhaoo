package interview.company.mobile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2019年03月19 12:59
 */
public class Test3191 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String s = scanner.next();
        String[] arr = s.split(",");
        int le = arr.length;
        for (int i = 0; i < le;i++) {
            list.add(Integer.valueOf(arr[i]));
        }
        foo(list);

    }

    public static void foo (List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer x : list) {
            if (x % 2 != 0) {
                result.add(x);
            }
        }
        int le = result.size();
        for (int i = 0; i < le; i++) {
            if (i != le - 1) {
                System.out.print(result.get(i) + ",");
            } else {
                System.out.println(result.get(i));
            }

        }
    }
}
