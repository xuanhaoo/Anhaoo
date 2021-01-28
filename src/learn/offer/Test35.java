package learn.offer;


import java.util.HashMap;
import java.util.Map;

/**
 * 第一个只出现一次的字符
 */
public class Test35 {


    public int FirstNotRepeatingChar(String str) {
        int index = 0;
        if (str == null ||str.length() == 0) {
            return -1;
        }
        char[] array = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int le = array.length;
        for (int i = 0; i < le; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        for (int j = 0; j < le; j++) {
            if (map.get(array[j]) == 1) {
                index = j;
                return index;
            }
        }
        return -1;
    }
}


