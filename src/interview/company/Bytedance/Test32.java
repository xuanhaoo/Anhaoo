package interview.company.Bytedance;

import java.util.*;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2019年03月16 08:53
 */
public class Test32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            list.add(s);
        }
        List<String> result = new ArrayList<>();
        for (String tmp : list) {
            String tt = charIndex(tmp);
            result.add(tt);
        }
        for (String x : result) {
            System.out.println(x);
        }
        
    }

    public static String charIndex(String s1) {
        int le = s1.length();
        if (le < 4) {
            return s1;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int p1 = 0;
        int p2 = 2;

        while (p1 < le - 1 && p2 < le - 1) {
            int count1 = 0;
            int count2 = 0;

            if (s1.charAt(p1) == s1.charAt(p1+1)) {
                count1 = 2;
            }
            if (s1.charAt(p2) == s1.charAt(p2+1)) {
                count2 = 2;
            }
            if (count1 == count2) {
                stringBuffer.append(s1.charAt(p1));
                stringBuffer.append(s1.charAt(p1 + 1));
                stringBuffer.append(s1.charAt(p2 + 1));
                p1 = p1 + 2;
                p2 = p2 + 2;
            }else {
                stringBuffer.append(s1.charAt(p1+1));
                stringBuffer.append(s1.charAt(p2+1));
                p1++;
                p2++;
            }

        }
        return stringBuffer.toString();
    }
}
