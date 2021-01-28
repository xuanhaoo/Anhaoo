package interview.company.Bytedance;

import java.util.Scanner;

/**
 * @Author: liangxuanhao
 * @Description:
 * @Date: 2019年03月16 08:53
 */
public class Test31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        // 1 4 16 64
        if (n < 0 || n > 1024) {
            System.out.println(-1);
        }
        int index = 1024 - n;
        int count = 0;
        int result = 0;
        // 多少个4
        count = index / 4;
        int x = count;

        // 4444444444444444
        int tmp = index % 4;  // 1的硬币数
        int tm2 = count / 3;
        count = count % 3;
        int tm3 = count / 2;
        count = count % 2;
        result = tm2 + tm3 + tmp + count;


//        int tmp2 = count / 64;  // 64
//        count = count % 64;
//        int tmp3 = count / 16; // 16
//        int tmp4 = count % 16; // 4
//
//        result = tmp + tmp2 + tmp3 + tmp4;
        System.out.println(result);
    }
}
