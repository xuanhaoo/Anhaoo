package learn.offer;


import java.util.Arrays;

/**
 * 扑克牌顺子
 */
public class Test44 {
    public static void main(String[] args) {

    }

    public boolean isContinuous(int [] numbers) {
        if (numbers == null || numbers.length != 5) {
            return false;
        }
        // 先排个序
        Arrays.sort(numbers);
        // 5,6,6,8,9
        boolean result;
        int le = numbers.length;
        int count = 0; // 统计大王小王
        for (int i = 0; i < 5; i++) {
            if (numbers[i] == 0) {
                count++;
            }
        }
        int p1 = count;
        int p2 = count + 1;
        int index = 0;
        while (p2 < le) {
            // 有对子直接返回false
            if (numbers[p1] == numbers[p2]) {
                return false;
            }
            index += numbers[p2] - numbers[p1] - 1;
            p1 = p2;
            p2++;
        }
        result = count >= index ? true : false;
        return result;
    }
}
