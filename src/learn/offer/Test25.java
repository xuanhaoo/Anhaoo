package learn.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @title:
 * @Description: 输入一个字符串，输出该字符串的全排列
 * @Author: liangxuanhao
 * @Date: 2018-12-11 10:54
 */
public class Test25 {

    static List<String> result = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        sort(s);
        for (String x : result) {
            System.out.println(x);
        }

    }

    private static void sort(String str) {
        if (null == str) {
            return ;
        }
        allDisplayStr(str.toCharArray(), 0);
    }

    private static void allDisplayStr(char[] str, int index) {
        int le = str.length;
        if (index > str.length) {
            return ;
        }
        // 当递归到最后，直接就添加了
        if (index == le - 1) {
            result.add(String.valueOf(str));
        } else {
            for (int i = index; i < le; i++) {
                // 判断相同字符情况
                if (i != index && str[i] == str[index]) {
                    continue;
                }
                swap(str, index, i);
                allDisplayStr(str, index + 1);  // 不断压入栈的操作，当最后不能再继续递归了，就一层一层往上执行
                swap(str, index, i);        // 当递归出栈操作时
            }
        }
    }
    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

