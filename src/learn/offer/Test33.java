package learn.offer;


import java.util.Arrays;
import java.util.Comparator;

/**
 * 把数组排成最小的数：{3,32,321}  321323
 */
public class Test33 {

    public String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        int le = numbers.length;
        String[] strings = new String[le];
        for (int i = 0; i < le; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2; // 3 32
                String s2 = o2 + o1; // 32 3
                return s1.compareTo(s2); // 从小到大
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
        for (int j = 0; j < strings.length; j++) {
            stringBuffer.append(strings[j]);
        }
        return String.valueOf(stringBuffer);
    }
}
