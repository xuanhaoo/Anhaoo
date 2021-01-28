package learn.offer;

/**
 * 翻转单词顺序
 */
public class Test42_2 {

    public static void main(String[] args) {

    }

    public String ReverseSentence(String str) {
        if (str.trim().length() == 0) {
            return str;
        }
        // 分割成数组，把每个数组
        String[] sArr = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = sArr.length - 1; i >= 0; i--) {
            if (i != 0) {
                stringBuilder.append(sArr[i]).append(" ");
            } else {
                stringBuilder.append(sArr[i]);
            }
        }

        return stringBuilder.toString();
    }
}
