package learn.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @title: 顺时针遍历二维数组
 * @Description:
 * @Author: liangxuanhao
 * @Date: 2018-12-06 10:09
 */
public class Test20 {

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] arr = new int[m][n];
        int x = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = x;
                x++;
            }
        }
        System.out.println("原始的：");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("顺时针输出：");
        List<Integer> list = resetStart(arr);
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> resetStart(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        if (arr == null) {
            return null;
        }
        int m = arr.length;
        int n = 0;
        if (m > 0) {
            n = arr[0].length;
        } else {
            return list;
        }
        int start = 0;
        while (m > 2 * start && n > 2 * start) {
            printNum(arr, m, n, start, list);
            start++;
        }
        return list;
    }
    private static void printNum(int[][] arr, int row, int col, int start, List<Integer> list) {
        if (arr == null || row < 0 || col < 0) {
            return ;
        }
        int endX = row - start - 1;
        int endY = col - start -1;
        // 从左往右打印行
        for (int i = start; i <= endY; i++) {
            list.add(arr[start][i]);
        }
        // 从上至下:行为变量
        for (int j = start + 1; j <= endX; j++) {
            list.add(arr[j][endY]);
        }
        // 从右往左
        for (int m = endY - 1; m >= start; m--) {
            list.add(arr[endX][m]);
        }
        // 从下往上：注意临界条件需要-1
        for (int  n = endX - 1; n >= start + 1; n--) {
            list.add(arr[n][start]);
        }
    }
}
