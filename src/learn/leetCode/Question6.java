package learn.leetCode;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2020年11月21日 16:39
 */
public class Question6 {


    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }


    /**
     * 变换N字形
     * @param s
     * @param numRows
     * @return
     */
    public static String convert(String s, int numRows) {

        if (s.length() == 0 || s.length() == 1 || numRows == 1) {
            return s;
        }
        int n = s.length();
        // 按行存储
        StringBuilder[] stringBuilder = new StringBuilder[numRows];
        for (int k = 0; k < numRows; k++) {
            stringBuilder[k] = new StringBuilder("");
        }
        // 通过flag来控制方向，1向下，0向上
        int flag = 1;
        int idx = 0;
        for (int i = 0 ; i < n; i++) {
            char tmp = s.charAt(i);
            stringBuilder[idx].append(tmp);

            idx = flag == 1 ? idx + 1 : idx - 1;
            // 反向
            if (idx >= numRows || idx < 0) {
                // 用int flag是为了反向
                flag = 1 - flag;
                // 2的原因是反向后要往下走，而不是当前的
                idx = (idx == numRows) ? idx - 2 : idx + 2;
            }
        }

        String result = "";
        for (int j = 0; j < numRows; j++) {
            result = result + stringBuilder[j].toString();
        }
        return result;
    }
}
