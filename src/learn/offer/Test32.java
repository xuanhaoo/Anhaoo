package learn.offer;


/**
 * 从1到n的整数中1出现的次数
 * 输入一个整数
 */
public class Test32 {

    public static int NumberOf1Between1AndN_Solution(int n) {

        int count = 0;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            stringBuffer.append(i);
        }
        int sl = stringBuffer.length();
        for (int j = 0; j < sl; j++) {
            if (stringBuffer.charAt(j) == '1') {
                count++;
            }
        }
        return count;
    }
}
