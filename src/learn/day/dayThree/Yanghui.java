package learn.day.dayThree;

import java.util.Scanner;

/**
 * @author liangxuanhao
 * @date 2018年06月07日  19:38
 * 杨辉三角形
 * https://blog.csdn.net/gorilla574664557/article/details/45362291
 */
public class Yanghui {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入杨辉三角形的行数：");
        int n = scanner.nextInt();
        yanghui(n);
    }

    public static void yanghui(int n) {


        int num[][] = new int[n][n];//数组几层

        for(int i = 0;i < n;i++) { //层数

            for(int j = 0;j <= i;j++) {
                if(j == 0 || i == j) { //每层开头都为1，且结束时也为1
                    num[i][j] = 1;
                }else{
                    num[i][j] = num[i-1][j-1] + num[i-1][j];//递推
                }
            }
        }

        for(int m = 0;m < n;m++) {

            for(int h = m;h < n;h++) {
                System.out.print(" ");
            }
            for(int l = 0;l <= m;l++) {
                System.out.print(num[m][l]+" ");//不懂的可以把x替换成10，更加清楚点
            }
            System.out.println();
        }
    }
}
