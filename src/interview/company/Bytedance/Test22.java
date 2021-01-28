package interview.company.Bytedance;

import java.util.*;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2019年03月14 15:17
 */
public class Test22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int index = i + 1;
            int type = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int y = 0; y < type;y++) {
                int tmp = scanner.nextInt();
                list.add(tmp);
            }
            map.put(index, list);
        }
        int count = 0;
        for (int x = 1; x <= n; x++) {
            List<Integer> tm1 = new ArrayList<>();
            for (int o = x; o < m + x ; o++) {
                int tp = o;
                if (o > n) {
                     tp = o - n;
                }
                List<Integer> tt1 = map.get(tp);
                tm1.addAll(tt1);
            }
            Map<Integer, Integer> map1 = new HashMap<>();
            for (Integer e : tm1) {
                if (map1.containsKey(e)) {
                    count++;
                    break;
                } else {
                    map1.put(e, 1);
                }
            }
        }
        System.out.println(count);
    }
}
