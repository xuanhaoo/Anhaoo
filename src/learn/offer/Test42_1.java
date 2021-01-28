package learn.offer;

/**
 * 左旋字符串
 */
public class Test42_1 {

    public static void main(String[] args) {

    }
    public String LeftRotateString(String str,int n) {
        if (str.trim().length() == 0 || n == 0) {
            return str;
        }
        String s1 = str.substring(0, n);
        String s2 = str.substring(n, str.length());
        String result = s2 + s1;
        return result;
    }

}
