package dayTwo;

import java.util.Scanner;

/**
 * 分解质因数：90 = 2 * 3 * 3 * 5
 * @author liangxuanhao
 * @date 2018年04月24日  10:47
 */
public class Fenjie {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int n = scanner.nextInt();
        System.out.print("分解质因数："+ n + "=");
        fenjieNum(n);
    }

    /**
     *
     * @param n
     */
    public static void fenjieNum(int n) {

        for(int k = 2;k <= n;k++) {
            //从最小的数2开始分解，如果能除尽，说明是一个因子
            if(n % k == 0) {
                System.out.print(k);

                //代表还未被自身整除
                if(n != k) {
                    System.out.print("*");
                }
                //递归分解 90 / 2 = 45
                fenjieNum(n/k);
            }
        }
        System.exit(0);//退出

    }
}
