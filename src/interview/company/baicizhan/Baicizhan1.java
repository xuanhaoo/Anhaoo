package interview.company.baicizhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baicizhan1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        countCharNum(str);


    }

    private static void countCharNum(String s) {

        if ("".equals(s) || s.length() == 0 || s.length() > 100) {
            return ;
        }
        int le = s.length();
        List<String> list = new ArrayList<>();
        loop1 : for (int i = 0; i < le; i++) {
            int count = 0;
            char tmp = s.charAt(i);
            loop2 : for (int j = i; j < le; j++) {
                char tmp2 = s.charAt(j);
                if (tmp == tmp2) {
                    count++;
                } else {
                    i = j - 1;
                    break loop2;
                }
                i++;
            }
            String t;
            if (count == 1) {
                t = Character.toString(tmp);
            } else {
                t = Character.toString(tmp) + String.valueOf(count);
            }
            list.add(t);
        }
        for (String x : list) {
            System.out.print(x);
        }
        // 用于存储a-z出现的次数
//        int[] nums = new int[26];
//        for (char i : s.toCharArray())
//        {
//            // 在字母的范围内
//            if (i >= 97 && i <= 123)
//            {
//                // 在其对应的索引位进行累加就可以了
//                nums[i - 97]++;
//            }
//        }
//        for (int i = 0; i < nums.length; i++)
//        {
//            // 只显示出现的
//            if (nums[i] != 0)
//            {
//                System.out.println((char) (97 + i) + ":" + nums[i]);
//            }
//        }



    }
}
