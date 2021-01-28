package interview.company.Bytedance;

import java.util.*;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2019年03月14 13:46
 */
public class Test21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {
            array[i] = scanner.nextInt();
        }

        int search = scanner.nextInt();
        int[] result = new int[search];
        int indexTmp = 0;
        while (search > 0) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int index = scanner.nextInt();
            int count = 0;
            if (array[start - 1] <= index && array[end - 1] >= index) {
                int left = start - 1;
                int right = end - 1;
                while (left < m && right > 0) {
                    if (array[left] < index) {
                        left++;
                    }if (array[right] > index) {
                        right--;
                    }
                    if (array[left] == index && array[right] == index) {
                        count = right - left + 1;
                        break;
                    }
                }
            }
            result[indexTmp] = count;
            indexTmp++;
            search--;

        }

        for (int h = 0; h < result.length; h++) {
            System.out.println(result[h]);
        }


//        Map<Integer, List<Integer>> map = new HashMap<>();
//
//        for (int i = 0; i < m; i++) {
//            int index = i + 1;
//            int numRate = scanner.nextInt();
//            List<Integer> tmp = new ArrayList<>();
//            if (map.containsKey(numRate)) {
//                tmp = map.get(numRate);
//                tmp.add(index);
//            } else {
//                tmp = new ArrayList<>();
//                tmp.add(index);
//            }
//            map.put(numRate, tmp);
//        }
//
//        int search = scanner.nextInt();
//        List<Integer> result = new ArrayList<>();
//        while (search > 0) {
//            int start = scanner.nextInt();
//            int end = scanner.nextInt();
//            int rate = scanner.nextInt();
//            int count = 0;
//            List<Integer> listTmp = map.get(rate);
//            for (Integer e : listTmp) {
//                if (e >= start && e <= end) {
//                    count++;
//                }
//            }
//            result.add(count);
//            search--;
//        }
//
//        for (Integer xx : result) {
//            System.out.println(xx);
//        }

    }

}
