package learn.leetCode;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年07月05日 09:21
 */
public class Question14 {

    public static void main(String[] args) {
        String[] str = new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(str));
    }


    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char tmp = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++ ) {
                if (i >= strs[j].length() || strs[j].charAt(i) != tmp) {
                    return stringBuilder.equals(null) ? "": stringBuilder.toString();
                }
            }
            stringBuilder.append(strs[0].charAt(i));
        }
        return stringBuilder.toString();
    }
}
