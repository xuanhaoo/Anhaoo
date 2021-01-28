package learn.leetCode;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年11月21日 09:21
 */
public class Question5 {


    public static void main(String[] args) {

        System.out.println(longestPalindrome("cbbd"));
    }


    /**
     * 最长的回文子串
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        if (s.length() == 0) {
            return null;
        }
        // 中心扩散法
        int n = s.length();
        int left = 0;
        int right = 0;
        int len = 1;
        int maxStart = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            left = i - 1;
            right = i + 1;
            // 左边扩展
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                len++;
                left--;
            }
            while (right < n && s.charAt(right) == s.charAt(i)) {
                len++;
                right++;
            }
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                len = len + 2;
                left--;
                right++;
            }
            if (len > maxLen) {
                maxLen = len;
                maxStart = left;
            }
            // 重置len
            len = 1;
        }
        return s.substring(maxStart + 1, maxStart + maxLen + 1);
    }


    /**
     * 动态规划的方法:目的是减少重复的计算过程
     * @param s
     * @return
     */
    public static String longestPalindrome2(String s) {
        // 长度小于2直接返回
        if (s == null || s.length() <=2 ) {
            return s;
        }
        int n = s.length();
        int maxStart = 0;
        int maxEnd = 0;
        int maxLen = 0;
        // arr[i][j] = true表示该位置两个数相同
        boolean[][] arr = new boolean[n][n];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i ;j++) {
                // 回文数条件
                if (s.charAt(i) == s.charAt(j) && (i - j > 2 || arr[i - 1][j - 1])) {
                    // 是回文数
                    arr[i][j] = true;
                    if (maxLen < j - i + 1) {
                        maxStart = j;
                        maxEnd = i;
                        maxLen = maxEnd - maxStart + 1;
                    }
                }
            }
        }

        return s.substring(maxStart, maxEnd + 1);
    }
}
