package learn.leetCode;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年11月23日 09:57
 */
public class Question28 {


    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() == 0) {
            return  -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        int l2 = needle.length();
        int start = haystack.indexOf(needle);
        return start;
    }
}
