package company.youzan;

import java.util.*;

public class Youzan301 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String tmpStr = str.substring(1, str.length() - 1);
        String[] strArr = tmpStr.split(",");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int n : intArr) {
//            if (map.containsKey(n)) {
//                map.put(n, map.get(n) + 1);
//            } else {
//                map.put(n, 1);
//            }
//        }
//        Collection<Integer> co = map.values();
//        int max = Collections.max(co);
//        int maxNum = 0;
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (max == entry.getValue()) {
//                if (max > intArr.length/2) {
//                    maxNum = entry.getValue();
//                }
//            }
//        }
        int[] count = new int[intArr.length];

        for(int i = 0;i < intArr.length;i++){
            for(int j = 0;j < intArr.length;j++){
                if(intArr[i] == intArr[j]){
                    count[i]++;
                }
            }
        }
        int max = 0;
        int s = 0;
        for(int i = 0;i < intArr.length;i++){
            if(max <= count[i]){
                max = count[i];
                s = intArr[i];
            }

        }

        System.out.println(s);
    }
}
