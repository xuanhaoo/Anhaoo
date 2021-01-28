package learn.leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年07月05日 08:58
 */
public class Question13 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s  = scanner.next();
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {

        Map<Character, Integer> maps = new HashMap<>();
        maps.put('I', 1);
        maps.put('V', 5);
        maps.put('X', 10);
        maps.put('L', 50);
        maps.put('C',100);
        maps.put('D', 500);
        maps.put('M', 1000);
        int le = s.length();
        int result = 0;
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length - 1;i++) {
            if (str[i] == 'I' && (str[i+1] == 'V' || str[i+1] == 'X')) {
                result = result - 1;
            } else if (str[i] == 'X' && (str[i+1] == 'L' || str[i+1] == 'C')) {
                result = result - 10;
            } else if (str[i] == 'C' && (str[i+1] == 'D' || str[i+1] == 'M')) {
                result = result - 100;
            } else {
                result = result + maps.get(str[i]);
            }
        }
        result = result + maps.get(str[str.length - 1]);
        if (result < 1 || result > 3999) {
            return 0;
        }
        return result;
    }
}
