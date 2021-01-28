package learn.day.dayTwo;

/**
 * 水仙花问题
 * @author liangxuanhao
 * @date 2018年04月24日  10:28
 */
public class Daffodil {

    public static void main(String[] args) {

        printDaffodil();
    }

    /**
     * 求水仙花数
     * 153 = 1*1*1 + 5*5*5 + 3*3*3
     */
    public static void printDaffodil() {

        for(int num = 100;num <= 999;num++) {
            int h = num / 100;
            int s = (num % 100) / 10;
            int g = num % 10;

            if(num == h*h*h + s*s*s + g*g*g) {
                System.out.println(num);
            }

        }
    }
}
